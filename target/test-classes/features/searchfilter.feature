Feature: Verify user is able to search mobile 
	@smoke
	Scenario: Check if user is able to search "Iphone 14"
	Given user opens1 "https://www.flipkart.com"
	Then user search "Iphone 14"
	And user clicks search Button
	@sanity
	Scenario: Check if user is able to search "Samsung s22"
	Given user opens1 "https://www.flipkart.com"
	Then user search "Samsung s22"
	And user clicks search Button


