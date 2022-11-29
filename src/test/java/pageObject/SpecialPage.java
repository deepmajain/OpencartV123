package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialPage extends BasePage{

	public SpecialPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Element+location
		@FindBy(xpath="//h2[normalize-space()='Special Offers']")WebElement MsgHeadingSpecial;

		//Action
		 public String MsgDispalyedSpecial()
		   {
			   try
			   {
			   return MsgHeadingSpecial.getText();
			   }
			   catch(Exception e)
			   {
				   return e.getMessage();
			   }
		   }


}
