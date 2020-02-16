$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/utkar/eclipse-workspace/com.SearchName/src/test/java/Features/googleSearch.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Utkarsh Pratap Singh"
    }
  ],
  "line": 2,
  "name": "Launching the Google and searching the content",
  "description": "",
  "id": "launching-the-google-and-searching-the-content",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15583623900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User open the google search page and searches his name hundred times",
  "description": "",
  "id": "launching-the-google-and-searching-the-content;user-open-the-google-search-page-and-searches-his-name-hundred-times",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User launched the URL for the google search website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The title of the page is google",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters his name in the search field, click on the search button and iterate the same Hundred times",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User close the google page.",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearch.user_launched_the_URL_for_the_google_search_website()"
});
formatter.result({
  "duration": 14224923500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.the_title_of_the_page_is_google()"
});
formatter.result({
  "duration": 18007300,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.user_enters_his_name_in_the_search_field_click_on_the_search_button_and_iterate_the_same_Hundred_times()"
});
formatter.result({
  "duration": 17021714100,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.user_close_the_google_page()"
});
formatter.result({
  "duration": 437231200,
  "status": "passed"
});
});