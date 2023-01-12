$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/test.feature");
formatter.feature({
  "name": "Number8 - Testing Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Google Page being loaded",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go on the \"https://www.google.com/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.java:39"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should the url of the page be \"https://www.google.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.java:41"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test1234",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@End"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go on the \"https://www.google.com/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.java:39"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will search \"Number8\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.java:45"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the position \"1\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.java:50"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should the url of the page be \"https://number8.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.java:41"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});