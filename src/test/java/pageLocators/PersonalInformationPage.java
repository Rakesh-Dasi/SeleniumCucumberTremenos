package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.Wait;
import utility.Utils;

public class PersonalInformationPage{
	WebDriver driver;
	
	public PersonalInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using ="//*[@id='C2__QUE_896EB0F05C8002E2389749']")
	private WebElement addressLineOne;
	
	@FindBy(how=How.XPATH, using ="//*[@id='C2__QUE_896EB0F05C8002E2389751']")
	private WebElement cityName;
	
	@FindBy(how=How.XPATH, using ="//*[@id='C2__QUE_896EB0F05C8002E2389752']")
	private  WebElement stateName;
	
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2389753")
	private  WebElement zipcodeNumber;
		
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2389754")
	private WebElement number;
	
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2389755")
	private  WebElement expirationDate;
	
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2389748")
	private WebElement DOB;
	
	@FindBy(how=How.XPATH, using ="//*[@id='C2__BUT_896EB0F05C8002E2131452']")
	private  WebElement continueButton;
	
	@FindBy(how=How.ID, using ="C2__QUE_3949A160F77908F470900")
	private  WebElement idTypeDropdown;
	
	@FindBy(how=How.XPATH, using ="//*[@id='C2__QUE_7C7A7A0E81F5F31F87434']")
	private  WebElement issuingState;
	
	@FindBy(how=How.XPATH, using = "//span[starts-with(text(), 'Please enter a valid')]")
	private WebElement errorMessage;

	public void fill_AdditionalDetails(String address, String city, String state, String zipcode, String value, String expirationdate, String dob, String issuingstate, String dropDownValue)
	{
		Wait.untilPageLoadComplete(driver);
		addressLineOne.sendKeys(address);
		cityName.sendKeys(city);
		stateName.sendKeys(state);
		zipcodeNumber.sendKeys(zipcode);
		number.sendKeys(value);
		expirationDate.sendKeys(expirationdate);
		DOB.sendKeys(dob);
		issuingState.sendKeys(issuingstate);
		Utils.selectByValue(idTypeDropdown, dropDownValue);
	}
	
	public void clickOnContinueButton(){
		continueButton.click();
		Wait.untilPageLoadComplete(driver);
	}
	
	
}
