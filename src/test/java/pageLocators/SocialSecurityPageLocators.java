package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SocialSecurityPageLocators{
	
	 public SocialSecurityPageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(how=How.XPATH, using ="//*[@id='C2__p1_HEAD_896EB0F05C8002E2745300']/div")
		public static WebElement SocialSecurityPage;
	 
	 @FindBy(how=How.XPATH, using ="//*[@id='C2__QUE_896EB0F05C8002E2755706']")
		public static WebElement socialsecuritynumber;
	
	 @FindBy(how=How.XPATH, using ="//*[@id='C2__BUT_896EB0F05C8002E2131452']/span")
		public static  WebElement next;

}
