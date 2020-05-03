$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/US617581_ PE TMA Navigation Qualification.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Shiva Sankara Rao"
    },
    {
      "line": 2,
      "value": "#Email : shivasankar_pabbu@optum.com"
    }
  ],
  "line": 4,
  "name": "PE TMA Navigation Qualification",
  "description": "when proceeding to Step 3 from Step 2, we should load ICUBE Qualification form instead of loading the PE qualification form.",
  "id": "pe-tma-navigation-qualification",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@TMA_QUALIFICATION"
    }
  ]
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Navigating to ICUBE Qualification page from Provider Express application.",
  "description": "",
  "id": "pe-tma-navigation-qualification;navigating-to-icube-qualification-page-from-provider-express-application.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@ICUBE_QUALIFICATION_MYPATIENT_TAB"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "click Proceed to Step two button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user sees member information",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user select facility address from drop down",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click Proceed to Step three button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user see ReviewOnline - Step three of four",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "pe-tma-navigation-qualification;navigating-to-icube-qualification-page-from-provider-express-application.;",
  "rows": [
    {
      "cells": [
        "memberid"
      ],
      "line": 26,
      "id": "pe-tma-navigation-qualification;navigating-to-icube-qualification-page-from-provider-express-application.;;1"
    },
    {
      "cells": [
        "316564646"
      ],
      "line": 27,
      "id": "pe-tma-navigation-qualification;navigating-to-icube-qualification-page-from-provider-express-application.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 311765,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "User logged into PE Application with Valid Credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Selects ReviewOnline",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "selects Request an initial authorization for admission radio",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "selects My patients tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user select radio button with corresponding \"\u003cmemberid\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "CommonLoginDefinition.user_logged_into_PE_Application_with_Valid_Credentials()"
});
formatter.result({
  "duration": 269133138,
  "error_message": "java.lang.RuntimeException: java.lang.ExceptionInInitializerError\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:29)\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:1)\r\n\tat java.lang.ThreadLocal.setInitialValue(ThreadLocal.java:180)\r\n\tat java.lang.ThreadLocal.get(ThreadLocal.java:170)\r\n\tat com.atdd.util.WebDriverFactory.getWebDriver(WebDriverFactory.java:83)\r\n\tat com.atdd.html.pages.BasePage.\u003cinit\u003e(BasePage.java:16)\r\n\tat com.atdd.html.pages.PELoginPage.\u003cinit\u003e(PELoginPage.java:18)\r\n\tat com.atdd.step.definitions.CommonLoginDefinition.user_logged_into_PE_Application_with_Valid_Credentials(CommonLoginDefinition.java:12)\r\n\tat ✽.Given User logged into PE Application with Valid Credentials(features/US617581_ PE TMA Navigation Qualification.feature:8)\r\nCaused by: java.lang.ExceptionInInitializerError\r\n\tat com.atdd.util.WebDriverFactory.initDriver(WebDriverFactory.java:37)\r\n\tat com.atdd.util.WebDriverFactory.access$0(WebDriverFactory.java:34)\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:27)\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:1)\r\n\tat java.lang.ThreadLocal.setInitialValue(ThreadLocal.java:180)\r\n\tat java.lang.ThreadLocal.get(ThreadLocal.java:170)\r\n\tat com.atdd.util.WebDriverFactory.getWebDriver(WebDriverFactory.java:83)\r\n\tat com.atdd.html.pages.BasePage.\u003cinit\u003e(BasePage.java:16)\r\n\tat com.atdd.html.pages.PELoginPage.\u003cinit\u003e(PELoginPage.java:18)\r\n\tat com.atdd.step.definitions.CommonLoginDefinition.user_logged_into_PE_Application_with_Valid_Credentials(CommonLoginDefinition.java:12)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.runBackground(CucumberScenario.java:59)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:42)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\nCaused by: java.lang.RuntimeException: java.io.FileNotFoundException: C:\\EMBI-WorkSpace\\atdd\\src\\test\\resources\\ICUBE\\src\\test\\resources\\ICUBE\\config.properties (The system cannot find the path specified)\r\n\tat com.atdd.util.Config.\u003cclinit\u003e(Config.java:37)\r\n\t... 67 more\r\nCaused by: java.io.FileNotFoundException: C:\\EMBI-WorkSpace\\atdd\\src\\test\\resources\\ICUBE\\src\\test\\resources\\ICUBE\\config.properties (The system cannot find the path specified)\r\n\tat java.io.FileInputStream.open0(Native Method)\r\n\tat java.io.FileInputStream.open(FileInputStream.java:195)\r\n\tat java.io.FileInputStream.\u003cinit\u003e(FileInputStream.java:138)\r\n\tat com.atdd.util.Config.\u003cclinit\u003e(Config.java:31)\r\n\t... 67 more\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TMAQualificationDefienitions.selects_ReviewOnline()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TMAQualificationDefienitions.selects_Request_an_initial_authorization_for_admission_radio()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TMAQualificationDefienitions.click_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TMAQualificationDefienitions.selects_My_patients_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cmemberid\u003e",
      "offset": 45
    }
  ],
  "location": "NavigationPEQualificatio.user_select_radio_button_with_corresponding(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 27,
  "name": "Navigating to ICUBE Qualification page from Provider Express application.",
  "description": "",
  "id": "pe-tma-navigation-qualification;navigating-to-icube-qualification-page-from-provider-express-application.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@ICUBE_QUALIFICATION_MYPATIENT_TAB"
    },
    {
      "line": 3,
      "name": "@TMA_QUALIFICATION"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "click Proceed to Step two button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user sees member information",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user select facility address from drop down",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click Proceed to Step three button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user see ReviewOnline - Step three of four",
  "keyword": "Then "
});
formatter.match({
  "location": "TMAQualificationDefienitions.click_Proceed_to_Step_two_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationPEQualificatio.user_sees_member_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationPEQualificatio.user_select_facility_address_from_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TMAQualificationDefienitions.click_Proceed_to_Step_three_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationPEQualificatio.user_see_ReviewOnline_Step_three_of_four()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 347864,
  "error_message": "java.lang.RuntimeException: java.lang.NoClassDefFoundError: Could not initialize class com.atdd.util.Config\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:29)\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:1)\r\n\tat java.lang.ThreadLocal.setInitialValue(ThreadLocal.java:180)\r\n\tat java.lang.ThreadLocal.get(ThreadLocal.java:170)\r\n\tat com.atdd.util.WebDriverFactory.getWebDriver(WebDriverFactory.java:83)\r\n\tat com.atdd.step.definitions.AtddHook.attachTheScreenShot(AtddHook.java:43)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\nCaused by: java.lang.NoClassDefFoundError: Could not initialize class com.atdd.util.Config\r\n\tat com.atdd.util.WebDriverFactory.initDriver(WebDriverFactory.java:37)\r\n\tat com.atdd.util.WebDriverFactory.access$0(WebDriverFactory.java:34)\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:27)\r\n\t... 60 more\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 30,
  "name": "Navigating to ICUBE Qualification page from Provider Express application.",
  "description": "",
  "id": "pe-tma-navigation-qualification;navigating-to-icube-qualification-page-from-provider-express-application.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@ICUBE_QUALIFICATION_MEMBERID_TAB"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "click Proceed to Step two button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user sees member information",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user select facility address from drop down",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "click Proceed to Step three button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user see ReviewOnline - Step three of four",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "pe-tma-navigation-qualification;navigating-to-icube-qualification-page-from-provider-express-application.;",
  "rows": [
    {
      "cells": [
        "memberid"
      ],
      "line": 39,
      "id": "pe-tma-navigation-qualification;navigating-to-icube-qualification-page-from-provider-express-application.;;1"
    },
    {
      "cells": [
        "316564646"
      ],
      "line": 40,
      "id": "pe-tma-navigation-qualification;navigating-to-icube-qualification-page-from-provider-express-application.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 77941,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "User logged into PE Application with Valid Credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Selects ReviewOnline",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "selects Request an initial authorization for admission radio",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "selects My patients tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user select radio button with corresponding \"\u003cmemberid\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "CommonLoginDefinition.user_logged_into_PE_Application_with_Valid_Credentials()"
});
formatter.result({
  "duration": 336788,
  "error_message": "java.lang.RuntimeException: java.lang.NoClassDefFoundError: Could not initialize class com.atdd.util.Config\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:29)\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:1)\r\n\tat java.lang.ThreadLocal.setInitialValue(ThreadLocal.java:180)\r\n\tat java.lang.ThreadLocal.get(ThreadLocal.java:170)\r\n\tat com.atdd.util.WebDriverFactory.getWebDriver(WebDriverFactory.java:83)\r\n\tat com.atdd.html.pages.BasePage.\u003cinit\u003e(BasePage.java:16)\r\n\tat com.atdd.html.pages.PELoginPage.\u003cinit\u003e(PELoginPage.java:18)\r\n\tat com.atdd.step.definitions.CommonLoginDefinition.user_logged_into_PE_Application_with_Valid_Credentials(CommonLoginDefinition.java:12)\r\n\tat ✽.Given User logged into PE Application with Valid Credentials(features/US617581_ PE TMA Navigation Qualification.feature:8)\r\nCaused by: java.lang.NoClassDefFoundError: Could not initialize class com.atdd.util.Config\r\n\tat com.atdd.util.WebDriverFactory.initDriver(WebDriverFactory.java:37)\r\n\tat com.atdd.util.WebDriverFactory.access$0(WebDriverFactory.java:34)\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:27)\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:1)\r\n\tat java.lang.ThreadLocal.setInitialValue(ThreadLocal.java:180)\r\n\tat java.lang.ThreadLocal.get(ThreadLocal.java:170)\r\n\tat com.atdd.util.WebDriverFactory.getWebDriver(WebDriverFactory.java:83)\r\n\tat com.atdd.html.pages.BasePage.\u003cinit\u003e(BasePage.java:16)\r\n\tat com.atdd.html.pages.PELoginPage.\u003cinit\u003e(PELoginPage.java:18)\r\n\tat com.atdd.step.definitions.CommonLoginDefinition.user_logged_into_PE_Application_with_Valid_Credentials(CommonLoginDefinition.java:12)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.runBackground(CucumberScenario.java:59)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:42)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TMAQualificationDefienitions.selects_ReviewOnline()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TMAQualificationDefienitions.selects_Request_an_initial_authorization_for_admission_radio()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TMAQualificationDefienitions.click_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TMAQualificationDefienitions.selects_My_patients_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cmemberid\u003e",
      "offset": 45
    }
  ],
  "location": "NavigationPEQualificatio.user_select_radio_button_with_corresponding(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 40,
  "name": "Navigating to ICUBE Qualification page from Provider Express application.",
  "description": "",
  "id": "pe-tma-navigation-qualification;navigating-to-icube-qualification-page-from-provider-express-application.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@ICUBE_QUALIFICATION_MEMBERID_TAB"
    },
    {
      "line": 3,
      "name": "@TMA_QUALIFICATION"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "click Proceed to Step two button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user sees member information",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user select facility address from drop down",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "click Proceed to Step three button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user see ReviewOnline - Step three of four",
  "keyword": "Then "
});
formatter.match({
  "location": "TMAQualificationDefienitions.click_Proceed_to_Step_two_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationPEQualificatio.user_sees_member_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationPEQualificatio.user_select_facility_address_from_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TMAQualificationDefienitions.click_Proceed_to_Step_three_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationPEQualificatio.user_see_ReviewOnline_Step_three_of_four()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 151370,
  "error_message": "java.lang.RuntimeException: java.lang.NoClassDefFoundError: Could not initialize class com.atdd.util.Config\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:29)\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:1)\r\n\tat java.lang.ThreadLocal.setInitialValue(ThreadLocal.java:180)\r\n\tat java.lang.ThreadLocal.get(ThreadLocal.java:170)\r\n\tat com.atdd.util.WebDriverFactory.getWebDriver(WebDriverFactory.java:83)\r\n\tat com.atdd.step.definitions.AtddHook.attachTheScreenShot(AtddHook.java:43)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\nCaused by: java.lang.NoClassDefFoundError: Could not initialize class com.atdd.util.Config\r\n\tat com.atdd.util.WebDriverFactory.initDriver(WebDriverFactory.java:37)\r\n\tat com.atdd.util.WebDriverFactory.access$0(WebDriverFactory.java:34)\r\n\tat com.atdd.util.WebDriverFactory$1.initialValue(WebDriverFactory.java:27)\r\n\t... 60 more\r\n",
  "status": "failed"
});
});