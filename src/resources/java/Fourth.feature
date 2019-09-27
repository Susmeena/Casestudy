Feature: Purchase


Background: User Login
Given User is on the login page
When User enters the login credentials
Then User is on the home page

Scenario: Sucessfull Purchase 
When User enter four characters in find details box
And user clicks on find details button
Then User is navigate to purchase page and purchase is done

Scenario: Unsucessfull purchase
When User enter four characters in find details 
Then Zero items found  will be displayed above the search box

Scenario: user moves to cart without adding any item in it
When User enter four characters in the find details box
And user clicks on find detailss button
And Try to proceed without adding any item in the cart
Then Testme doesn't display the cart icon