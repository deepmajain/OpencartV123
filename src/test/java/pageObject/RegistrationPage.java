package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends BasePage
	{
		WebDriver driver;
		public RegistrationPage(WebDriver driver)
		{
			super(driver);
		}
		
		//Elements+location
		@FindBy(xpath="//h1[normalize-space()='Register Account']")WebElement msgHeading; //for validate msg heading
		
		@FindBy(xpath="//input[@id='input-firstname']")
		public WebElement textFirstName;
		@FindBy(xpath="//input[@id='input-lastname']")
		public WebElement textLastName;
		@FindBy(xpath="//input[@id='input-email']")
		public WebElement textEmail;
		@FindBy(xpath="//input[@id='input-telephone']")
		public WebElement textPhone;
		@FindBy(xpath="//input[@id='input-password']")
		public WebElement textPassword;
		@FindBy(xpath="//input[@id='input-confirm']")
		public WebElement textConfirmPasword;
		@FindBy(xpath="//input[@name='agree']") 
		public WebElement checkdPolicy;
		@FindBy(xpath="//input[@value='Continue']")
		public WebElement  btnContinue;
		@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement confirmationMsg;
		
		//Notification displayed element and location
		@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]") WebElement notificationMsgFirstName;
		@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]") WebElement notificationMsgLastName;
		@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]") WebElement notificationMsgEmail;
		@FindBy(xpath="//div[contains(text(),'Telephone must be between 3 and 32 characters!')]") WebElement notificationMsgPhone;
		@FindBy(xpath="//div[contains(text(),'Password must be between 4 and 20 characters!')]") WebElement notificationMsgPassword;
		@FindBy(xpath="//div[@class='text-danger']") WebElement notificationMsgConfirmPasword;
		@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement notificationMsgprivacydPolicy;
		@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement notificationMsgEmailAlredyRegisterd;
		
		//Label Element location
		
		@FindBy(xpath="//label[normalize-space()='First Name']")WebElement labelFname;
		@FindBy(xpath="//label[normalize-space()='Last Name']") WebElement labelLname;
		@FindBy(xpath="//label[normalize-space()='E-Mail']")WebElement labelEmail;
		@FindBy(xpath="//label[normalize-space()='Telephone']")WebElement labelPhone;
		@FindBy(xpath="//label[normalize-space()='Password']")WebElement labelPassword;
		@FindBy(xpath="//label[normalize-space()='Password Confirm']")WebElement labelConfPass;
		
		@FindBy(xpath="//label[normalize-space()='Yes']")WebElement yesNewsletter;//newsletter Element for "yes"
		@FindBy(xpath="//input[@value='0']")WebElement noNewsletter;//newsletter Element for "no"
		
		// All Right Side Column Links
		@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Login']")WebElement linkLogin;
		@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Register']")WebElement linkRegister;
		@FindBy(xpath="//a[normalize-space()='Forgotten Password']")WebElement linkForgottenPswd;
		@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='My Account']")WebElement linkMyAccount;
		@FindBy(xpath="//a[normalize-space()='Address Book']")WebElement linkAddBook;
		@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Wish List']")WebElement linkWishList;
		@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Order History']")WebElement linkOrderHistory;
		@FindBy(xpath="//a[normalize-space()='Downloads']")WebElement linkDownload;
		@FindBy(xpath="//a[normalize-space()='Recurring payments']")WebElement linkRecurringPyment;
		@FindBy(xpath="//a[normalize-space()='Reward Points']")WebElement linkRewardPoints;
		@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Returns']")WebElement linkReturn;
		@FindBy(xpath="//a[normalize-space()='Transactions']")WebElement linkTransaction;
		@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Newsletter']")WebElement linkNewsLetter;
		
		// heading on registration page
		@FindBy(xpath="//h1[normalize-space()='Register Account']")WebElement msgDisplayedRegistration;
		
		//Footer options link element
		
		@FindBy(xpath="//a[normalize-space()='About Us']")WebElement footerAboutus;
		@FindBy(xpath="//a[normalize-space()='Delivery Information']") WebElement footerDeliveryInformation;
		@FindBy(xpath="//a[contains(text(),'Privacy Policy')]")WebElement footerPrivacyPolicy;
		@FindBy(xpath="//a[normalize-space()='Terms & Conditions']")WebElement footerTermCondition;
		@FindBy(xpath="//a[normalize-space()='Contact Us']")WebElement footerContactus;
		@FindBy(xpath="/html/body/footer/div/div/div[2]/ul/li[2]/a")WebElement footerReturn;
		@FindBy(xpath="//a[normalize-space()='Site Map']")WebElement footerSiteMap;
		@FindBy(xpath="//a[normalize-space()='Brands']")WebElement footerBrand;
		@FindBy(xpath="//a[normalize-space()='Gift Certificates']")WebElement footerGiftCertificate;
		@FindBy(xpath="//a[normalize-space()='Affiliate']")WebElement footerAffilate;
		@FindBy(xpath="//a[normalize-space()='Specials']")WebElement footerSpecial;
		@FindBy(xpath="//ul[@class='list-unstyled']//a[normalize-space()='My Account']")WebElement footerMyAccount;
		@FindBy(xpath="//ul[@class='list-unstyled']//a[normalize-space()='Order History']")WebElement footerOrderHistory;
		@FindBy(xpath="//ul[@class='list-unstyled']//a[normalize-space()='Wish List']")WebElement footerWishList;
		@FindBy(xpath="//ul[@class='list-unstyled']//a[normalize-space()='Newsletter']")WebElement footerNewsLetter;
		
		
		//Action
		
		public boolean isRegistraionAccPageDisplayed()
		{
			try
			{
			boolean status= msgHeading.isDisplayed();
			return(status);
			}
			catch (Exception e)
			{
				return(false);
			}
		}
		
		public String setFirstName(String fname)
		{
			textFirstName.clear();
			textFirstName.sendKeys(fname.trim());
			return fname;
		}
		
		public String setLastName(String lname)
		{
			textLastName.clear();
			textLastName.sendKeys(lname.trim());
			return lname;
			
			
		}
		public String setEmail(String email)
		{
			textEmail.clear();
			textEmail.sendKeys(email.trim());
			return (textEmail.getAttribute("validationMessage"));	
			
		}
		public String setPhoneNumber(String phone)
		{
			textPhone.clear();
			textPhone.sendKeys(phone.trim());
			return phone;
			
		}
		public String setPassword(String password)
		{
			textPassword.clear();
			textPassword.sendKeys(password.trim());
			return password;
			
		
		}
		public String setCnfmPassprd(String conpassword)
		{
			textConfirmPasword.click();
			textConfirmPasword.sendKeys(conpassword.trim());
			return conpassword;
			
		}
		public void setPrivacyPolicy()
		{
			checkdPolicy.click();	
		}
		public void clickContinue()
		{
			btnContinue.click();
		}
		
		//Notification  displayed Action 
		public boolean displayNotificationFirstName()
		{
			boolean status=notificationMsgFirstName.isDisplayed();
			return(status);
		}
		
		public boolean displayNotificationLastName()
		{
			boolean status=notificationMsgLastName.isDisplayed();
			return(status);
		}
		public boolean displayNotificationEmail()
		{
			boolean status=notificationMsgEmail.isDisplayed();
			return(status);
		}
		public boolean displayNotificationPhoneNumber()
		{
			boolean status=notificationMsgPhone.isDisplayed();
			return(status);
		}
		public boolean displayNotificationPassword()
		{
			boolean status=notificationMsgPassword.isDisplayed();
			return(status);
		}
		public boolean displayNotificationCnfmPassprd()
		{
			boolean status=notificationMsgConfirmPasword.isDisplayed();
			return(status);
		}
		public boolean displayNotificationPrivacyPolicy()
		{
			boolean status=notificationMsgprivacydPolicy.isDisplayed();
			return(status);
		}
		public boolean displayNotificationEmailAlreadyRegistred()
		{
			boolean status=notificationMsgEmailAlredyRegisterd.isDisplayed();
			return(status);
		}
		
		//NewsLetter subscription yes and no Action
		
		   public void clickYesNewsLetterSubscription()
		   {
			   yesNewsletter.click();
		   }
		   public void clickNoNewsLetterSubscription()
		   {
			   noNewsletter.click();
		   }
		public String getConfirmationMsg()
		{
			try
			{
				return(confirmationMsg.getText());
			}
		  catch (Exception e)
			{
			  	return( e.getMessage());
			}
		}
		
		//label Actions method
		public String labelFirstName()
		{
	     return labelFname.getCssValue("color");	
		}
		public String  labelLastName()
		{
			return labelLname.getCssValue("color");
		}
		public String labelEmail()
		{
			return labelEmail.getCssValue("color");
		}
		public String labelPhoneNumber()
		{
			return labelPhone.getCssValue("color");
		}
		public String labelPassword()
		{
			return labelPassword.getCssValue("color");
		}
		public String labelConfPassword()
		{
			return labelConfPass.getCssValue("color");
		}
		
		//Right Side  Column Link Action Methods
		
	  public void clickLoginLink()
	  {
		  linkLogin.click();
	  }
	  public void clickRegisterdLink()
	  {
		  linkRegister.click();
	  }
	  public void clickForGottenPswdLink()
	  {
		  linkForgottenPswd.click();
	  }
	  public void clickMyAccountLink()
	  {
		  linkMyAccount.click();
	  }
	  public void clickAdressBookLink()
	  {
		  linkAddBook.click();
	  }
	  public void clickWishListLink()
	  {
		  linkWishList.click();
	  }
	  public void clickOrderHistoryLink()
	  {
		  linkOrderHistory.click();
	  }
	  public void clickDownloadsLink()
	  {
		  linkDownload.click();
	  }
	  public void clickRecurringPymentLink()
	  {
		  linkRecurringPyment.click();
	  }
	  public void clickRewardPointsLink()
	  {
		  linkRewardPoints.click();
	  }
	  public void clickReturnLink()
	  {
		  linkReturn.click();
	  }
	  public void clickTransactionLink()
	  {
		  linkTransaction.click();
	  }
	  public void clickNewsLetterLink()
	  {
		  linkNewsLetter.click();
	  }
	  
	  public String msgDisplayed()
	  {
		 try
		 {
			return msgDisplayedRegistration.getText();
		 }
		 catch(Exception e)
		 {
			return e.getMessage();
		 }
	  }
	  
	  //Footer action link method
	  
	  public void clickFooterAboutus()
	  {
		  footerAboutus.click(); 
	  }
	  public void clickFooterDeliveryInformation()
	  {
		  footerDeliveryInformation.click(); 
	  }
	  public void clickFooterPrivacyPolicy()
	  {
		  footerPrivacyPolicy.click(); 
	  }
	  public void clickFooterTermCondition()
	  {
		  footerTermCondition.click(); 
	  }
	  public void clickFooterContactUs()
	  {
		  footerContactus.click(); 
	  }
	  public void clickFooterReturn()
	  {
		  footerReturn.click(); 
	  }
	  public void clickFooterSiteMap()
	  {
		  footerSiteMap.click(); 
	  }
	  public void clickFooterBrand()
	  {
		  footerBrand.click(); 
	  }
	  public void clickFooterGiftCertificate()
	  {
		  footerGiftCertificate.click(); 
	  }
	  public void clickFooterAffilate()
	  {
		  footerAffilate.click(); 
	  }
	  public void clickFooterSpecials()
	  {
		  footerSpecial.click(); 
	  }
	  public void clickFooterMyAccount()
	  {
		  footerMyAccount.click(); 
	  }
	  public void clickFooterOrderHistory()
	  {
		  footerOrderHistory.click(); 
	  }
	  public void clickFooterWishList()
	  {
		  footerWishList.click(); 
	  }
	  public void clickFooterNewsLetter()
	  {
		  footerNewsLetter.click(); 
	  }
		
	}
