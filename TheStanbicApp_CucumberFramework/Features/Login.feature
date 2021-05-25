Feature: Login to the Mobile App
Scenario: Login to Mobile App with Valid Credentials
Given user selects the MyBank menu
When user clicks on the login arrow
Then user is navigated to the login screen
When user enters a valid account number and password
And clicks on the login button
Then user is navigated to the dashboard