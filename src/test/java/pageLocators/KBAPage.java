package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.Wait;

public class KBAPage{
	WebDriver driver;
	 public KBAPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(how=How.ID, using ="C2__C1__HEAD_D2E82ED366602ECF240341")
		private WebElement authenticationQuestionsHeader;
	 
	
	 
	 public String getAuthenticationHeaderText(){
		 Wait.untilPageLoadComplete(driver);
		 return authenticationQuestionsHeader.getText();		 
	 }
	 
	
}
