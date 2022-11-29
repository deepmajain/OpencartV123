//Validate Registering an Account by providing an invalid email address into the E-Mail field
/* TestCaseSteps:
   	1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. Enter new Account Details into all the Fields (First Name, Last Name,Telephone, Password, Password Confirm, Newsletter and  Privacy Policy Fields) 
	4. Enter invalid email address into the E-Mail Field - <Refer Test Data>
	5. Click on 'Continue' button (ER-1)

Result:
	1. Account should not be created, instead a proper field level warning message or page level warning message to provide valid email address should be displayed
 */
package testCases.RegistrationFunctionality;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.OrderSuccessPage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_0010 extends BaseClass
	{
	
	@Test(groups={"Sanity","master"})
	void registration()
	{
		logger.info("**********Started TC_RF_0010_Registarion***************");
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
		
		Assert.assertEquals(regPage.setEmail(randomString()),regPage.textEmail.getAttribute("validationMessage"));
		logger.info("Enter Email");
		
		regPage.setPhoneNumber(randomString());
		logger.info("Enter Phone Number");
		
		regPage.setPassword("123abc");
		logger.info("Enter Password");
		
		regPage.setCnfmPassprd("123abc");
		logger.info("Enter confirmation wrong Password");
		
		regPage.setPrivacyPolicy();
		logger.info("clicked on privacy policy");
		
		regPage.clickContinue();
		logger.info("clicked on Continue");
		
		Assert.assertEquals(regPage.setEmail(randomString()+"@"),regPage.textEmail.getAttribute("validationMessage"));
		logger.info("please write proper email");
		
		regPage.clickContinue();
		Assert.assertEquals(regPage.setEmail(randomString()+"@gmail."),regPage.textEmail.getAttribute("validationMessage"));
		logger.info("please write proper email");
		
		regPage.clickContinue();
		regPage.setEmail(randomString()+"@gmail.com");
		logger.info("accepted proper Email address");
		
		regPage.clickContinue();
		OrderSuccessPage osp=new OrderSuccessPage(driver);
		Assert.assertEquals(osp.isaccountRegisteredMsg(),true);
		logger.info("Account is registered msg is displayed");
		
		}
		catch (Exception e)
		{
			
			Assert.fail();
		}
		logger.info("***********************Finished TC_RF_0010_Registration******************");
		}
	
	}
