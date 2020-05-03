$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TMASubmission.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Bharadwaj Nandiraju"
    },
    {
      "line": 2,
      "value": "#Email : bharadwaj_nandiraju@optum.com"
    }
  ],
  "line": 4,
  "name": "TMA form submission",
  "description": "\r\nIn order to allow a member to admit under a facility\r\nAs a Provider Express user\r\nI want the user to allow for the TMA form submission",
  "id": "tma-form-submission",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Verify TMA submission",
  "description": "",
  "id": "tma-form-submission;verify-tma-submission",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@TMA"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User logged into PE Application with Valid Credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Selects ReviewOnline",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "selects Request an initial authorization for admission radio",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "selects Member Search tab",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "enters \"\u003cMemberId\u003e\" and First Name \"\u003cFirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click Proceed to Step two button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select a dropdown value from the Facility Address dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click Proceed to Step three button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user will be in qualification page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "navigating to FIR by giving  Member Admitted \"\u003cMemberAdmitted\u003e\" select Admit Date \"\u003cAdmitDate\u003e\" and diagnosis \"\u003cPrimaryDiag\u003e\" and select the dropdown based on \"\u003cDescription\u003e\" and Involuntary admission \"\u003cInvoluntaryAdmit\u003e\" and level of care being requested \"\u003cLoc\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click Proceed to Step four button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user will see TMA form",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "select the Attending MD details by clicking MD Search and Ennter \"\u003cURName\u003e\" and \"\u003cURPhone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "select benefit type as MH",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "click on attestation check box",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user clicks on Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user should see the Confirmation number",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "tma-form-submission;verify-tma-submission;",
  "rows": [
    {
      "cells": [
        "MemberId",
        "FirstName",
        "MemberAdmitted",
        "AdmitDate",
        "PrimaryDiag",
        "Description",
        "InvoluntaryAdmit",
        "Loc",
        "URName",
        "URPhone"
      ],
      "line": 34,
      "id": "tma-form-submission;verify-tma-submission;;1"
    },
    {
      "cells": [
        "007686605",
        "PAULA",
        "Yes",
        "11/19/2018",
        "F40.00-Agoraphobia",
        "F40.00-Agoraphobia",
        "NO",
        "Inpatient",
        "Raju",
        "7777777777777"
      ],
      "line": 35,
      "id": "tma-form-submission;verify-tma-submission;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 60317720,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Verify TMA submission",
  "description": "",
  "id": "tma-form-submission;verify-tma-submission;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@TMA"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User logged into PE Application with Valid Credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Selects ReviewOnline",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "selects Request an initial authorization for admission radio",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "selects Member Search tab",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "enters \"007686605\" and First Name \"PAULA\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click Proceed to Step two button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select a dropdown value from the Facility Address dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click Proceed to Step three button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user will be in qualification page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "navigating to FIR by giving  Member Admitted \"Yes\" select Admit Date \"11/19/2018\" and diagnosis \"F40.00-Agoraphobia\" and select the dropdown based on \"F40.00-Agoraphobia\" and Involuntary admission \"NO\" and level of care being requested \"Inpatient\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click Proceed to Step four button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user will see TMA form",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "select the Attending MD details by clicking MD Search and Ennter \"Raju\" and \"7777777777777\"",
  "matchedColumns": [
    8,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "select benefit type as MH",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "click on attestation check box",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user clicks on Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user should see the Confirmation number",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonLoginDefinition.login()"
});
formatter.result({
  "duration": 21009154215,
  "status": "passed"
});
formatter.match({
  "location": "NavigationPEQualificatio.selectMenuLink()"
});
formatter.result({
  "duration": 28615146810,
  "status": "passed"
});
formatter.match({
  "location": "NavigationPEQualificatio.selectAuthAdmitionRadio()"
});
formatter.result({
  "duration": 5357017650,
  "status": "passed"
});
formatter.match({
  "location": "NavigationPEQualificatio.goToNextPage()"
});
formatter.result({
  "duration": 28716,
  "status": "passed"
});
formatter.match({
  "location": "FIRnavigation.selectMemberSearchTab()"
});
formatter.result({
  "duration": 14194298255,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "007686605",
      "offset": 8
    },
    {
      "val": "PAULA",
      "offset": 35
    }
  ],
  "location": "FIRnavigation.searchByMemberIdAndFName(String,String)"
});
formatter.result({
  "duration": 145909114,
  "status": "passed"
});
formatter.match({
  "location": "FIRnavigation.proceedToStep2()"
});
formatter.result({
  "duration": 137903125,
  "status": "passed"
});
formatter.match({
  "location": "FIRnavigation.selectFacilityAddress()"
});
formatter.result({
  "duration": 17664949593,
  "status": "passed"
});
formatter.match({
  "location": "NavigationPEQualificatio.preceedToStep3()"
});
formatter.result({
  "duration": 252762571,
  "status": "passed"
});
formatter.match({
  "location": "TMASubmission.user_will_be_in_qualification_page()"
});
formatter.result({
  "duration": 57842,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 46
    },
    {
      "val": "11/19/2018",
      "offset": 70
    },
    {
      "val": "F40.00-Agoraphobia",
      "offset": 97
    },
    {
      "val": "F40.00-Agoraphobia",
      "offset": 151
    },
    {
      "val": "NO",
      "offset": 198
    },
    {
      "val": "Inpatient",
      "offset": 237
    }
  ],
  "location": "FIRnavigation.dataUnderQualifypage(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 18505764714,
  "status": "passed"
});
formatter.match({
  "location": "FIRnavigation.proceedToStep4()"
});
formatter.result({
  "duration": 61534,
  "status": "passed"
});
formatter.match({
  "location": "TMASubmission.user_will_see_TMA_form()"
});
formatter.result({
  "duration": 46766,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raju",
      "offset": 66
    },
    {
      "val": "7777777777777",
      "offset": 77
    }
  ],
  "location": "FIRProviderTab.TMASubmit(String,String)"
});
formatter.result({
  "duration": 21688620510,
  "status": "passed"
});
formatter.match({
  "location": "TMASubmission.select_BenefitType()"
});
formatter.result({
  "duration": 48817,
  "status": "passed"
});
formatter.match({
  "location": "TMASubmission.click_on_attestation_check_box()"
});
formatter.result({
  "duration": 53740,
  "status": "passed"
});
formatter.match({
  "location": "TMASubmission.user_clicks_on_Submit_button()"
});
formatter.result({
  "duration": 56611,
  "status": "passed"
});
formatter.match({
  "location": "TMASubmission.user_should_see_the_Confirmation_number()"
});
