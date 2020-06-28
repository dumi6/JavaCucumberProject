$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/JavaProject/eclipse-workspace/SundayCucumberProject/src/main/java/Features/hooks.feature");
formatter.feature({
  "line": 1,
  "name": "AccessUrl",
  "description": "",
  "id": "accessurl",
  "keyword": "Feature"
});
formatter.before({
  "duration": 184500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "LoginToUrl",
  "description": "",
  "id": "accessurl;logintourl",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User is on home page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User closes the UrlPage",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 7502310400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 118976500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_the_submit_button()"
});
formatter.result({
  "duration": 1647752600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 23895600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_closes_the_UrlPage()"
});
formatter.result({
  "duration": 629116300,
  "status": "passed"
});
formatter.after({
  "duration": 62800,
  "status": "passed"
});
});