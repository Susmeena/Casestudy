Feature: Purchase
Scenario: Sucessfull Purchase 

Given User must be login to the Testme app
When User enter four characters in find details box
And user select the appropriate product
And user click on find details button
Then User is navigate to purchase page and purchase is done

Scenario: Unsucessfull purchase

Given User must be login to the Testme app
When User enter four characters in find details box
And user click on find details button
Then User is navigate to purchase page and error message will be displayed
