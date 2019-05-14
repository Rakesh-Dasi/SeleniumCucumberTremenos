package step_definitions;

import org.junit.Assert;
import cucumber.TestContext;
import cucumber.api.java.en.Then;

import pageLocators.SocialSecurityPage;

public class SocialSecurityPageSteps {
	
	TestContext testContext;	
	SocialSecurityPage socialSecurityPage;	

	
   public SocialSecurityPageSteps(TestContext context) {		
		testContext = context;
		socialSecurityPage = testContext.getPageObjectManger().getSocialSecurityPage();
	}
	

	@Then("^I should be taken to Social Security Page$")
	public void i_should_be_taken_to_Social_Security_Page() throws Throwable {	   
		
		Assert.assertTrue(socialSecurityPage.getSocialSecurityPageHeader().contains("Social Security Number"));
	}
	
	
	@Then("^I enter my \"([^\"]*)\"$")
	public void i__enter_my_socialsecuritynumber(String socialsecuritynumber) throws Throwable {
	 socialSecurityPage.enterSocialSecurityNumber(socialsecuritynumber);
	}
	
	@Then("^I click on I am NOT subject to backup withholding\\.$")
	public void i_click_on_I_am_NOT_subject_to_backup_withholding() throws Throwable {
	  socialSecurityPage.selectNotSubjectToRadioButton();
	}

	@Then("^I have agreed and certify on accuracy$")
	public void i_have_agreed_and_certify_on_accuracy() throws Throwable {
	   socialSecurityPage.selectReadAndCertifyCheckbox();
	}

	@Then("^I click on next$")
	public void i_click_on_next() throws Throwable {
		socialSecurityPage.clickNextButton();
	}	
	
}
