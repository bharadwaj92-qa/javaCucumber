package com.optum.icube.qc.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/TMASubmission.feature", plugin = { "pretty", "html:target/atdd-report" }, glue = {
        "com.optum.icube.qc.stepdef" }, tags = {})
public class PETestRunnerStandalone {

	
	/*public class PETestRunner {
	@AfterSuite
	public static void test() {

	//Config.deleteFiles();
	Reporter.loadXMLConfig(new File("src/test/resources/report-config.xml"));
	Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	Reporter.setSystemInfo("Environment", "QA2");
	Reporter.setSystemInfo("user", System.getProperty("user.name"));
	Reporter.setSystemInfo("64 Bit", "Windows OS");
	Reporter.setTestRunnerOutput("Linx test runner output message");
*/
	
	

}	
	

