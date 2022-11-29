
//Validate Registering an Account by providing all the fields
/* TestCase Steps:
   1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm, Newsletter and  Privacy Policy Fields)
	4. Click on 'Continue' button (ER-1)
	5. Click on 'Continue' button that is displayed in the 'Account Success' page (ER-2)
	
	Result:
	1. User should be logged in,  taken to 'Account Success' page and proper details should be displayed on the page
	2. User should be taken to 'Account' page 
 */
package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_003 extends BaseClass
	{
	
	@Test(groups={"Sanity","master"})
	void registration()
	{
		logger.info("**********Started TC_RF_003_Registarion***************");
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
		logger.info("***********************Finished TC_RF_003_Registration******************");
		}
	
	}
