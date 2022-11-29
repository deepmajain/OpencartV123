package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends BasePage {

	public AboutUsPage(WebDriver driver) {
		super(driver);
	}
	//Element+Location
   @FindBy(xpath="//h1[normalize-space()='About Us']")WebElement msgHeading;
   
   //Action
   
   public String MsgDisplayedAbotus()
   {
	   try
	   {
	   return msgHeading.getText();
	   }
	   catch(Exception e)
	   {
		   return e.getMessage();
	   }
   }
}
