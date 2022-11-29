package testCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CheckOutPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.OrderSuccessPage;
import pageObject.SearchPage;
import pageObject.ShoppingCartPage;
import testBase.BaseClass;

public class TC8_CheckOutForBuyProductTest extends BaseClass{
	@Test
	public void MakeOrderdItem()
	{
		logger.info("************Starting TC7_OrderdItem*********************");
		try
		{
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("loginId"));
			lp.setPassword(rb.getString("pswd"));
			lp.clickLogin();
			
			hp.textSearch();
			hp.clickSearchBtn();
			
			SearchPage sp=new SearchPage(driver);
			sp.ClickbtnAddToCart();
		    
			ShoppingCartPage shopcart=new ShoppingCartPage(driver);
			hp.ClicklinkShoppingCart();
			shopcart.clickBtnChckout();
			
		
			CheckOutPage chkotpg=new CheckOutPage(driver);
			chkotpg.clicknewAddBilling();
			chkotpg.setFname(randomString());
			chkotpg.setLname(randomString());
			chkotpg.setCpmpanyName(randomString());
			chkotpg.setAddress1(randomString());
			chkotpg.setAddress2(randomString());
			chkotpg.setcity(randomString());
			chkotpg.setPostCode(randomNumber());
			chkotpg.setCountry("India");
			chkotpg.setZone("Bihar");
			chkotpg.clickBtnContinueBilling();
			chkotpg.clickExistingAddShipping();
			chkotpg.clickDeliveryMethod();
			chkotpg.clickPaymentMethod();
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			chkotpg.clickConfirmButton();
			Alert alert=mywait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
			chkotpg.clickConfirmButton();
			//chkotpg.clickConfirmButton();
			OrderSuccessPage succ=new OrderSuccessPage(driver);
            boolean status=succ.isOrderPlacedMsg();
            Assert.assertEquals(status,true);
	
	   }
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("************Finished TC7_OrderdItem*********************");
	}
   }

