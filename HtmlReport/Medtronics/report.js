$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Siva/eclipse-workspace/Medtronics/src/test/java/featureFile.feature");
formatter.feature({
  "line": 1,
  "name": "Create an account on Medtronic Diabetes India website",
  "description": "",
  "id": "create-an-account-on-medtronic-diabetes-india-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User successfully creates an account",
  "description": "",
  "id": "create-an-account-on-medtronic-diabetes-india-website;user-successfully-creates-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user is on the Medtronic Diabetes India homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user navigates to the \"careLink\"  page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user fills in the registration form with valid details",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user agrees to the terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user clicks the \"Register\" button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user should see a confirmation message \"Account successfully created\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition_Medtronics.the_user_is_on_the_Medtronic_Diabetes_India_homepage()"
});
formatter.result({
  "duration": 37074765700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "careLink",
      "offset": 27
    }
  ],
  "location": "StepDefinition_Medtronics.the_user_navigates_to_the_page(String)"
});
formatter.result({
  "duration": 21826437200,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cmat-icon _ngcontent-ng-c3084338414\u003d\"\" role\u003d\"img\" matsuffix\u003d\"\" class\u003d\"mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color ng-tns-c1205077789-0\" aria-hidden\u003d\"true\" data-mat-icon-type\u003d\"font\"\u003e...\u003c/mat-icon\u003e is not clickable at point (1174, 211). Other element would receive the click: \u003cdiv _ngcontent-ng-c3656219987\u003d\"\" class\u003d\"spinner ng-star-inserted\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d126.0.6478.126)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-04JH5G7\u0027, ip: \u0027192.168.43.242\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.22\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 126.0.6478.126, chrome: {chromedriverVersion: 126.0.6478.63 (df799988fdc9..., userDataDir: C:\\Users\\Siva\\AppData\\Local...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:62680}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: d5f1aec665b1046e6fa847ecffd4eebf\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat com.Base.BaseClass_Medtronics.click_element(BaseClass_Medtronics.java:35)\r\n\tat com.StepDefinitions.StepDefinition_Medtronics.the_user_navigates_to_the_page(StepDefinition_Medtronics.java:57)\r\n\tat ✽.When the user navigates to the \"careLink\"  page(C:/Users/Siva/eclipse-workspace/Medtronics/src/test/java/featureFile.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition_Medtronics.the_user_fills_in_the_registration_form_with_valid_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition_Medtronics.the_user_agrees_to_the_terms_and_conditions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 21
    }
  ],
  "location": "StepDefinition_Medtronics.the_user_clicks_the_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Account successfully created",
      "offset": 44
    }
  ],
  "location": "StepDefinition_Medtronics.the_user_should_see_a_confirmation_message(String)"
});
formatter.result({
  "status": "skipped"
});
});