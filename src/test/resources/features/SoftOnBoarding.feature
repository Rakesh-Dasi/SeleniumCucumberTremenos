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
And I enter my details like "<addressline1>", "<city>", "<state>", "<zipcode>", "<number>", "<expirationdate>", "<dob>","<issuingstate>"
And I click on continue
Then I should be taken to Social Security Page
And I enter my "<socialsecuritynumber>"
And I click on I am NOT subject to backup withholding.
And I have agreed and certify on accuracy
And I click on next
Then I should be taken to answer kba page


Examples:
|firstname   | lastname   | emailAddress      		|phoneNumber		|	addressline1 	       |  city  	  		|  state | 	zipcode 	| 	number		    | 	expirationdate| 	dob		    |socialsecuritynumber|issuingstate|
|BURBER	   	 | WINTERS	  |	burber@gmail.com  		| 7084780051		|	799 SNOWEY LN				 | FANTASY ISLAND |	 IL	   | 60750      |	I31000000255  	|		06/07/2020		| 06/07/1981  |666894440					 |IL    			|
|ASHRAF  	 	 | ABDELHADY  |	ashraf@gmail.com  		| 8477030219		|	002 N MICHIGAN AVE	 | MODESTO				|	 CA	   | 95355      |	1561961			  	|		07/01/2020		| 07/01/1961  |666271578					 |CA					|
|RHETT 	 		 | BUTLER		  |	rhett@gmail.com 			| 9544862728		|	1950 S WEBSTER AVENUE| GREEN BAY	 		|	 WI	   | 54301      |	B000000000001  	|		02/01/2020		| 02/01/1984  |666999888				 	 |WI					|
|MERLIN  	 	 | GEORGE	  	|	merlin@gmail.com 			| 2032300088		|	079 PROSPECT ST			 | NEW HAVEN 			|	 CT	   | 06511      |	110000073  			|		04/01/2020		| 04/01/1982  |666990410				 	 |CT		 			|
|GIBSON  	 	 | MURRAY	  	|	gibson@gmail.com 			| 3052200008		|	13313 SW 135TH AVE	 | MIAMI		 			|	 FL	   | 33186      |	F210000000140  	|		08/08/2020		| 08/08/1955  |666990903				 	 |FL		 			|
|BERBADETTE  | BAGWELL	  |	berbadette@gmail.com	| 2032300039		|	40 PROSPECT ST			 | NEW HAVEN 			|	 CT	   | 06511      |	110000023  			|		11/12/2020		| 11/12/1980  |666990249				 	 |CT		 			|
|CHRISTOPHER | JAMES	  	|	christopher@gmail.com | 5552022342		|	82 EXETER STREET		 | BOSTON		 			|	 MA	   | 02116      |	M1119991  			|		12/01/2020		| 12/01/1996  |666990710				 	 |MA		 			|




