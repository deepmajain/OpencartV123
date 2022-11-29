package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class CheckOutPage extends BasePage{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	//Element+location******************************************************************
	
	@FindBy(xpath="//h1[normalize-space()='Checkout']")WebElement CheckoutmsgHeading;
	
	//Billing detail
	@FindBy(xpath="//input[@id='input-payment-firstname']")WebElement textFname;
	@FindBy(xpath="//input[@id='input-payment-lastname']")WebElement textLname;
	@FindBy(xpath="//input[@id='input-payment-company']")WebElement textCompanyName;
	@FindBy(xpath="//input[@id='input-payment-address-1']")WebElement textAddress1;
	@FindBy(xpath="//input[@id='input-payment-address-2']")WebElement textAddress2;
	@FindBy(xpath="//input[@id='input-payment-city']")WebElement textCity;
	@FindBy(xpath="//input[@id='input-payment-postcode']")WebElement textPostCode;
	@FindBy(xpath="//select[@id='input-payment-country']") WebElement selectCountry;
	@FindBy(xpath="//select[@id='input-payment-zone']")WebElement selectZone;
	
	//click on radio button to choose exiting address or new address for billing
	@FindBy(xpath="//input[@value='existing']") WebElement existingAddBilling;
	@FindBy(xpath="//input[@value='new']")WebElement newAddBilling;
	@FindBy(xpath="//input[@id='button-payment-address']")WebElement btnContinueBilling;
	
	//click on radio button to choose exiting address or new address for Shipping
	@FindBy(xpath="//label[normalize-space()='I want to use an existing address']//input[@name='shipping_address']")WebElement existingAddShiping;
	@FindBy(xpath="//input[@id='button-shipping-address']")WebElement btnContinueShipping;
	
	//click on radio button for delivery method
	@FindBy(xpath="//input[@name='shipping_method']") WebElement clickShippingMethod;
	@FindBy(xpath="//input[@id='button-shipping-method']")WebElement btnContinuedeliveryMethod;
	
	//click on radio button for pyment method
	@FindBy(xpath="//input[@name='payment_method']") WebElement clickPymentMethod;
	@FindBy(xpath="//input[@name='agree']") WebElement clickAgree;//select term and condition
	@FindBy(xpath="//input[@id='button-payment-method']")WebElement btnContinuePayMentMethod;
	
	//Confirm Order
	@FindBy(xpath="//input[@id='button-confirm']") WebElement btnConfirmOeder;
	

	
	
	//Action*********************************************************************************
	//methods for Billing
	public void setFname(String fname)
	{
		textFname.sendKeys(fname);
	}
	public void setLname(String lname)
	{
		textLname.sendKeys(lname);
	}
	public void setCpmpanyName(String comp)
	{
		textCompanyName.sendKeys(comp);
	}
	public void setAddress1(String add1)
	{
		textAddress1.sendKeys(add1);
	}
	public void setAddress2(String add2)
	{
		textAddress2.sendKeys(add2);
	}
	public void setcity(String city)
	{
		textCity.sendKeys(city);
	}
	public void setPostCode(String postcode)
	{
		textPostCode.sendKeys(postcode);
	}
	public void setCountry(String country)
	{
		Select sel=new Select(selectCountry);
		sel.selectByVisibleText(country);
	}
	public void setZone(String zone)
	{
		Select sel1=new Select(selectZone);
		sel1.selectByVisibleText(zone);
	}
	
	
	//To select radio button existing address for billing
	public void clickAddBilling()
	{
		existingAddBilling.click();
		
	}
	public void clicknewAddBilling()
	{
		newAddBilling.click();
	}
	public void clickBtnContinueBilling()
	{
		btnContinueBilling.click();
	}
	//To select radio button existing address for Shipping
	public void clickExistingAddShipping() 
	{
		//existingAddShiping.click();
		btnContinueShipping.click();
		
	}
	//click on delivery method
	public void clickDeliveryMethod()
	{
		//clickShippingMethod.click();
		btnContinuedeliveryMethod.click();
	}
	
	//click on payment method
	public void clickPaymentMethod()
	{
		//clickPymentMethod.click();
		clickAgree.click();
		btnContinuePayMentMethod.click();	
	}
	
	//confirm order
	
	public void clickConfirmButton()
	{
		btnConfirmOeder.click();
	}
	
	//checkout message displayed
	public boolean checkOutFromShoppingCart()
	{
		try
			{
			return(CheckoutmsgHeading.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}
		
	
	
	}
}


