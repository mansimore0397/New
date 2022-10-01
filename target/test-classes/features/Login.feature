@F2
Feature: Verify user is able to login
	@smoke
	Scenario: Check if user is abe to login with correct id and password 
	Given User Opens "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And User Enters UserName "Admin" 
	And User Enters Password "admin123"
	Then User Clicked Login Button
	@sanity
	Scenario: Check if user is abe to login with correct id and password 
	Given User Opens "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And User Enters UserName "Admin12" 
	And User Enters Password "admin125"
	Then User Clicked Login Button
	
