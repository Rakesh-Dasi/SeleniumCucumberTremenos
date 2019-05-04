Feature: Customer Returning to Unfinished Account Opening Application 
Scenario Outline: As a customer I want to return to my application where I last left. 
Given Iam on the the Returning Application Page 
When I enter my "<applicationnumber>" in the applicationnumber input
And I enter my "<dateofbirth>" in the dateofbirth input 
And I click on next button
Then I should be taken to where i left my application

Examples:
|applicationnumber | dateofbirth | 
| 34567	   | 08091967	|