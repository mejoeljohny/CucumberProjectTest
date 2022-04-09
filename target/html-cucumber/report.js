$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "This feature would be used to design the Login page of the Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the successful login using Testdata",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have opened the application in browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.i_have_opened_the_application_in_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login link",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.i_click_on_the_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the username \"mejoeljohny12@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.i_enter_the_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the password \"Aneesh@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.i_enter_the_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.i_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be Landed on the Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.i_should_be_landed_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the Negative login using Testdata",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have opened the application in browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.i_have_opened_the_application_in_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login link",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.i_click_on_the_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the username \"negative@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.i_enter_the_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the password \"Pa$$word@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.i_enter_the_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.i_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the error message as \"The email or password you have entered is invalid.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.i_should_get_the_error_message_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});