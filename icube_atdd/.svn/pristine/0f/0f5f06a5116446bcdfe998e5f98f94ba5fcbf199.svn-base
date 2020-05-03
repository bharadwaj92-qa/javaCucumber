package com.optum.icube.qc.stepdef;

import com.optum.icube.atdd.util.Config;
import com.optum.icube.qc.page.PELoginPage;

import cucumber.api.java.en.Given;

public class CommonLoginDefinition {

  @Given("^User logged into PE Application with Valid Credentials$")
  public void login() throws InterruptedException {
    new PELoginPage().doLogin(Config.getProperty("optumId"), Config.getProperty("password"));
  }

}
