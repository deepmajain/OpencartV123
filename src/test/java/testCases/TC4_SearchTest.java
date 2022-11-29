package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.SearchPage;
import testBase.BaseClass;

public class TC4_SearchTest extends BaseClass {
	
	@Test
	public void Search()
	{		
		logger.info("************Starting TC4_SearchProduct********************");
		try 
		{
		HomePage hp=new HomePage(driver);
		hp.textSearch();
		hp.clickSearchBtn();
		
		SearchPage sp=new SearchPage(driver);
		boolean status=sp.isSearchPageExits();
		Assert.assertEquals(status,true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("************Finished TC4_SearchProduct********************");
	}
}
