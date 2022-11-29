//Validate Registering an Account by providing an invalid phone number
/* TestCaseSteps:
	1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. Enter new  Account Details into all the Fields (First Name, Last Name,E-Mail, Password, Password Confirm, Newsletter and  Privacy Policy Fields)
	4. Enter invalid phone number into the Telephone Field - <Refer Test Data>
	5. Click on 'Continue' button (ER-1)
   Result:
	1. Account should not be created, instead a proper warning message should be displayed
	*/
package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_0011 extends BaseClass
	{
	
	@Test(groups={"Sanity","master"})
	void registration()
	{
		logger.info("**********Started TC_RF_0011_Registarion***************");
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
		
		regPage.setEmail(randomString()+"@gamil.com");
		logger.info("Enter Email");
		
		regPage.setPhoneNumber("1");
		logger.info("Enter Phone Number");
		
		regPage.setPassword("123abc");
		logger.info("Enter Password");
		
		regPage.setCnfmPassprd("123abc");
		logger.info("Enter confirmation wrong Password");
		
		regPage.setPrivacyPolicy();
		logger.info("clicked on privacy policy");
		
		regPage.clickContinue();
		logger.info("clicked on Continue");
		
		Assert.assertEquals(regPage.displayNotificationPhoneNumber(),true);
		regPage.setPhoneNumber("11");
		regPage.clickContinue();
		Thread.sleep(5000);
		Assert.assertEquals(regPage.displayNotificationPhoneNumber(),true);
		regPage.setPhoneNumber("a");
		regPage.clickContinue();
		Thread.sleep(5000);
		Assert.assertEquals(regPage.displayNotificationPhoneNumber(),true);
		regPage.setPhoneNumber("aa");
		regPage.clickContinue();
		Thread.sleep(5000);
		Assert.assertEquals(regPage.displayNotificationPhoneNumber(),true);
		regPage.setPhoneNumber("1a");
		regPage.clickContinue();
		Thread.sleep(5000);
		Assert.assertEquals(regPage.displayNotificationPhoneNumber(),true);
		
		
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("***********************Finished TC_RF_0011_Registration******************");
		}
	
	}

