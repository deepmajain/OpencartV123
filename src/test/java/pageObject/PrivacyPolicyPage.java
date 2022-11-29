package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacyPolicyPage extends BasePage{

	public PrivacyPolicyPage(WebDriver driver) {
		super(driver);
	}
	 //Element+Location
		@FindBy(xpath="//h1[normalize-space()='Privacy Policy']") WebElement msgHeadingPrivacyPolicy;
		
	//Action	
	 public String MsgDisplayedPrivacyPolicy()
		   {
			   try
			   {
			   return msgHeadingPrivacyPolicy.getText();
			   }
			   catch(Exception e)
			   {
				   return e.getMessage();
			   }
		   }
	}

