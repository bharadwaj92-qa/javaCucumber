package com.optum.icube.qc.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/common/PE_login.feature", plugin = { "pretty", "html:target/atdd-report" }, glue = {
        "com.optum.icube.qc.stepdef" }, tags = {})
public class PEloginRunner {

}
