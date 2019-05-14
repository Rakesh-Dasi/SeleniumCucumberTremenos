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
	
	@FindBy(how=How.XPATH, using ="//*[@id='C2__p1_HEAD_381DC9A28E330321228127']/div")
	private WebElement readyDriverLicenseMessage;
	
	@FindBy(how=How.XPATH, using ="//*[@id='C2__BUT_A130C91E903DC6FE559225']/span")
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
