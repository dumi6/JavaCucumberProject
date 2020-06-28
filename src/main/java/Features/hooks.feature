Feature: AccessUrl



Scenario: LoginToUrl

Given User is already on login page
When User enters username and password
Then User clicks the submit button
And User is on home page
And User closes the UrlPage

