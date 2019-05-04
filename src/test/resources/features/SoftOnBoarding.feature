Feature: Soft On-Boarding process test

@CreateNewAccount
Scenario Outline: As a customer I want to open an access checking account
Given Iam on soft on-boarding page
When I enter my "<firstname>",  "<lastname>", "<emailAddress>" and  "<phoneNumber>"
And I check the terms and conditions
And I click on Next button
Then I should be taken to Add a saving account
And I click on Yes sign me up 
And I press on Next 
Then I should see my "<firstname>" in driver license ready message 
And I click on edit my information link
And I enter my details like "<addressline1>", "<city>", "<state>", "<zipcode>", "<number>", "<expirationdate>", "<dob>"
And I click on continue
Then I should be taken to Social Security Page
And I enter my "<socialsecuritynumber>"
And I click on next
Then I should be taken to answer kba page


Examples:
|firstname   | lastname   | emailAddress      |phoneNumber		|	addressline1 	      |  city  	  |  state | 	zipcode 	| 	number		    | 	expirationdate		    | 	dob		    |socialsecuritynumber|
|RICARDO	   | ANDREWS	  |	ricardo@gmail.com | 2482030001		|	100 TOWNSEND ST			|  MICHIGAN |	 MI	   | 48009      |	I4000000662  		|		12/02/2020						| 12/02/1961  |666990112					 |
