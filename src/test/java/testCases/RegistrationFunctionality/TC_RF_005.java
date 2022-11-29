//Validate Registering an Account when 'Yes' option is selected for Newsletter field

/*  TestCaseStep:
 	1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm and  Privacy Policy Fields)
	4.Click on 'Yes' radio option for Newsletter 
	5. Click on 'Continue' button (ER-1)
	6. Click on 'Continue' button that is displayed in the 'Account Success' page (ER-2)
	7. Click on 'Subscribe/unsubscribe to newsletter' option (ER-3)
	
    Result:
    	1. User should be logged in,  taken to 'Account Success' page and proper details should be displayed on the page
    	2. User should be taken to 'Account' page 
    	3. 'Yes' option should be displayed as selected by default in the Newsletter page 
 */
    	

package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MyAccountPage;
import pageObject.NewsLetterPage;
import pageObject.OrderSuccessPage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_005 extends BaseClass 
  {
	@Test
	void registration()
	{
		logger.info("**********Started TC1_RF_005***************");
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
	
	regPage.clickYesNewsLetterSubscription();
	logger.info("clicked on yes to subscription letter");
	
	regPage.setPrivacyPolicy();
	logger.info("clicked on privacy policy");
	
	regPage.clickContinue();
	logger.info("clicked on Continue");
	OrderSuccessPage sp=new OrderSuccessPage(driver);
	
	sp.clickContinue();
	logger.info("clicked on Continue on successpage");
	
	MyAccountPage accpage=new MyAccountPage(driver);
	accpage.clickLinkSubsUnsubsLetter();
	logger.info("clicked on subscribe/unsubscribe link");
	
	NewsLetterPage nl=new NewsLetterPage(driver);
	Assert.assertEquals(nl.selctedByDefaultYes(),true);	
	logger.info("news paper subscription bydefault selected 'yes'");
	}
	catch(Exception e)
	{
		Assert.fail();
	}
	logger.info("***********************Finished TC1_RF_005******************");
}


}
