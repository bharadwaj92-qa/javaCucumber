package com.optum.icube.atdd.util;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverFactory {

  public static String senerioName;
  // ThreadLocal variable which contains the Sauce Job Id. It is used to report pass/fail to sauceLabs dashboard
  // TODO verify this
  private static ThreadLocal<String> SESSION_ID = new ThreadLocal<String>();

  private static ThreadLocal<WebDriver> WEB_DRIVER = new ThreadLocal<WebDriver>() {
    @Override
    public WebDriver initialValue() {
      try {
        return initDriver();
      } catch (Throwable e) {
        throw new RuntimeException(e);
      }
    }
  };

  private static WebDriver initDriver() throws Throwable {

    RemoteWebDriver webDriver = null;
    String browserMode = Config.getProperty("browser.mode");
    switch (browserMode) {
      case "local":
        webDriver = createLocalWebDriver();
        break;
      case "sauceLabs":
        webDriver = createSauceLabsWebDriver();
        break;
      default:
        break;
    }

    String appURL = Config.getProperty("appUrl");
    if (StringUtils.isEmpty(appURL)) {
      Assert.fail("Missing appURL property.  Check configuration and try again");
    }

    SESSION_ID.set(webDriver.getSessionId().toString());
    webDriver.manage().deleteAllCookies();
    webDriver.manage().window().maximize();
    webDriver.navigate().to(appURL);
    webDriver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);//Implicit wait

    return webDriver;
  }

  private static RemoteWebDriver createLocalWebDriver() {

    String browserName = Config.getProperty("browserName");

    RemoteWebDriver driver = null;
    switch (browserName) {
      case "chrome":
        driver = initChromeDriver();
        break;
      case "firefox":
        driver = initFirefoxDriver();
        break;
      case "ie":
        driver = initIEDriver();
        break;
    }
    return driver;
  }

  public static WebDriver getWebDriver() {
    return WEB_DRIVER.get();
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  private static DesiredCapabilities getBrowserCapabilities(String browserMode) {
    String browserName = Config.getProperty("browserName");
    Map<String, String> customBrowserCapabilitiesMap = new HashMap<String, String>((Map)Config.getPropertyGroup(browserMode + "." + browserName
            + ".capability"));
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities(customBrowserCapabilitiesMap);
    DesiredCapabilities browserCapabilities = null;
    switch (browserName) {
      case "firefox":
        browserCapabilities = DesiredCapabilities.firefox().merge(desiredCapabilities);
        break;
      case "ie":
        browserCapabilities = DesiredCapabilities.internetExplorer().merge(desiredCapabilities);
        break;
      case "chrome":
        browserCapabilities = DesiredCapabilities.chrome().merge(desiredCapabilities);
        break;
      default:
        break;
    }
    String testCaseDetails = "Test Execution in :" + Config.getProperty("PE_Environment") +"- Scenario : " + senerioName;
    browserCapabilities.setCapability("name", testCaseDetails);
    return browserCapabilities;
  }

  private static RemoteWebDriver createSauceLabsWebDriver() throws Exception {

    String sauceLabsUserName = Config.getProperty("sauceLabs.userName");
    String sauceLabsAccessToken = Config.getProperty("sauceLabs.accessToken");
    if (StringUtils.isEmpty(sauceLabsUserName) || StringUtils.isEmpty(sauceLabsAccessToken)) {
      Assert.fail("Missing value for environment variable(s) sauceLabs.userName or sauceLabs.accessToken.  Check environment configuration and try again");
    }
    String sauceLabsURL = String.format(Config.getProperty("sauceLabs.url"), sauceLabsUserName, sauceLabsAccessToken);
    RemoteWebDriver driver = new RemoteWebDriver(new URL(sauceLabsURL), getBrowserCapabilities("sauceLabs"));
    return driver;
  }

  // TODO check if we need driver exe
  // TODO check if we need to directly instantiate the special Driver class
  private static RemoteWebDriver initChromeDriver() {
    System.out.println("Launching Google Chrome with new profile..");
    // System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
    DesiredCapabilities additionalBrowserCapabilities = getBrowserCapabilities("local");
    RemoteWebDriver driver = new ChromeDriver(DesiredCapabilities.chrome().merge(additionalBrowserCapabilities));
    return driver;
  }

  private static RemoteWebDriver initFirefoxDriver() {
    System.out.println("Launching Firefox browser..");
    System.setProperty("webdriver.gecko.driver", Config.getProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/DEVTOOLS/geckodriver/geckodriver.exe"));
    DesiredCapabilities additionalBrowserCapabilities = getBrowserCapabilities("local");
    additionalBrowserCapabilities.setCapability("marionette", true);
    RemoteWebDriver driver = new FirefoxDriver(DesiredCapabilities.firefox().merge(additionalBrowserCapabilities));
    return driver;
  }

  // TODO check if we need driver
  private static RemoteWebDriver initIEDriver() {
    System.out.println("Launching IE browser..");
    System.setProperty("webdriver.ie.driver", Config.getProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/src/test/resources/DEVTOOLS/IEDriverServer/IEDriverServer.exe"));
    DesiredCapabilities additionalBrowserCapabilities = getBrowserCapabilities("local");
    RemoteWebDriver driver = new InternetExplorerDriver(DesiredCapabilities.internetExplorer().merge(additionalBrowserCapabilities));
    return driver;
  }

}
