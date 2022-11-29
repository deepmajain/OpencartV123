package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage
	{
		WebDriver driver;
		
		public HomePage(WebDriver driver)
		{
			super(driver);
		}
		
		//Elements+location
		@FindBy(xpath="//span[normalize-space()='My Account']") WebElement linkMyAccount;
		@FindBy(linkText="Register") WebElement linkRegister;
		@FindBy(linkText="Login") WebElement linklogin;
		@FindBy(xpath="//input[@placeholder='Search']") WebElement textSearch;
		@FindBy(xpath="//button[@class='btn btn-default btn-lg']")WebElement btnSearch; 
		@FindBy(xpath="//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']") WebElement linkShoppingCart; 
		
		//action
		
		public void clickMyAccount()
		{
			linkMyAccount.click();
		}
		public void clickRegister()
		{
			linkRegister.click();
		}
		public void clickLogin()
		{
			linklogin.click();
		}
		public void textSearch()
		{
			textSearch.sendKeys("mac");
		}
		public void clickSearchBtn()
		{
			btnSearch.click();
		}
		public void ClicklinkShoppingCart()
		{
			linkShoppingCart.click();
		}

	}
