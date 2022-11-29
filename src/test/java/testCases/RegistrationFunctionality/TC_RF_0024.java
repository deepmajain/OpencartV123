package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_0024 extends BaseClass{
	@Test
	public void registration()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccount");
		hp.clickRegister();
		logger.info("clicked on Register");
		RegistrationPage regPage= new RegistrationPage(driver);
		regPage.setFirstName(randomString().toUpperCase());
		logger.info("Enter First Name");
		regPage.setLastName(randomString().toUpperCase());
		logger.info("Enter Last Name");
		regPage.setEmail(randomString()+"@gmail.com");
		logger.info("Enter Email");
		regPage.setPhoneNumber(randomNumber());
		logger.info("Enter Phone Number");
		regPage.setPassword("123abc");
		logger.info("Enterd Password");
		regPage.setPrivacyPolicy();
		logger.info("clicked on privacy policy");
		regPage.clickContinue();
		logger.info("clicked on Continue");
		Assert.assertEquals(regPage.displayNotificationCnfmPassprd(),true);
		
	}

}
