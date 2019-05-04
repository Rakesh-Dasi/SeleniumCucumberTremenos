package managers;

import org.openqa.selenium.WebDriver;

import pageLocators.AddSavingAccountPage;
import pageLocators.DriverLicensePage;
import pageLocators.PersonalInformationPage;
import pageLocators.SocialSecurityPageLocators;
import pageLocators.SoftOnBoardingPage;

public class PageObjectManager {
	
	private WebDriver driver;
	
	private SoftOnBoardingPage softOnBoardingPage;
	private AddSavingAccountPage addSavingAccountPage;
	private PersonalInformationPage personalInformationPageLocators;
	private SocialSecurityPageLocators socialSecurityPageLocators;
	private DriverLicensePage driverLicensePage;
	
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
	
	public SocialSecurityPageLocators getSocialSecurityPageLocators(){
		return (socialSecurityPageLocators ==null ) ? socialSecurityPageLocators = new SocialSecurityPageLocators(driver) : socialSecurityPageLocators;
	}
	
	public DriverLicensePage getDriverLicensePage(){
		return (driverLicensePage ==null ) ? driverLicensePage = new DriverLicensePage(driver) : driverLicensePage;
	}

}
