package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;
import managers.WebDriverManager;
import selenium.Wait;

public class SoftOnBoardingPage{

	WebDriver driver;
	ConfigFileReader configFileReader;
	WebDriverManager webDriverManager;
	 public SoftOnBoardingPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2518455")
	public WebElement FirstName;
	
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2518456")
	public static WebElement LastName;
	
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2518457")
	public static WebElement EmailId;
	
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2518458")
	public static WebElement PhoneNumber;
	
	@FindBy(how=How.XPATH, using ="//*[@id='C2__FS_QUE_0338FABA792CE55D132113']/div/label")
	public  WebElement checkBox;
	
	@FindBy(how=How.XPATH, using ="//*[text()='Next']")
	public  WebElement nextButton;

	public void naviageToSoftOnboardingPage(){
		configFileReader = new ConfigFileReader();
		driver.get(configFileReader.getApplicationUrl());
	}
	
	public void check_Checkbox(boolean value){
		if(value) checkBox.click();
	}
	
	public void clickOnNextButton(){
		nextButton.click();
		Wait.untilPageLoadComplete(driver);
	}
	
	public void fill_PersonalDetails(String firstName, String lastname, String email, String phoneNumber){
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastname);
		EmailId.sendKeys(email);
		PhoneNumber.sendKeys(phoneNumber);
	}
	
}
