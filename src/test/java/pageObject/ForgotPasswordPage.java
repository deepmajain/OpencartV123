package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	//Element +Location
	@FindBy(xpath="//h1[normalize-space()='Forgot Your Password?']")WebElement MsgHeading;
	
	//Action
	public String magHeadingDispalyed()
	{
		try
		{
			return MsgHeading.getText();
		}
		catch (Exception e)
		{
		  return e.getMessage();
		}
	}

}
