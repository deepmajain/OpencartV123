package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC1_Registration extends BaseClass
	{
	
	@Test(groups={"Sanity","master"})
	void registration()
	{
		logger.info("**********Started TC1_Registarion***************");
		try
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
		logger.info("Enter Password");
		regPage.setCnfmPassprd("123abc");
		logger.info("Enter Confirm Password");
		regPage.setPrivacyPolicy();
		logger.info("clicked on privacy policy");
		regPage.clickContinue();
		logger.info("clicked on Continue");
		String confmsg=regPage.getConfirmationMsg();
		Assert.assertEquals(confmsg,"Your Account Has Been Created!");
		logger.info("confirmation msg printed");
		}
		catch (Exception e)
		{
			logger.error("Tests case got failed");
			Assert.fail();
		}
		logger.info("***********************Finished TC1_Registration******************");
		}
	
	}
