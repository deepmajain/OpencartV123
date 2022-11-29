package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShoppingCartPage extends BasePage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		}
	 
	  //Element+Location
		@FindBy(xpath="//a[@class='btn btn-primary']")WebElement btnCheckout;
		@FindBy(xpath="//a[normalize-space()='Continue']")WebElement btnContinue;
		@FindBy(xpath="//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]") WebElement emptyMsgHeading;
		//Action
		
		public void clickBtnChckout()
		{
			btnCheckout.click();
		}
		public void clickBtnContinue()
		{
			btnContinue.click();
		}
		
		public boolean isEmptyConfMsgDispalyed()
		{
			try
			{
			return(emptyMsgHeading.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}
			
		}

		
	

}
