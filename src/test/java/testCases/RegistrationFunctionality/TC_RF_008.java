

//Validate Registering an Account by entering different passwords into 'Password' and 'Password Confirm' fields
/* TestCaseStep	
	1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Newsletter and  Privacy Policy Fields)
	4. Enter any password say '12345' into the 'Password' field
	5. Enter any different password say 'abcde' into the 'Passsword Confirm' field
	6. Click on 'Continue' button (ER-1)
Result:
   1.Account should not be created, instead a warning message - 'Password confirmation does not match password!' should be displayed under 'Password Confirm' field
 */

package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_008 extends BaseClass
	{
	
	@Test(groups={"Sanity","master"})
	void registration()
	{
		logger.info("**********Started TC_RF_008_Registarion***************");
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
		
		regPage.setCnfmPassprd("abc");
		logger.info("Enter confirmation wrong Password");
		
		regPage.setPrivacyPolicy();
		logger.info("clicked on privacy policy");
		
		regPage.clickContinue();
		logger.info("clicked on Continue");
		
		Assert.assertEquals(regPage.displayNotificationCnfmPassprd(),true);
		logger.info("Password confirmation does not match password! Notification message is diapalyed");
		
		}
		catch (Exception e)
		{
			logger.error("Tests case got failed");
			Assert.fail();
		}
		logger.info("***********************Finished TC_RF_008_Registration******************");
		}
	
	}

