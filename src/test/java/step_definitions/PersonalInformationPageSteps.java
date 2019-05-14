package step_definitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;

import pageLocators.PersonalInformationPage;

public class PersonalInformationPageSteps {
	
	TestContext testContext;	
	PersonalInformationPage personalInformationPage;	
	
	
   public PersonalInformationPageSteps(TestContext context) {		
		testContext = context;
		personalInformationPage = testContext.getPageObjectManger().getPersonalInfomationPage();
	}
	
   
   @Then("^I enter my details like \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
   public void i_enter_my_details_like(String addressline1, String city, String state, String zipcode, String number, String expirationdate, String dob, String issuingstate) throws Throwable {
	   personalInformationPage.fill_AdditionalDetails(addressline1, city, state, zipcode, number, expirationdate, dob, issuingstate, "Driving License");
			
	}
	
	@Then("^I click on continue$")
	public void i_click_on_continue() throws Throwable {
		
		personalInformationPage.clickOnContinueButton();
	}	
}
