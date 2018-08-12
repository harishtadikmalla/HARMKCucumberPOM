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
formatter.step({
  "line": 7,
  "name": "navigate to PDP from products page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "select a color",
  "keyword": "Then "
});
formatter.match({
  "location": "test1.user_is_in_Main_Page()"
});
formatter.result({
  "duration": 23197862626,
  "status": "passed"
});
formatter.match({
  "location": "test1.search_for_an_item()"
});
formatter.result({
  "duration": 2763065718,
  "status": "passed"
});
formatter.match({
  "location": "test1.navigate_to_PDP_from_products_page()"
});
formatter.result({
  "duration": 2964123627,
  "status": "passed"
});
formatter.match({
  "location": "test1.select_a_color()"
});
formatter.result({
  "duration": 7914752794,
  "status": "passed"
});
});