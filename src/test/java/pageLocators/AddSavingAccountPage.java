package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.Wait;

public class AddSavingAccountPage  {
	WebDriver driver;

	 public AddSavingAccountPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using ="C2__HEAD_896EB0F05C8002E2518607")
	private  WebElement pageHeader;
	
	@FindBy(how=How.XPATH, using ="//*[@id='C2__FS_QUE_B33B3C10B613D14E661744']/div[1]/label")
	private WebElement signMeUpRadioButton;
	
	@FindBy(how=How.XPATH, using ="//*[text()='Next']")
	private  WebElement nextButton;
	
	public void selectSignMeUpRadioButton(){
		signMeUpRadioButton.click();
	}
	
	public boolean iSHeaderDisplayed(){
		return pageHeader.isDisplayed();
	}
	
	public void clickOnNextButton(){
		nextButton.click();
		Wait.untilPageLoadComplete(driver);
	}
}
