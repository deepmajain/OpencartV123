package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandPage extends BasePage{

	public BrandPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Element+location
		@FindBy(xpath="//h1[normalize-space()='Find Your Favorite Brand']")WebElement MsgHeadingBrand;

		//Action
		 public String MsgDispalyedBrand()
		   {
			   try
			   {
			   return MsgHeadingBrand.getText();
			   }
			   catch(Exception e)
			   {
				   return e.getMessage();
			   }
		   }


}
