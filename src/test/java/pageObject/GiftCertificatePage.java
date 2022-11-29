package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCertificatePage extends BasePage{

	public GiftCertificatePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Element+location
		@FindBy(xpath="//h1[normalize-space()='Purchase a Gift Certificate']")WebElement MsgHeadingGiftCertificate;

		//Action
		 public String MsgDispalyedGiftCertificate()
		   {
			   try
			   {
			   return MsgHeadingGiftCertificate.getText();
			   }
			   catch(Exception e)
			   {
				   return e.getMessage();
			   }
		   }


}
