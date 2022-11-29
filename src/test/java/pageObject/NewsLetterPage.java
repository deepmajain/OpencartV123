package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsLetterPage extends BasePage{

	public NewsLetterPage(WebDriver driver) {
		super(driver);
	}
	
	//Element
	@FindBy(xpath="//input[@value='1']")WebElement btnYesByDefault;
	@FindBy(xpath="//input[@value='0']")WebElement btnNoByDefault;
	
	
	//Action
	public boolean selctedByDefaultYes()
	{
		boolean status=btnYesByDefault.isSelected();
		return(status);
	}
	public boolean selctedByDefaultNo()
	{
		boolean status=btnNoByDefault.isSelected();
		return(status);
	}
	

}
