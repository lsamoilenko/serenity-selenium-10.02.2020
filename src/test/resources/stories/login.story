Login

Meta:
@login

Narrative:
  In order to access to application
  As a regular user
  I want to be able to login via email

Scenario: Successful login
Given I open Landing page
When I login with username userEmail and password userPassword
Then I should see Home page

Examples:
|userEmail              |userPassword|
|michael.orekh@gmail.com|Or.ru1999   |