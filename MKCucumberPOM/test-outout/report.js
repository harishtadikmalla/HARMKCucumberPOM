$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Harish/eclipse-workspace/MKCucumberPOM/src/main/java/com/mk/features/test1.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate to PLP",
  "description": "",
  "id": "navigate-to-plp",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To test navigation to PLP",
  "description": "",
  "id": "navigate-to-plp;to-test-navigation-to-plp",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is in Main Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Mouse hover on the Mega Menu",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on a Sub Menu Item",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Open Sign In Flyout",
  "keyword": "Then "
});
formatter.match({
  "location": "test1.user_is_in_Main_Page()"
});
formatter.result({
  "duration": 13674886820,
  "status": "passed"
});
formatter.match({
  "location": "test1.Mouse_hover_on_the_Mega_Menu()"
});
formatter.result({
  "duration": 165162876,
  "status": "passed"
});
formatter.match({
  "location": "test1.click_on_a_Sub_Menu_Item()"
});
formatter.result({
  "duration": 1540906996,
  "status": "passed"
});
formatter.match({
  "location": "test1.Open_Sign_In_Flyout()"
});
formatter.result({
  "duration": 3053751110,
  "status": "passed"
});
});