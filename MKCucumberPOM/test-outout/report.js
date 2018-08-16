$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Harish/git/HARMKCucumberPOM/MKCucumberPOM/src/main/java/com/mk/features/test1.feature");
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
  "name": "Search for an item",
  "keyword": "Then "
});
formatter.match({
  "location": "test1.user_is_in_Main_Page()"
});
formatter.result({
  "duration": 15134035899,
  "status": "passed"
});
formatter.match({
  "location": "test1.search_for_an_item()"
});
formatter.result({
  "duration": 3323861500,
  "status": "passed"
});
});