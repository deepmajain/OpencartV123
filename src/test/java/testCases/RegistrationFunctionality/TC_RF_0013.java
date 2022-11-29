//Validate all the fields in the Register Account page have the proper placeholders
/* TestCaseSteps:
	1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. View the First Name, Last Name, E-Mail, Telephone, Password, Password Confirm fields for Placeholders (ER-1)

	
	Result:
	1. Proper Placeholder texts should be displayed in these fields
	
*/

package testCases.RegistrationFunctionality;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;
public class TC_RF_0013 extends BaseClass {
	@Test(groups={"Sanity","master"})
	void registration()
	{
		logger.info("**********Started TC_RF_0013_Registarion***************");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccount");
		
		hp.clickRegister();
		logger.info("clicked on Register");
		
		RegistrationPage regPage= new RegistrationPage(driver);
		Assert.assertEquals(regPage.textFirstName.getAttribute("placeholder"),"First Name");
		logger.info(" First Name place holder displayed");
		
		Assert.assertEquals(regPage.textLastName.getAttribute("placeholder"),"Last Name");
		logger.info(" Last Name place holder displayed");
		
		Assert.assertEquals(regPage.textEmail.getAttribute("placeholder"),"E-Mail");
		logger.info("Email place holder displayed");
		
		Assert.assertEquals(regPage.textPhone.getAttribute("placeholder"),"Telephone");
		logger.info("Phone Number place holder displayed");
		
		Assert.assertEquals(regPage.textPassword.getAttribute("placeholder"),"Password");
		logger.info(" Password place holder displayed");
		
		Assert.assertEquals(regPage.textConfirmPasword.getAttribute("placeholder"),"Password Confirm");
		logger.info("Confirm Password place holder displayed");
				}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("***********************Finished TC_RF_0013_Registration******************");
		}

}
