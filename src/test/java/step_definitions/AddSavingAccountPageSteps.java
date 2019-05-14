package step_definitions;

import org.junit.Assert;
import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageLocators.AddSavingAccountPage;

public class AddSavingAccountPageSteps {
	TestContext testContext;	
	AddSavingAccountPage addSavingAccountPage;	
	
	
   public AddSavingAccountPageSteps(TestContext context) {
		
		testContext = context;
		addSavingAccountPage = testContext.getPageObjectManger().getAddSavingAccountPage();
	}

	@Then("^I should be taken to Add a saving account$")
	public void i_should_be_taken_to_Add_a_saving_account() throws Throwable {			
		Assert.assertTrue(addSavingAccountPage.iSHeaderDisplayed());	
		
	}
	
	@Then("^I click on Yes sign me up$")
	public void i_click_on_Yes_sign_me_up() throws Throwable {		
		 addSavingAccountPage.selectSignMeUpRadioButton();	 
	}
	
	@Then("^I press on Next$")
	public void i_press_on_Next() throws Throwable {
		addSavingAccountPage.clickOnNextButton();
	}	
	
}
