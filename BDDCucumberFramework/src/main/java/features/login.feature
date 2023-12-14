Feature:  Login Application Feature

Scenario: User Login scenario

Given  User is on Application Home page

When  Application Page Title is FREE CRM

Then  User enters username and password
And User clicks on Login Button
When User navigate to user Profile page


Scenario : Verify Duplicate Registration
Given User is on Application Home Page
Then User clicks on Sign-up Button
Then User fills the sign-up form
And User clicks the Submit Button
Then Display already Registered message
Then Navigate to reset password page
