//Validate proper notification messages are displayed for the mandatory fields, when you don't provide any fields in the 'Register Account' page and submit
	
/*  1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. Don't enter anything into the fields
	4. Click on 'Continue' button (ER-1)
	
	Result:
	1. The below warning messages should be displayed for the respective fields:
	For First Name field, the warning message 'First Name must be between 1 and 32 characters!' should be displayed
	For Last Name field, the warning message 'Last Name must be between 1 and 32 characters!' should be displayed
	For E-Mail field, the warning message 'E-Mail Address does not appear to be valid!' should be displayed
	For Telephone field, the warning message 'Telephone must be between 3 and 32 characters!' should be displayed
	For Password field, the warning message 'Password must be between 4 and 20 characters!' should be displayed
	For Privacy Policy field, the warning message 'Warning: You must agree to the Privacy Policy!' should be displayed on the top
*/

package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_004 extends BaseClass
{
	@Test
	void registration()
	{
		logger.info("**********Started TC1_RF_004***************");
	try
	{
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	logger.info("clicked on MyAccount");
	
	hp.clickRegister();
	logger.info("clicked on Register");
	
	RegistrationPage regPage= new RegistrationPage(driver);
	regPage.clickContinue();
	logger.info("clicked on Continue");
	
	Assert.assertEquals(regPage.displayNotificationFirstName(),true );
	logger.info("First Name must be between 1 and 32 characters! Notification message is diapalyed");
	
	Assert.assertEquals(regPage.displayNotificationLastName(),true );
	logger.info("Last Name must be between 1 and 32 characters! Notification message is diapalyed");
	
	Assert.assertEquals(regPage.displayNotificationEmail(),true );
	logger.info("E-Mail Address does not appear to be valid! Notification message is diapalyed");
	
	Assert.assertEquals(regPage.displayNotificationPhoneNumber(),true );
	logger.info("Telephone must be between 3 and 32 characters! Notification message is diapalyed");
	
	Assert.assertEquals(regPage.displayNotificationPassword(),true );
	logger.info("Password must be between 4 and 20 characters!Notification message is diapalyed");
	
	Assert.assertEquals(regPage.displayNotificationCnfmPassprd(),true );
	logger.info("Password confirmation does not match password! Notification message is diapalyed");
	
	Assert.assertEquals(regPage.displayNotificationPrivacyPolicy(),true );
	logger.info(" Warning: You must agree to the Privacy Policy! Notification message is diapalyed");
	}
	catch(Exception e)
	{
		Assert.fail();
	}
	logger.info("***********************Finished TC1_RF_004******************");
}
}
