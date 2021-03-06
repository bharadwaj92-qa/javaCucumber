package com.optum.icube.qc.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.optum.icube.atdd.util.WebDriverFactory;

public abstract class BasePage {

  protected WebDriver webDriver = WebDriverFactory.getWebDriver();
  protected Logger LOG = LoggerFactory.getLogger(this.getClass());

  public BasePage() {
    PageFactory.initElements(webDriver, this);
  }
  
//Explicit wait
  protected boolean waitForElementFrame(WebElement element,
                                        int seconds) {

    boolean displayedElement = false;
    WebDriverWait wait = new WebDriverWait(WebDriverFactory.getWebDriver(), seconds);
    try {
      wait.until(ExpectedConditions.visibilityOf(element));
      displayedElement = true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return displayedElement;
  }

  public WebElement waitForElementFrame(By element,
                                        int seconds) {

    WebElement webElement = (new WebDriverWait(WebDriverFactory.getWebDriver(), seconds)).until(ExpectedConditions.presenceOfElementLocated(element));

    return webElement;

  }

  /**
   * An expectation for the URL of the current page to contain specific text.
   *
   * @param fraction
   *          the fraction of the url that the page should be on
   * @return <code>true</code> when the URL contains the text
   */
  public ExpectedCondition<Boolean> urlChange(final String currentURL) {
    return new ExpectedCondition<Boolean>() {
      private String nextUrl = "";

      @Override
      public Boolean apply(WebDriver driver) {
        nextUrl = driver.getCurrentUrl();
        return nextUrl != null && !nextUrl.contains(currentURL);
      }

    };
  }

  /**
   * An expectation for the URL of the current page to contain specific text.
   *
   * @param fraction
   *          the fraction of the url that the page should be on
   * @return <code>true</code> when the URL contains the text
   */
  protected ExpectedCondition<Boolean> expectedURLs(final String... expectedURLs) {
    return new ExpectedCondition<Boolean>() {
      private String nextUrl = "";

      @Override
      public Boolean apply(WebDriver driver) {
        nextUrl = driver.getCurrentUrl();
        boolean matchFound = false;
        if (nextUrl != null) {
          for (String expectedURL : expectedURLs) {
            matchFound = nextUrl.contains(expectedURL);
            if (matchFound)
              break;
          }
        }
        return matchFound;
      }

    };
  }

  protected void selectDropdownByDisplaytext(WebElement dropDownElement,
                                             String optionText) {
    if (waitForElementFrame(dropDownElement, 3000)) {
      Select dropDown = new Select(dropDownElement);
      List<WebElement> options = dropDown.getOptions();
      for (WebElement option : options) {
        if (option.getText().equals(optionText)) {
          option.click();
          break;
        }
      }
    }
  }

  /***
   * This wait method will wait the until we get the AJAX Response and JqueryLoad
   * 
   */
  protected boolean waitForAjaxResponse() {

    WebDriverWait wait = new WebDriverWait(WebDriverFactory.getWebDriver(), 30);

    ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
      @Override
      public Boolean apply(WebDriver driver) {
        try {
          return ((Long)((JavascriptExecutor)WebDriverFactory.getWebDriver()).executeScript("return jQuery.active") == 0);
        } catch (Exception e) {
          LOG.info(e.getMessage());
          return true;
        }
      }
    };

    ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
      @Override
      public Boolean apply(WebDriver driver) {
        return ((JavascriptExecutor)WebDriverFactory.getWebDriver()).executeScript("return document.readyState").toString().equals("complete");
      }
    };

    return wait.until(jQueryLoad) && wait.until(jsLoad);
  }
  
  /***
   * 
   * @param element
   * @return true or false and checks the visibility of element
   */

  public Boolean waitForWebElement(WebElement element) {
    Boolean visibility = true;
    try {
      WebDriverWait WDwait = new WebDriverWait(WebDriverFactory.getWebDriver(), 30);
      WDwait.until(ExpectedConditions.visibilityOf(element));
    } catch (NoSuchElementException ne) {
      LOG.info(ne.getAdditionalInformation());
      return false;
    }
    return visibility;
  }
}
