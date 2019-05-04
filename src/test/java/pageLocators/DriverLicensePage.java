package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.Wait;

public class DriverLicensePage{

	WebDriver driver;
	public DriverLicensePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using ="C2__HEAD_381DC9A28E330321228127")
	private WebElement readyDriverLicenseMessage;
	
	@FindBy(how=How.XPATH, using ="//span[starts-with(text(), 'Enter my information')]")
	private WebElement editMyInfoLink;
	
	public String getDriverLicenseMessage(){
		Wait.untilPageLoadComplete(driver);
		String text= readyDriverLicenseMessage.getText();
		return text;
	}
	
	public void clickOnEditMyInfoLink(){
		editMyInfoLink.click();
		Wait.untilPageLoadComplete(driver);
	}

}
