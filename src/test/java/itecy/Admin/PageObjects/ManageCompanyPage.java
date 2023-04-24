package itecy.Admin.PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class ManageCompanyPage {
	WebDriver driver;
	WebDriverWait wait;
	LoginPage lPage;
	@FindBy(xpath = "//input[@id='email']")
	WebElement userName;
    @FindBy(xpath = "//input[@id='Password']")
	WebElement userPassword;
    @FindBy(xpath = "//body/div[1]/form[1]/div[5]/button[1]")
	WebElement loginbtn;
    @FindBy(xpath = "//h1[contains(text(),'Welcome Admin')]")
	WebElement homepage;
	
	
	@FindBy(xpath = "//span[contains(text(),'Manage Company')]")
	WebElement manageCompanyButton;
	@FindBy(xpath = "//h4[contains(text(),'View Companies')]")
	WebElement companyPage;
	@FindBy(xpath = "//a[contains(text(),'Add Company')]")
	WebElement addCompany;
	@FindBy(xpath = "//h2[contains(text(),'Add Company')]")
	WebElement addCompanyPage;
	
	@FindBy(id = "CompanyName")
	WebElement companyName;
	@FindBy(id = "TagLine")
	WebElement tagLine;
	@FindBy(xpath = "//select[@id='IndustryId']")
	WebElement industry;
	@FindBy(xpath = "//input[@id='CompanyCeo']")
	WebElement CEO;
	@FindBy(xpath = "//input[@id='EmailId']")
	WebElement eMail;
	@FindBy(xpath = "//input[@id='PhoneNo']")
	WebElement contactNumber;
	@FindBy(xpath = "//input[@id='Url']")
	WebElement cURL;
	@FindBy(xpath = "//input[@id='FoundDate']")
	WebElement foundationDate;
	@FindBy(xpath = "//input[@id='Strength']")
	WebElement cStrength;
	@FindBy(xpath = "//input[@id='Address']")
	WebElement cAddress;
	
	
	@FindBy(xpath = "//select[@id='LocationId']")
	WebElement cLocation;
	@FindBy(xpath = "//input[@id='ZipCode']")
	WebElement zipCode;
	@FindBy(xpath = "//input[@id='Summary']")
	WebElement cSummary;
	@FindBy(xpath = "//input[@id='btnSubmit']")
	WebElement addButton;
	public ManageCompanyPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	public void userName(String username) {
//
//		userName.sendKeys(username);
//	}
//
//	public void userPassword(String password) {
//		userPassword.sendKeys(password);
//	}
//
//	public void loginBtn() {
//		loginbtn.click() ;
//		driver.manage().window().maximize();
//	}
//	public void dashboard() {
//		if(homepage.isDisplayed())
//			System.out.println(" Admin Dashboard ");
//	}

	public void manageCompany() {
		manageCompanyButton.click();
		
			}
	public void viewCompany()
	{
		Assert.assertEquals("View Companies",companyPage.getText());
		System.out.println("List of Companies");
	

}
	
	public void addCompany()
	{

		addCompany.click();
		
		if(addCompanyPage.isDisplayed());
		System.out.println("Enter Company Details : ");

}

	public void addCompanyDetails(String name, String tag, String indus, String ceo, String email, String phone, String url, String date, String strength,  String loc, String address, String zip, String summary) 
		{
			companyName.sendKeys(name);
			tagLine.sendKeys(tag);
		industry.sendKeys(indus);
		CEO.sendKeys(ceo);
		eMail.sendKeys(email);
		contactNumber.sendKeys(phone);
		cURL.sendKeys(url);
		foundationDate.sendKeys(date);
		cStrength.sendKeys(strength);
		cAddress.sendKeys(address);
		cLocation.sendKeys(loc);
		zipCode.sendKeys(zip);
		cSummary.sendKeys(summary);
		addButton.click();
		}
		
	}
