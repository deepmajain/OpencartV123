package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_0019 extends BaseClass {
	@Test
	public void regiatration()
	{
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		RegistrationPage rp=new RegistrationPage(driver);
		//rp.setFirstName("                 deepma                       ");
		Assert.assertEquals(rp.setFirstName("                 deepma                       "),"deepma");
		rp.setLastName(" pual  ");
		rp.setEmail("   xxxxxx@gmail.com  ");
		rp.setPhoneNumber("  546465465   ");
		rp.setPassword("  abcd  ");
		rp.setCnfmPassprd("  abcd  ");
		/*Assert.assertEquals(rp.setFirstName("  deepma   "),"deepma" )
		Assert.assertEquals(rp.setLastName(" pual  "),true);
		Assert.assertEquals(rp.setEmail("   xxxxxx@gmail.com  "),true);
		Assert.assertEquals(rp.setPhoneNumber("  546465465   "),true);
		Assert.assertEquals(rp.setPassword("  abcd  "),true);
		Assert.assertEquals(rp.setCnfmPassprd("  abcd  "),true);*/
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}

}
