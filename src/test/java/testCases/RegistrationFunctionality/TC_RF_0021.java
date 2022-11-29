//Validate Registering the Account without selecting the 'Privacy Policy' checkbox option
/* TestCaseSteps:
   1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm and Newsletter Fields) 
	4. Don't select the 'Privacy Policy' checkbox option
	4. Click on 'Continue' button (ER-1)
	Result:
	1. Warning message - 'Warning: You must agree to the Privacy Policy!' should be displayed
 */
package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_0021 extends BaseClass
{
	@Test
	void registration()
	{
		logger.info("**********Started TC_RF_0021***************");
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
	regPage.clickContinue();
	logger.info("Enter Confirm Password");
	Assert.assertEquals(regPage.displayNotificationPrivacyPolicy(),true );
	logger.info(" Warning: You must agree to the Privacy Policy! Notification message is diapalyed");
	}
	catch(Exception e)
	{
		Assert.fail();
	}
	logger.info("***********************Finished TC_RF_0021******************");
}
}
