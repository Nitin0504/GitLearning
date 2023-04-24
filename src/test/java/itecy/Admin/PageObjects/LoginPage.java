package itecy.Admin.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//input[@id='email']")
	WebElement userName;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement userPassword;

	@FindBy(xpath = "//body/div[1]/form[1]/div[5]/button[1]")
	WebElement loginbtn;

	@FindBy(xpath = "//h1[contains(text(),'Welcome Admin')]")
	WebElement homepage;

	@FindBy(xpath = "//h3[contains(text(),'Login to your account')]")
	WebElement loginScreen;
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement alert;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")
	WebElement welcomeDropDown;
	
	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	WebElement logOut;
	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void validateurl() {

		if (loginScreen.getText().equals("Login to your account")) 
			System.out.println("Itecy login screen "+driver.getTitle());
	

	}

	public void userName(String username) {

		userName.sendKeys(username);
	}

	public void userPassword(String password) {
		userPassword.sendKeys(password);
	}

	public void Loginbtn() {
		loginbtn.click() ;
		driver.manage().window().maximize();
	}

	public void Dashboard() {
		if(homepage.isDisplayed())
			System.out.println(" Admin Dashboard ");
	}
	public void validateAlerts(String string) {

		if (driver.getCurrentUrl().equals("https://testitecy.azurewebsites.net/admin/admin/Index") ) {
			System.out.println("Login successfull : "+ string);
		} else { 
			
			System.out.println("Invalid username or password : " + alert.getText());
		}
		// } catch (Exception e) {
//			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='fxt-form']/div[1]")));
//			SoftAssert soft = new SoftAssert();
//			String text = driver.findElement(By.xpath("//div[@class='fxt-form']/div[1]")).getText();
//			soft.assertEquals("Invalid Username or Password", text);
//			if(text.equals("Invalid Username or Password")){
//				System.out.println(text);

	}
	
	public void logOut() {
		welcomeDropDown.click() ;
		logOut.click();
		
	}
	
	public void validateLoginPage() {

		if (loginScreen.getText().equals("Login to your account")) 
			System.out.println("Itecy Admin login screen "+driver.getTitle());
	

	}


//	public void validateAlerts(String string) {
//		if(alert.getText().equals(string))
//		System.out.println("Validating alert message"+alert.getText());
//		else
//			validatehomepage(string);
//	}

	}


