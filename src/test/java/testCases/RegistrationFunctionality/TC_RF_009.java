//Validate Registering an Account by providing the existing account details (i.e. existing email address)
/* TestCaseSteps
	1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. Enter existing Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm, Newsletter and  Privacy Policy Fields) - <Refer Test Data>
	4. Click on 'Continue' button (ER-1)
	
	Result:
	1. Account should not be created again, instead the warning messsage -  'Warning: E-Mail Address is already registered!' should be displayed
 */
package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_009 extends BaseClass
	{
	
	@Test(groups={"Sanity","master"})
	void registration()
	{
		logger.info("**********Started TC_RF_009_Registarion***************");
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
		
		regPage.setEmail("admin@gmail.com");
		logger.info("Enter Email");
		
		regPage.setPhoneNumber(randomNumber());
		logger.info("Enter Phone Number");
		
		regPage.setPassword("123abc");
		logger.info("Enter Password");
		
		regPage.setCnfmPassprd("123abc");
		logger.info("Enter confirmation wrong Password");
		
		regPage.setPrivacyPolicy();
		logger.info("clicked on privacy policy");
		
		regPage.clickContinue();
		logger.info("clicked on Continue");
	
		Assert.assertEquals(regPage.displayNotificationEmailAlreadyRegistred(),true);
		logger.info("Email Already Registered! Notification message is diapalyed");
		}
		catch (Exception e)
		{
			logger.error("Tests case got failed");
			Assert.fail();
		}
		logger.info("***********************Finished TC_RF_009_Registration******************");
		}
	
	}

