//Validate whether the 'Privacy Policy' checkbox option is not selected by default
/* TestCaseSteps:
	1. Click on 'My Account' Drop menu
	2. Click on 'Register' option 
	3. View the 'Privacy Policy' checkbox option (ER-1)
	Result:
	1. 'Privacy Policy' checkbox option is not selected by default
*/

package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_0020 extends BaseClass{
	@Test
	public void registration()
	{
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		RegistrationPage regpage=new RegistrationPage(driver);
		Assert.assertEquals(regpage.checkdPolicy.isSelected(), false);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}

}
