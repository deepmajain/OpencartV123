package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSuccessPage extends BasePage {

	public OrderSuccessPage(WebDriver driver) {
		super(driver);
	}
	//Element+Location
	
	@FindBy(xpath="//p[normalize-space()='Your order has been successfully processed!']")WebElement ConfirMsg;
	@FindBy(xpath="//a[normalize-space()='Continue']") WebElement btnContinue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement confirmationMsg;
	
	//Action
	//order confirmation message
		public boolean isOrderPlacedMsg()
		{
			try
			{
			return(ConfirMsg.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}
		}
		public void clickContinue()
		{
			btnContinue.click();
		}
		public boolean isaccountRegisteredMsg()
		{
			try
			{
				return(confirmationMsg.isDisplayed());
			}
		  catch (Exception e)
			{
			  	return(false);
			}
		}
}
		
 

