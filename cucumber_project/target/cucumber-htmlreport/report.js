$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/com/seleniumcucmber/app/salesforce/testcases/Menu.feature");
formatter.feature({
  "line": 2,
  "name": "Testing the top menu.",
  "description": "In to work perform all operations after logging in\nAs a sales person\nI want to check menu items",
  "id": "testing-the-top-menu.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag1"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Testing Top Menu",
  "description": "",
  "id": "testing-the-top-menu.;testing-top-menu",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Menu"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am logged in \"\u003cBrowserType\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on \"\u003cHeaderLink\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "\"\u003cVerificationObject\u003e\" element should be present",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "testing-the-top-menu.;testing-top-menu;",
  "rows": [
    {
      "cells": [
        "BrowserType",
        "HeaderLink",
        "VerificationObject"
      ],
      "line": 13,
      "id": "testing-the-top-menu.;testing-top-menu;;1"
    },
    {
      "cells": [
        "Chrome",
        "hometab",
        "Todaysevent"
      ],
      "line": 14,
      "id": "testing-the-top-menu.;testing-top-menu;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Testing Top Menu",
  "description": "",
  "id": "testing-the-top-menu.;testing-top-menu;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Menu"
    },
    {
      "line": 1,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am logged in \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on \"hometab\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "\"Todaysevent\" element should be present",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 16
    }
  ],
  "location": "MenuTest.I_am_logged_in(String)"
});
formatter.result({
  "duration": 70807754779,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Todaysevent",
      "offset": 1
    }
  ],
  "location": "MenuTest.Element_should_be_present(String)"
});
formatter.result({
  "status": "skipped"
});
});