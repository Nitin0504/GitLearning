package itecy.Admin.StepDefinition;

import org.openqa.selenium.WebDriver;

import itecy.Admin.PageObjects.Browser;
import itecy.Admin.PageObjects.LoginPage;
import io.cucumber.java.en.*;


public class LoginSteps {
	WebDriver driver = Browser.driver;
	LoginPage lPage;

	@Given("user launches the url and validate the application")
	public void user_launches_the_url_and_validate_the_application() {
		lPage = new LoginPage(driver);
		lPage.validateurl();
	}


@When("user enters {string} and {string}")
public void user_enters_and(String username, String password) {
	
	lPage.userName(username);
	lPage.userPassword(password);
	
   
}

@When("user tries to logged into the application")
public void user_tries_to_logged_into_the_application() {
	lPage.Loginbtn();
}

@Then("validate the Alerts {string}")
public void validate_the_alerts(String string) {
	lPage.validateAlerts(string);
	
}


}




