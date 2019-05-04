$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/SoftOnBoarding.feature");
formatter.feature({
  "line": 1,
  "name": "Soft On-Boarding process test",
  "description": "",
  "id": "soft-on-boarding-process-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "As a customer I want to open an access checking account",
  "description": "",
  "id": "soft-on-boarding-process-test;as-a-customer-i-want-to-open-an-access-checking-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@CreateNewAccount"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Iam on soft on-boarding page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I enter my \"\u003cfirstname\u003e\",  \"\u003clastname\u003e\", \"\u003cemailAddress\u003e\" and  \"\u003cphoneNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I check the terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Next button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should be taken to Add a saving account",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "soft-on-boarding-process-test;as-a-customer-i-want-to-open-an-access-checking-account;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "emailAddress",
        "phoneNumber"
      ],
      "line": 25,
      "id": "soft-on-boarding-process-test;as-a-customer-i-want-to-open-an-access-checking-account;;1"
    },
    {
      "cells": [
        "Test",
        "LastName Test",
        "test@gmail.com",
        "1234567"
      ],
      "line": 26,
      "id": "soft-on-boarding-process-test;as-a-customer-i-want-to-open-an-access-checking-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4539150300,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "As a customer I want to open an access checking account",
  "description": "",
  "id": "soft-on-boarding-process-test;as-a-customer-i-want-to-open-an-access-checking-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@CreateNewAccount"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Iam on soft on-boarding page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I enter my \"Test\",  \"LastName Test\", \"test@gmail.com\" and  \"1234567\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I check the terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Next button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should be taken to Add a saving account",
  "keyword": "Then "
});
formatter.match({
  "location": "SoftOnBoardingSteps.iam_on_soft_on_boarding_page()"
});
formatter.result({
  "duration": 4331803800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 12
    },
    {
      "val": "LastName Test",
      "offset": 21
    },
    {
      "val": "test@gmail.com",
      "offset": 38
    },
    {
      "val": "1234567",
      "offset": 60
    }
  ],
  "location": "SoftOnBoardingSteps.i_enter_my_and(String,String,String,String)"
});
formatter.result({
  "duration": 4383741200,
  "status": "passed"
});
formatter.match({
  "location": "SoftOnBoardingSteps.i_check_the_terms_and_conditions()"
});
formatter.result({
  "duration": 381584200,
  "status": "passed"
});
formatter.match({
  "location": "SoftOnBoardingSteps.i_click_on_Next_button()"
});
formatter.result({
  "duration": 3615141900,
  "status": "passed"
});
formatter.match({
  "location": "SoftOnBoardingSteps.i_should_be_taken_to_Add_a_saving_account()"
});
formatter.result({
  "duration": 40100,
  "status": "passed"
});
formatter.after({
  "duration": 4207759100,
  "status": "passed"
});
});