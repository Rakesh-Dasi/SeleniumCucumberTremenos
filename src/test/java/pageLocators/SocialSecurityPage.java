package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.Wait;

public class SocialSecurityPage{
	WebDriver driver;
	 public SocialSecurityPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(how=How.ID, using ="C2__p1_HEAD_896EB0F05C8002E2745300")
		private WebElement socialSecurityPageHeader;
	 
	 @FindBy(how=How.XPATH, using ="//*[@id='sin_num']")
		private  WebElement socialSecurityNumberInput;
	
	 @FindBy(how=How.XPATH, using ="//*[@id='C2__BUT_896EB0F05C8002E2131452']/span")
		private  WebElement nextButton;
	 
	 @FindBy(how=How.ID, using ="C2__QUE_07502B5FD7CC52C6178514_0")
		private  WebElement notSubjectToRadioButton;
	 
	 @FindBy(how=How.ID, using ="C2__QUE_07502B5FD7CC52C6186035_0")
		private  WebElement readAndCertifyCheckbox;
	 
	 public String getSocialSecurityPageHeader(){
		 Wait.untilPageLoadComplete(driver);
		 String text = socialSecurityPageHeader.getText();
		 return text;
	 }
	 
	 public void enterSocialSecurityNumber(String value){
		 socialSecurityNumberInput.sendKeys(value);
	 }
	 
	 public void clickNextButton(){
		 nextButton.click();
	 }
	 
	 public void selectNotSubjectToRadioButton(){
		 Wait.untilPageLoadComplete(driver);
		 notSubjectToRadioButton.click();
	 }
	 
	 public void selectReadAndCertifyCheckbox(){
		 Wait.untilPageLoadComplete(driver);
		 readAndCertifyCheckbox.click();
	 }
}
