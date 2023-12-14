Feature:  Login Application Feature

Scenario: User Login scenario
Given  User is on Application Home page
When  Application Page Title is FREE CRM
Then  User enters username and password
And User clicks on Login Button
When User navigate to user Profile page


Scenario: Create New Contact
Given User is on Application Home Page
When Application Page Title is FREE CRM
Then user enters username and password
And user clicks on login Button
When User navigate to user profile page
Then Mouse Hover on Contact
Then Click New Contact
And Fill New Contact Form
Then Click Submit Button
Then Verify new Contact
