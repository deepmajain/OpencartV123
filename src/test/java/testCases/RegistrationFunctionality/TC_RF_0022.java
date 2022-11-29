package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_0022 extends BaseClass {
	
	@Test
	public void registred()
	{
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		RegistrationPage rp=new RegistrationPage(driver);
		Assert.assertEquals(rp.textPassword.getAttribute("type"),"password");	
		}
		catch(Exception e )
		{
			Assert.fail();
		}
	}

}
