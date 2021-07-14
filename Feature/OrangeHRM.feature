@OrangeHRM
Feature: OrangeHRM

Scenario: User is Logged In
	Given User navigate to the OrangeHRM Demo site
	When User enters "Admin" and "admin123" and clicks on login button
	Then User successfully loggedin and OrangeHRM Demo site dashboard displayed 

Scenario: User is on Dashboard page
    Given User navigate to the OrangeHRM Demo site
	When User enters "Admin" and "admin123" and clicks on login button
	Then User successfully loggedin and OrangeHRM Demo site dashboard displayed 
	And  User clicks PIM option
	Then User navigates to PIM page
	And User clicks on employee name
	Then User navigates to personal details page and clicks on edit button
	Then User enters all the required details and click on save button
	Then User navigates to PIM page and enter employee name
	And User clicks on search button
	Then User navigates to searched employee page and clicks on welcome message
	And User clicks on logout option