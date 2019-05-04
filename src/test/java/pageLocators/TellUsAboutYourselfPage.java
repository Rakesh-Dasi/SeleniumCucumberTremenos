package pageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TellUsAboutYourselfPage extends BaseClass{

	public TellUsAboutYourselfPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2389749")
	public static WebElement addressLineOne;
	
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2389751")
	public static WebElement city;
	
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2389752")
	public static WebElement state;
	
	@FindBy(how=How.ID, using ="C2__QUE_896EB0F05C8002E2518458")
	public static WebElement phoneNumber;
	
	@FindBy(how=How.XPATH, using ="//*[@id='C2__FS_QUE_0338FABA792CE55D132113']/div/label")
	public static WebElement checkBox;
	
	@FindBy(how=How.XPATH, using ="//*[text()='Next']")
	public static WebElement nextButton;

}
