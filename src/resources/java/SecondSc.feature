Feature: Testme_Login
Scenario Outline: Login into Testme Application
Given user is on the login page
When user enters "<username>" on user name field 
And User enters "<password>" on the  password field
And User clicks on  login button
Then user is navigate to the home page 
Examples:
|username||password|
|Lalitha||Password123|
|ramya959||Susmeena2|