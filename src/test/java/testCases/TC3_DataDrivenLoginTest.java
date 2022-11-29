package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC3_DataDrivenLoginTest extends BaseClass{
	
	
	@Test(dataProvider= "LoginData",dataProviderClass= DataProviders.class)
	public void loginDtt(String email,String pawd,String exp)
	{
		logger.info(" Starting TC3_LoginDataDrivenTest ");
		try
		{
		
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pawd);
		lp.clickLogin();
		
		MyAccountPage myacc=new MyAccountPage(driver);
		boolean target=myacc.isMyAccountPageDispalyed();
		
		if(exp.equals("Valid"))
		{
			if(target==true)
			{
			MyAccountPage myaccpage=new MyAccountPage(driver);
			 myaccpage.clickLogout();
			 Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		if(exp.equals("Invalid"))
			{
			if(target==true)
				{
				MyAccountPage myaccpage=new MyAccountPage(driver);
				myaccpage.clickLogout();
				 Assert.assertTrue(false);
				}
			else
				{
					Assert.assertTrue(true);			
		
				}
			}
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info(" Finished TC3_LoginDataDrivenTest ");
		}
}

