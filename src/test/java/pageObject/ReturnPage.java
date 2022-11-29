package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnPage extends BasePage {

	public ReturnPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Element+location
		@FindBy(xpath="//h1[normalize-space()='Product Returns']")WebElement MsgHeadingReturn;

		//Action
		 public String MsgDispalyedReturn()
		   {
			   try
			   {
			   return MsgHeadingReturn.getText();
			   }
			   catch(Exception e)
			   {
				   return e.getMessage();
			   }
		   }


}
