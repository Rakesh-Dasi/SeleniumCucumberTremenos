package managers;

import org.openqa.selenium.WebDriver;

import pageLocators.AddSavingAccountPage;
import pageLocators.DriverLicensePage;
import pageLocators.KBAPage;
import pageLocators.PersonalInformationPage;
import pageLocators.SocialSecurityPage;
import pageLocators.SoftOnBoardingPage;

public class PageObjectManager {
	
	private WebDriver driver;
	
	private SoftOnBoardingPage softOnBoardingPage;
	private AddSavingAccountPage addSavingAccountPage;
	private PersonalInformationPage personalInformationPageLocators;
	private SocialSecurityPage socialSecurityPageLocators;
	private DriverLicensePage driverLicensePage;
	private KBAPage kbaPage;
	
	//To create an object of the pages
	public PageObjectManager(WebDriver driver){
		this.driver = driver;
	}
	
	//Create an object of the page class 
	public SoftOnBoardingPage getSoftOnBoardingPage(){
		return (softOnBoardingPage ==null ) ? softOnBoardingPage = new SoftOnBoardingPage(driver) : softOnBoardingPage;
	}
	
	public AddSavingAccountPage getAddSavingAccountPage(){
		return (addSavingAccountPage ==null ) ? addSavingAccountPage = new AddSavingAccountPage(driver) : addSavingAccountPage;
	}
	
	public PersonalInformationPage getPersonalInfomationPage(){
		return (personalInformationPageLocators ==null ) ? personalInformationPageLocators = new PersonalInformationPage(driver) : personalInformationPageLocators;
	}
	
	public SocialSecurityPage getSocialSecurityPage(){
		return (socialSecurityPageLocators ==null ) ? socialSecurityPageLocators = new SocialSecurityPage(driver) : socialSecurityPageLocators;
	}
	
	public DriverLicensePage getDriverLicensePage(){
		return (driverLicensePage ==null ) ? driverLicensePage = new DriverLicensePage(driver) : driverLicensePage;
	}

	public KBAPage getKbaPage(){
		return (kbaPage ==null ) ? kbaPage = new KBAPage(driver) : kbaPage;
	}
}
