Feature:  Login Application Feature

#Scenario: User Login scenario
#Given  User is on Application Home page
#When  Application Page Title is FREE CRM
#Then  User enters username and password
#And User clicks on Login Button
#When User navigate to user Profile page


Scenario: User Login Scenario
Given User is on Application Home Page
When Application Page Title is FREE CRM
Then user enters username and password
And user clicks on login Button
When User navigate to user profile page


Examples:
    | username | password | 
    | anshulc55 | Anshul@123 |
    | tomhank   | tomhank123 |
    | Terri     | Terri@123 |
    | ABC       | ABC@123 |