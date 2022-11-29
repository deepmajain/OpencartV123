//Validate different ways of navigating to 'Register Account' page

/*TestCaseStep:
    1. Click on 'My Account' Drop menu
	2. Click on 'Register' option (ER-1) 
	3. Click on 'My Account' Drop menu
	4. Click on 'Login' option 
	5. Click  on 'Continue' button inside 'New Customer' box (ER-1) 
	6. Repeat Steps 3 and 4
	7. Click on 'Register' option from the Right Column options (ER-1) 
 Result:
 	1. User should be taken to 'Register Account' page
 */

package testCases.RegistrationFunctionality;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_007 extends BaseClass{

		@Test
		public void Registration()
		{
			logger.info("**********Started TC1_RF_007***************");
			try
			{
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("clicked on MyAccount");
			
			hp.clickRegister();
			logger.info("clicked on Registration");
			
			RegistrationPage rp=new RegistrationPage(driver);
			Assert.assertEquals(rp.isRegistraionAccPageDisplayed(),true);
			logger.info("Registration page is displayed");
			
			hp.clickMyAccount();
			logger.info("clicked on MyAccount");
			
			hp.clickLogin();
			logger.info("clicked on Login");
			
			LoginPage lp=new LoginPage(driver);
			lp.clickContinue();
			logger.info("clicked on Continue");
			
			Assert.assertEquals(rp.isRegistraionAccPageDisplayed(),true);
			logger.info("Registration page is displayed");
			
			hp.clickMyAccount();
			logger.info("clicked on MyAccount");
			
			hp.clickLogin();
			logger.info("clicked on Login");
			
			lp.clickLinkRegistration();
			logger.info("clicked on Registration link");
			
			Assert.assertEquals(rp.isRegistraionAccPageDisplayed(),true);
			logger.info("Registration page is displayed");
			
			
			}
			catch(Exception e)
			{
				Assert.fail();
			}
			
			logger.info("***********************Finished TC1_RF_007******************");
		}
	

}
