Feature: validation of car search page
In order to validate car search
as a buyer
I navigate http://www.carsguide.com.au

Scenario: Searching for a new car

Given I am on the home page http://www.carsguide.com.au of carsguide website
When I move to car for Sale Menu
Then I click on Search Cars
And I select Make as BMW
And I select Model as 1 Series