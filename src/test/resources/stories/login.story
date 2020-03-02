Login

Meta:
@login
@smoke

Narrative:
  In order to access to application
  As a regular user
  I want to be able to login via email

Lifecycle:
Before:
Scope: Scenario
Given I open Landing page

Scenario: Successful login
Meta: @login01
When I login with username userEmail and password userPassword
Then I should see Home page

Examples:
|userEmail              |userPassword|
|michael.orekh@gmail.com|Or.ru1999   |
|Michael.Orekh@gmail.com|Or.ru1999   |