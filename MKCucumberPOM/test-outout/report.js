$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Harish/git/HARMKCucumberPOM/MKCucumberPOM/src/main/java/com/mk/features/test2.feature");
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
formatter.step({
  "line": 9,
  "name": "Sign In",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Search for an item",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "navigate to PDP from products page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "select a color",
  "keyword": "Then "
});
formatter.match({
  "location": "test1.user_is_in_Main_Page()"
});
formatter.result({
  "duration": 13518175185,
  "status": "passed"
});
formatter.match({
  "location": "test1.Mouse_hover_on_the_Mega_Menu()"
});
formatter.result({
  "duration": 102143625,
  "status": "passed"
});
formatter.match({
  "location": "test1.click_on_a_Sub_Menu_Item()"
});
formatter.result({
  "duration": 1509982869,
  "status": "passed"
});
formatter.match({
  "location": "test1.Open_Sign_In_Flyout()"
});
formatter.result({
  "duration": 6590991625,
  "status": "passed"
});
formatter.match({
  "location": "test1.Sign_In()"
});
formatter.result({
  "duration": 947870557,
  "status": "passed"
});
formatter.match({
  "location": "test1.search_for_an_item()"
});
formatter.result({
  "duration": 159896654,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca class\u003d\"search-link loyalty-search-link\" title\u003d\"Search\" aria-label\u003d\"search-icon\" aria-hidden\u003d\"\" href\u003d\"/search/_/N-0/Ntt-\"\u003e...\u003c/a\u003e is not clickable at point (1566, 59). Other element would receive the click: \u003cdiv style\u003d\"position: fixed; top: 0px; left: 0px; width: 100%; height: 100%; z-index: 1050; overflow: hidden auto; text-align: center; background: rgba(0, 0, 0, 0.5); cursor: pointer;\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d68.0.3440.106)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027HARISH\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb), userDataDir\u003dC:\\Users\\Harish\\AppData\\Local\\Temp\\scoped_dir6308_3519}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d68.0.3440.106, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: b5b4a2f0b14d54a7b0a5bbd5123706d4\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:275)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat com.mk.pages.Search.searchAnItem(Search.java:16)\r\n\tat com.mk.stepdefinitions.test1.search_for_an_item(test1.java:29)\r\n\tat ✽.Then Search for an item(C:/Users/Harish/git/HARMKCucumberPOM/MKCucumberPOM/src/main/java/com/mk/features/test2.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "test1.navigate_to_PDP_from_products_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "test1.select_a_color()"
});
formatter.result({
  "status": "skipped"
});
});