package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffilatePage extends BasePage {

	public AffilatePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Element+location
		@FindBy(xpath="//h1[normalize-space()='Affiliate Program']")WebElement MsgHeadingAffilate;

		//Action
		 public String MsgDispalyedAffilate()
		   {
			   try
			   {
			   return MsgHeadingAffilate.getText();
			   }
			   catch(Exception e)
			   {
				   return e.getMessage();
			   }
		   }


}
