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
	
	@Then("^I enter my details like \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter_my_details_like(String addressline1, String city, String state, String zipcode, String number, String expirationdate, String dob) throws Throwable {
		
		personalInformationPage.fill_AdditionalDetails(addressline1, city, state, zipcode, number, expirationdate, dob, "Driving License");
	}
	
	@Then("^I click on continue$")
	public void i_click_on_continue() throws Throwable {
		
		personalInformationPage.clickOnContinueButton();
	}
	
//	@Then("^I should be taken to Social Security Page$")
//	public void i_should_be_taken_to_Social_Security_Page() throws Throwable {
//	   
//		
//	}
//	
//	
//	@Then("^I enter my \"([^\"]*)\"$")
//	public void i__enter_my_socialsecuritynumber(String socialsecuritynumber) throws Throwable {
//	   pageObjectManager = new PageObjectManager(driver);
//	   SocialSecurityPageLocators socialSecurityPageLocators = pageObjectManager.getSocialSecurityPageLocators();
//	   SocialSecurityPageLocators.socialsecuritynumber.sendKeys(socialsecuritynumber);
//	}
//
//
//	@Then("^I click on next$")
//	public void i_click_on_next() throws Throwable {
//		pageObjectManager = new PageObjectManager(driver);
//		   SocialSecurityPageLocators socialSecurityPageLocators = pageObjectManager.getSocialSecurityPageLocators();
//		   SocialSecurityPageLocators.next.click();
//		   Thread.sleep(3000);
//	}
//
//	@Then("^I should be taken to answer kba page$")
//	public void i_should_be_taken_to_answer_kba_page() throws Throwable {
//	   
//		
//	}
	
	
}
