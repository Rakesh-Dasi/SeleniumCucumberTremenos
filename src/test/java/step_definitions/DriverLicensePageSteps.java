package step_definitions;

import org.junit.Assert;
import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageLocators.DriverLicensePage;

public class DriverLicensePageSteps {
	TestContext testContext;	
	DriverLicensePage driverLicensePage;	
	
	
   public DriverLicensePageSteps(TestContext context) {
		
		testContext = context;
		driverLicensePage = testContext.getPageObjectManger().getDriverLicensePage();
	}



	@Then("^I should see my \"([^\"]*)\" in driver license ready message$")
	public void i_should_see_my_in_driver_license_ready_message(String firstName) throws Throwable {		
		Assert.assertTrue(driverLicensePage.getDriverLicenseMessage().contains(firstName));
	}
	
	@Then("^I click on edit my information link$")
	public void i_click_on_edit_my_information_link() throws Throwable {	
		driverLicensePage.clickOnEditMyInfoLink();
	}
//	
//	@Then("^I enter my details like \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
//	public void i_enter_my_details_like(String addressline1, String city, String state, String zipcode, String number, String expirationdate, String dob) throws Throwable {
//		Thread.sleep(3000);
//		pageObjectManager = new PageObjectManager(driver);
//		personalInformationPageLocators = pageObjectManager.getPersonalInfomationPageLocators();
//	
//		personalInformationPageLocators.addressline1.sendKeys(addressline1);
//		personalInformationPageLocators.city.sendKeys(city);
//		personalInformationPageLocators.state.sendKeys(state);
//		personalInformationPageLocators.zipcode.sendKeys(zipcode);
//		personalInformationPageLocators.number.sendKeys(number);
//		personalInformationPageLocators.expirationdate.sendKeys(expirationdate);
//		personalInformationPageLocators.dob.sendKeys(dob);
//		Utils.selectByValue(personalInformationPageLocators.idType, "Driving License");
//		Thread.sleep(2000);
//	}
//	
//	@Then("^I click on continue$")
//	public void i_click_on_continue() throws Throwable {
//		pageObjectManager = new PageObjectManager(driver);
//		personalInformationPageLocators = pageObjectManager.getPersonalInfomationPageLocators();
//		personalInformationPageLocators.continueButton.click();
//	}
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
