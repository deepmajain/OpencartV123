//Validate all the mandatory fields in the Register Account page are marked with red color * symbol
/*TestCaseSteps:
  1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. Check the Fields - First Name, Last Name, E-Mail, Telephone, Password, Password Confirm and Privacy Policy
	
	Result:
	1. All the specified Fields in the Test Steps should be marked with red color * symbol
 */
package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_0014 extends BaseClass {
	@Test(groups={"Sanity","master"})
	void registration()
	{
		logger.info("**********Started TC_RF_0014_Registarion***************");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccount");
		
		hp.clickRegister();
		logger.info("clicked on Register");
		
		RegistrationPage regPage= new RegistrationPage(driver);
		Assert.assertEquals(regPage.labelFirstName(),"rgba(102, 102, 102, 1)");
		logger.info(" Label First Name mandatory sign '*' displayed in red colour");
		
		Assert.assertEquals(regPage.labelLastName(),"rgba(102, 102, 102, 1)");
		logger.info("Label Last Name mandatory sign '*' displayed in red colour");
		
		Assert.assertEquals(regPage.labelEmail(),"rgba(102, 102, 102, 1)");
		logger.info("Label Email mandatory sign '*' displayed in red colour");
		
		Assert.assertEquals(regPage.labelPhoneNumber(),"rgba(102, 102, 102, 1)");
		logger.info(" Label Phone number mandatory sign '*' displayed in red colour");
		
		Assert.assertEquals(regPage.labelPassword(),"rgba(102, 102, 102, 1)");
		logger.info(" Label Password mandatory sign '*' displayed in red colour");
		
		Assert.assertEquals(regPage.labelConfPassword(),"rgba(102, 102, 102, 1)");
		logger.info(" Label cinfirm password mandatory sign '*' displayed in red colour");
				}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("***********************Finished TC_RF_0014_Registration******************");
		}

}
