package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryInformationPage extends BasePage{

	public DeliveryInformationPage(WebDriver driver) {
		super(driver);
	}
	
	//Element+location
	@FindBy(xpath="//h1[normalize-space()='Delivery Information']")WebElement MsgHeadingDeliveryInfo;

	//Action
	 public String MsgDispalyedDiliveryInfo()
	   {
		   try
		   {
		   return MsgHeadingDeliveryInfo.getText();
		   }
		   catch(Exception e)
		   {
			   return e.getMessage();
		   }
	   }
	
}
