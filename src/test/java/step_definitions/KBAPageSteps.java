package step_definitions;

import org.junit.Assert;
import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pageLocators.KBAPage;

public class KBAPageSteps {
	
	TestContext testContext;	
	KBAPage kbaPage;

	
   public KBAPageSteps(TestContext context) {		
		testContext = context;
		kbaPage = testContext.getPageObjectManger().getKbaPage();
	}

	@Then("^I should be taken to answer kba page$")
	public void i_should_be_taken_to_answer_kba_page() throws Throwable {
	 Assert.assertTrue(kbaPage.getAuthenticationHeaderText().contains("Authentication Questions"));
		
	}
	
	
}
