//Validate whether the Mandatory fields in the Register Account page are accepting only spaces
/*
	1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. Enter spaces into the Mandatory Fields (First Name, Last Name, E-Mail,Telephone, Password and Password Confirm)
	4. Click on 'Continue' button (ER-1)
	

Result:
	1. Warning message should be displayed for these Mandatory fields
*/	

package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_0016 extends BaseClass
{
	@Test
	void registration()
	{
		logger.info("**********Started TC1_RF_0016***************");
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
	logger.info("First Name must be between 1 and 32 characters! mandatory field Notification message is diapalyed");
	
	Assert.assertEquals(regPage.displayNotificationLastName(),true );
	logger.info("Last Name must be between 1 and 32 characters! mandatory field Notification message is diapalyed ");
	
	Assert.assertEquals(regPage.displayNotificationEmail(),true );
	logger.info("E-Mail Address does not appear to be valid! mandatory field Notification message is diapalyed");
	
	Assert.assertEquals(regPage.displayNotificationPhoneNumber(),true );
	logger.info("Telephone must be between 3 and 32 characters!mandatory field Notification message is diapalyed");
	
	Assert.assertEquals(regPage.displayNotificationPassword(),true );
	logger.info("Password must be between 4 and 20 characters!mandatory field Notification message is diapalyed");
	
	Assert.assertEquals(regPage.displayNotificationCnfmPassprd(),true );
	logger.info("please enter cinfirmation password!mandatory field Notification message is diapalyed");
	
	}
	catch(Exception e)
	{
		Assert.fail();
	}
	logger.info("***********************Finished TC1_RF_0016******************");
}
}
