package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SiteMapPage extends BasePage{

	public SiteMapPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Element+location
		@FindBy(xpath="//h1[normalize-space()='Site Map']")WebElement MsgHeadingSiteMap;

		//Action
		 public String MsgDispalyedSiteMap()
		   {
			   try
			   {
			   return MsgHeadingSiteMap.getText();
			   }
			   catch(Exception e)
			   {
				   return e.getMessage();
			   }
		   }

}
