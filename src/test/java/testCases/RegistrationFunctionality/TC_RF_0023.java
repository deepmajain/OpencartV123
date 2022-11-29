package testCases.RegistrationFunctionality;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AboutUsPage;
import pageObject.AffilatePage;
import pageObject.BrandPage;
import pageObject.ContactUsPage;
import pageObject.DeliveryInformationPage;
import pageObject.ForgotPasswordPage;
import pageObject.GiftCertificatePage;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.PrivacyPolicyPage;
import pageObject.RegistrationPage;
import pageObject.ReturnPage;
import pageObject.SiteMapPage;
import pageObject.SpecialPage;
import pageObject.TermConditionPage;
import testBase.BaseClass;

public class TC_RF_0023 extends BaseClass {
	@Test
	public void registraion()
	{
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		RegistrationPage rp=new RegistrationPage(driver);
		rp.clickLoginLink();
		LoginPage lp=new LoginPage(driver);
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickRegisterdLink();
		Assert.assertEquals(rp.msgDisplayed(),"Register Account");
		
		rp.clickForGottenPswdLink();
		ForgotPasswordPage fp=new ForgotPasswordPage(driver);
		Assert.assertEquals(fp.magHeadingDispalyed(),"Forgot Your Password?");
		
		rp.clickMyAccountLink();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickAdressBookLink();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickWishListLink();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickOrderHistoryLink();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickDownloadsLink();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickRecurringPymentLink();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickRewardPointsLink();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickReturnLink();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickTransactionLink();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickNewsLetterLink();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickFooterAboutus();
		AboutUsPage abtus= new AboutUsPage(driver);
		Assert.assertEquals(abtus.MsgDisplayedAbotus(),"About Us");
		
		rp.clickFooterDeliveryInformation();
		DeliveryInformationPage info=new DeliveryInformationPage(driver);
		Assert.assertEquals(info.MsgDispalyedDiliveryInfo(),"Delivery Information");
		
		rp.clickFooterPrivacyPolicy();
		PrivacyPolicyPage pp=new PrivacyPolicyPage(driver);
		Assert.assertEquals(pp.MsgDisplayedPrivacyPolicy(),"Privacy Policy");
	    
		rp.clickFooterTermCondition();
		TermConditionPage tc=new TermConditionPage(driver);
		Assert.assertEquals(tc.MsgDispalyedTermCondition(),"Terms & Conditions");
		
		rp.clickFooterContactUs();
		ContactUsPage cp=new ContactUsPage(driver);
		Assert.assertEquals(cp.MsgDisplayedContactUs(),"Contact Us");
		
		rp.clickFooterReturn();
		ReturnPage rp1=new ReturnPage(driver);
		Assert.assertEquals(rp1.MsgDispalyedReturn(),"Product Returns");
		
		rp.clickFooterSiteMap();
		SiteMapPage smp=new SiteMapPage(driver);
		Assert.assertEquals(smp.MsgDispalyedSiteMap(),"Site Map");
		
		rp.clickFooterBrand();
		BrandPage bp=new BrandPage(driver);
		Assert.assertEquals(bp.MsgDispalyedBrand(),"Find Your Favorite Brand");
		
		rp.clickFooterGiftCertificate();
		GiftCertificatePage gcp=new GiftCertificatePage(driver);
		Assert.assertEquals(gcp.MsgDispalyedGiftCertificate(),"Purchase a Gift Certificate");
		
		rp.clickFooterAffilate();
		AffilatePage ap=new AffilatePage(driver);
		Assert.assertEquals(ap.MsgDispalyedAffilate(),"Affiliate Program");
		
		rp.clickFooterSpecials();
		SpecialPage sp=new SpecialPage(driver);
		Assert.assertEquals(sp.MsgDispalyedSpecial(),"Special Offers");
		
		rp.clickFooterMyAccount();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickFooterOrderHistory();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickFooterWishList();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");
		
		rp.clickFooterNewsLetter();
		Assert.assertEquals(lp.LoginConfMsgDisplayed(),"Login");	
		
		
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}

}
