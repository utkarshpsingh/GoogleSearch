#Author: Utkarsh Pratap Singh
Feature: Launching the Google and searching the content

Scenario: User open the google search page and searches his name hundred times

Given User launched the URL for the google search website
When The title of the page is google
Then User enters his name in the search field, click on the search button and iterate the same Hundred times
Then User close the google page.