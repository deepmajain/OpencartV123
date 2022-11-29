package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
	public ContactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Element+Location
   @FindBy(xpath="//h1[normalize-space()='Contact Us']")WebElement msgHeadingContactus;
   
   //Action
   
   public String MsgDisplayedContactUs()
   {
	   try
	   {
	   return msgHeadingContactus.getText();
	   }
	   catch(Exception e)
	   {
		   return e.getMessage();
	   }
   }

}
