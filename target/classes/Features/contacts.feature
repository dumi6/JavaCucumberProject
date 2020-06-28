Feature: Create Contacts


Scenario Outline: AddNewUser

Given User is already on home page
When User click on Admin
And User clicks Add button
And User Adds "<EmployeeName>" , "<Username>" 
And User enters new "<Password>" and "<ConfirmPassword>"
Then User click on save to update new user's details

Examples:
|EmployeeName |Username|Password|ConfirmPassword|
|DSAuto        |DSA     |test123 |test123        |