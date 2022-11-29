package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
	{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Element+Location
	
	@FindBy(xpath="//input[@id='input-email']") WebElement textEmail;
	@FindBy(xpath="//input[@id='input-password']") WebElement textPassword;
	@FindBy(xpath="//input[@value='Login']") WebElement btnLogin;
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement confMsg;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")WebElement btnContinue;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Register']")WebElement linkRegistration;
	
	//login page link text validation
	@FindBy(xpath="//ul[@class='breadcrumb']//a[normalize-space()='Login']")WebElement HeadingLoginPage;
	
	//Action
	
	public void setEmail(String email)
	{
		textEmail.sendKeys(email);
	}
	public void setPassword(String pswd)
	{
		textPassword.sendKeys(pswd);
	}
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public String confirmationMsg()
	{
		try
		{
		return (confMsg.getText());
	
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
	public void clickLinkRegistration()
	{
		linkRegistration.click();
	}
	
	public String LoginConfMsgDisplayed()
	{
		try
		{
		return (HeadingLoginPage.getText());
	
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	
	}
	
	}
