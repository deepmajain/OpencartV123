package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends BasePage
	{
	WebDriver driver;
	
		public MyAccountPage(WebDriver driver)
		{
			super(driver);
		}
		
		//Element+Location
		@FindBy(xpath="//h2[text()='My Account']") WebElement MsgHeading;
		@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
		WebElement lnkLogout;
		@FindBy(xpath="//a[normalize-space()='Subscribe / unsubscribe to newsletter']")WebElement subscriptionUnsubNewsLetter;
		
		
		
		//Action
		public boolean isMyAccountPageDispalyed()
		{
			try
			{
				return(MsgHeading.isDisplayed());		
			}
			catch(Exception e)
			{
				return(false);
			}
		 
		}
		public void clickLogout() 
		{
			lnkLogout.click();
		}
		public void clickLinkSubsUnsubsLetter()
		{
			subscriptionUnsubNewsLetter.click();
		}
		
	
	}
