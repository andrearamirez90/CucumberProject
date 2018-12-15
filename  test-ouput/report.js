$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/dataTable.feature");
formatter.feature({
  "line": 1,
  "name": "sign up freecrm",
  "description": "",
  "id": "sign-up-freecrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "sign uo to the freecrm",
  "description": "",
  "id": "sign-up-freecrm;sign-uo-to-the-freecrm",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to the FreeCRM",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Sign Up button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I will provide the following details",
  "rows": [
    {
      "cells": [
        "EDITION",
        "FNAME",
        "LNAME",
        "EMAIL",
        "CONF.EMAIL",
        "USERNAME",
        "PASS",
        "CPASS",
        "CName",
        "CEmail",
        "Phone"
      ],
      "line": 9
    },
    {
      "cells": [
        "Free Edition",
        "John",
        "smith",
        "v@email.com",
        "v@email.com",
        "johnsmith250",
        "a12234",
        "a12234",
        "Azul",
        "a@email.com",
        "123456789"
      ],
      "line": 10
    },
    {
      "cells": [
        "Free Edition",
        "Mike",
        "Bruce",
        "h@email.com",
        "h@email.com",
        "mikebruce250",
        "a12890",
        "a12890",
        "Verde",
        "n@emial.com",
        "345633233"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.open_browser()"
});
formatter.result({
  "duration": 3610462482,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_the_FreeCRM()"
});
formatter.result({
  "duration": 2975658203,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_Sign_Up_button()"
});
formatter.result({
  "duration": 3676495869,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_will_provide_the_following_details(DataTable)"
});
formatter.result({
  "duration": 10314282524,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_close_browser()"
});
formatter.result({
  "duration": 109886353,
  "status": "passed"
});
});