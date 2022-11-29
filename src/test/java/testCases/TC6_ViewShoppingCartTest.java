package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SearchPage;
import testBase.BaseClass;

public class TC6_ViewShoppingCartTest extends BaseClass {
	
	@Test
	public void viewShoppingCart()
	{
		logger.info("***************Starting TC5_ViewShoppingCartTest ******************");
	
			try
			{
				HomePage hp=new HomePage(driver);
				hp.textSearch();
				hp.clickSearchBtn();
				
				SearchPage sp=new SearchPage(driver);
				sp.ClickbtnAddToCart();
			    
				hp.ClicklinkShoppingCart();			
			}
		
			catch(Exception e)
			{
				Assert.fail();
			}
				logger.info("*************** Finished TC5_ViewShoppingCartTest******************");
	 
		}	
	}

