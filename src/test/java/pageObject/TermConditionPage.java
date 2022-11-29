package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TermConditionPage extends BasePage {

	public TermConditionPage(WebDriver driver) {
		super(driver);
	}
	//Element+location
			@FindBy(xpath="//h1[normalize-space()='Terms & Conditions']")WebElement MsgHeadingTermCondition;

			//Action
			 public String MsgDispalyedTermCondition()
			   {
				   try
				   {
				   return MsgHeadingTermCondition.getText();
				   }
				   catch(Exception e)
				   {
					   return e.getMessage();
				   }
			   }


}
