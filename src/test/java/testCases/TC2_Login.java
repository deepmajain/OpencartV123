package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC2_Login extends BaseClass
	{
	
	@Test(groups={"Sanity","regression"})
	public void login()
	{
		logger.info("**************Started TC2_Login***************");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on my account link");
		
		hp.clickLogin();
		logger.info("clicked on login linkt");
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("loginId"));
		logger.info("Entered EmailId for login");
		
		lp.setPassword(rb.getString("pswd"));
		logger.info("Enterd Password for login");
		
		lp.clickLogin();
		logger.info("clicked on login botton");
		
		String confmsg=lp.confirmationMsg();
		Assert.assertEquals(confmsg,"My Account");
		logger.info("My Account login cinfirmation msg printed");
		
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("**************Finished TC2_Login***************");
	}
	}
