Feature: SignUp
Scenario: Registration in TestMe App

Given User is on signup page
When User enters "username" on the user name field
And User enters "firstname" on the first name field
And User enters "lastname" on the  last name field
And User enters "password" on the password field   
And User enters "password" on the confirmpassword field 
And User selects "gender" on the Gender Radio button
And User enters "mailid" on the email field
And User enters "phonenumber" on the mobile number field
And User selects "dateofbirth" on the DOB field
And User enter "address" in the address field
And User enters "birthplace" in the birthplace field
And User clicks on Register button
Then  Registration successful and User is on login page 
