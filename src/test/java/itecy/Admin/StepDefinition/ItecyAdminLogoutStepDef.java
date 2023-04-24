package itecy.Admin.StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import itecy.Admin.PageObjects.Browser;
import itecy.Admin.PageObjects.LoginPage;



public class ItecyAdminLogoutStepDef {
	WebDriver driver = Browser.driver;

	LoginPage lPage;

	@When("user click on {string} drop down and Click on Log out")
	public void user_click_on_drop_down_and_click_on_log_out(String string) {
		lPage = new LoginPage(driver);
	   lPage.logOut();
	  
	}

	@Then("user should be able to view login page for admin panel")
	public void user_should_be_able_to_view_login_page_for_admin_panel() {
		 lPage.validateLoginPage(); 
	}


}
