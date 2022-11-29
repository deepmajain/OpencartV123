//Validate Registering an Account by using the Keyboard keys
/*TestCaseSteps:
	1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm, 
	Newsletter and  Privacy Policy Fields) by using Keyboard keys (Tab, Spacebar and Enter)
	4. Click on 'Continue' button (ER-1)
	
	Result:
	1. User should be logged in,  taken to 'Account Succcess' page and proper details should be displayed on the page
 */
package testCases.RegistrationFunctionality;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.OrderSuccessPage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_0012 extends BaseClass {
	@Test(groups={"Sanity","master"})
	void registration()
	{
		logger.info("**********Started TC_RF_0012_Registarion***************");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccount");
		
		hp.clickRegister();
		logger.info("clicked on Register");
		
		RegistrationPage regPage= new RegistrationPage(driver);
		regPage.setFirstName(randomString());
		logger.info("Entred First Name");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB,randomString()).perform();
		logger.info("Entred Last Name using action class TAB button");
		
		act.sendKeys(Keys.TAB,randomString()+"@gmail.com").perform();
		logger.info("Entred Email Add using action class TAB button");
		
		act.sendKeys(Keys.TAB,randomString()).perform();
		logger.info("Entred Phone Number using action class TAB button");
		
		act.sendKeys(Keys.TAB,"deep123").perform();
		logger.info("Entred password using action class TAB button");
		
		act.sendKeys(Keys.TAB,"deep123").perform();
		logger.info("Entred confirm poassword using action class TAB button");
		
		
		act.sendKeys(Keys.TAB).perform();//select Bydefault "no"
		logger.info("selectd newsletter subscription  by default no using TAB key");
		
		act.sendKeys(Keys.TAB).perform();//privacy and policy select
		logger.info("switch on using TAB key");
		
		act.sendKeys(Keys.TAB).perform();
		logger.info("sitch on privacy policy selection box using TAB key");
		
		regPage.setPrivacyPolicy();
		logger.info("clicked on privacy policy ");
		
		act.sendKeys(Keys.TAB).perform();
		logger.info("switch to continue button using TAB key");
		
		act.sendKeys(Keys.ENTER).perform();
		logger.info("click on continue button using ENTER kry");
		
		OrderSuccessPage osp=new OrderSuccessPage(driver);
		Assert.assertEquals(osp.isaccountRegisteredMsg(),true);
		logger.info("Account successfully registered msg dispalyed");
		}
		
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("***********************Finished TC_RF_0012_Registration******************");
		}


}
