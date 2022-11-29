package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
		
		//Element+Location
		@FindBy(xpath="//h1[normalize-space()='Search - mac']")WebElement MsgHeading;
		@FindBy(xpath="//div[4]//div[1]//div[2]//div[2]//button[1]") WebElement btnAddToCart;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement ConfMsg;
		//Action
		
		public boolean isSearchPageExits()
		{
			try {
				return(MsgHeading.isDisplayed());
				}
			catch(Exception e)
			{
				return(false);
			}
		}
		
		public void ClickbtnAddToCart()
		{
			btnAddToCart.click();
		}
		public boolean isItemSuccessFullyAddConfMsgDispalyed()
		{
			try 
			{
			return(ConfMsg.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}
		}
		
		
	}


