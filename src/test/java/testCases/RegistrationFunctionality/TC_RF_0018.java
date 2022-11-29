
package testCases.RegistrationFunctionality;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_0018 extends BaseClass{
	@Test
	void registration()
	{
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		RegistrationPage regPage= new RegistrationPage(driver);
		Assert.assertEquals(regPage.textFirstName.getSize().getHeight(),34);
		Assert.assertEquals(regPage.textFirstName.getSize().getWidth(),701);

		Assert.assertEquals(regPage.textFirstName.getSize().getHeight(),34);
		Assert.assertEquals(regPage.textFirstName.getSize().getWidth(),701);
		
		Assert.assertEquals(regPage.textEmail.getSize().getHeight(),34);
		Assert.assertEquals(regPage.textEmail.getSize().getWidth(),701);
		
		Assert.assertEquals(regPage.textPhone.getSize().getHeight(),34);
		Assert.assertEquals(regPage.textPhone.getSize().getWidth(),701);
		
		Assert.assertEquals(regPage.textPassword.getSize().getHeight(),34);
		Assert.assertEquals(regPage.textPassword.getSize().getWidth(),701);
		
		Assert.assertEquals(regPage.textConfirmPasword.getSize().getHeight(),34);
		Assert.assertEquals(regPage.textConfirmPasword.getSize().getWidth(),701);
		
		Assert.assertEquals(regPage.btnContinue.getSize().getHeight(),34);
		Assert.assertEquals(regPage.btnContinue.getSize().getWidth(),77);
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	}

}
