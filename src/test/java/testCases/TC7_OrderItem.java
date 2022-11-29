package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CheckOutPage;
import pageObject.HomePage;
import pageObject.SearchPage;
import pageObject.ShoppingCartPage;
import testBase.BaseClass;

public class TC7_OrderItem extends BaseClass{
	@Test
	public void MakeOrderdItem()
	{
		logger.info("************Starting TC7_OrderdItem*********************");
		try
		{
			HomePage hp=new HomePage(driver);
			hp.textSearch();
			hp.clickSearchBtn();
			
			SearchPage sp=new SearchPage(driver);
			sp.ClickbtnAddToCart();
		    
			ShoppingCartPage shopcart=new ShoppingCartPage(driver);
			hp.ClicklinkShoppingCart();
			shopcart.clickBtnChckout();
			
			CheckOutPage chkoutpag=new CheckOutPage(driver);
			boolean status=chkoutpag.checkOutFromShoppingCart();
			Assert.assertEquals(status,true);
	   }
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("************Finished TC7_OrderdItem*********************");
	}
   }
