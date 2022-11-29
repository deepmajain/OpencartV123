package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SearchPage;
import testBase.BaseClass;

public class TC5_AddToCartTest extends BaseClass
	{
	
	@Test
	 public void addToCart()
	 {
		try
		{
			HomePage hp=new HomePage(driver);
			hp.textSearch();
			hp.clickSearchBtn();
			
			SearchPage sp=new SearchPage(driver);
			sp.ClickbtnAddToCart();
		    
		    boolean  status=sp.isItemSuccessFullyAddConfMsgDispalyed();
		    Assert.assertEquals(status, true);
		}
	
		catch(Exception e)
		{
			Assert.fail();
		}
		
	 }
	}