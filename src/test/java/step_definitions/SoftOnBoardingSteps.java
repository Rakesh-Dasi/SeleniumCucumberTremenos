package step_definitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageLocators.SoftOnBoardingPage;

public class SoftOnBoardingSteps {

	TestContext testContext;
	SoftOnBoardingPage softOnBoardingPage;	
	
   public SoftOnBoardingSteps(TestContext context) {
		
		testContext = context;
		softOnBoardingPage = testContext.getPageObjectManger().getSoftOnBoardingPage();
	}
	
	@Given("^Iam on soft on-boarding page$")
	public void iam_on_soft_on_boarding_page() throws Throwable {
		 softOnBoardingPage.naviageToSoftOnboardingPage();	  
	}
	
	@When("^I enter my \"([^\"]*)\",  \"([^\"]*)\", \"([^\"]*)\" and  \"([^\"]*)\"$")
	public void i_enter_my_and(String firstName, String lastName, String emailAddress, String phoneNumber) throws Throwable {			
		softOnBoardingPage.fill_PersonalDetails(firstName, lastName, emailAddress, phoneNumber);      
	}
	
	@When("^I check the terms and conditions$")
	public void i_check_the_terms_and_conditions() throws Throwable {		
	     softOnBoardingPage.checkBox.click();
	}

	@When("^I click on Next button$")
	public void i_click_on_Next_button() throws Throwable {
		softOnBoardingPage.clickOnNextButton();		
		
	}	
	
}
