package itecy.Admin.StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import itecy.Admin.PageObjects.Browser;
import itecy.Admin.PageObjects.LoginPage;
import itecy.Admin.PageObjects.ManageCompanyPage;

public class ManageCompanyStepDef {
	WebDriver driver = Browser.driver;
	ManageCompanyPage company;
	LoginPage lPage;

//	@Given("user launches the url and login as admin with {string} and {string}")
//	public void user_launches_the_url_and_login_as_admin_with_and(String string, String string2) {
//		//company= new ManageCompanyPage(driver);
//		company.userName(string);
//		company.userPassword(string2);
//		company.loginBtn();
//	    
//	}
	@Given("user launches the url and validates the application")
	public void user_launches_the_url_and_validates_the_application() {
		lPage = new LoginPage(driver);
		lPage.validateurl();
	}

	

	@Then("login as admin with {string} and {string}")
	public void login_as_admin_with_and(String string, String string2) {
		//lPage=new LoginPage(driver);
		lPage.userName(string);
		lPage.userPassword(string2);
		System.out.println(string);
		System.out.println(string2);
		 
	}

	@When("user click on the Login button")
	public void user_click_on_the_login_button() {
	   lPage.Loginbtn();
	}

	@Then("user will Navigate to the Admin Dashbaord Page")
	public void user_will_navigate_to_the_admin_dashbaord_page() {
	    lPage.Dashboard();
	}

	@Given("user is on Admin Dashboard page")
	public void user_is_on_admin_dashboard_page() {
		company= new ManageCompanyPage(driver);
	   
	}
	
	@When("user click on Manage Company")
	public void user_click_on_manage_company() {
	   company.manageCompany();
	}

	@Then("user should access View Companies page")
	public void user_should_access_view_companies_page() {
	   company.viewCompany();
	}

	@Then("user click on Add Company and validate Add Company page is displayed")
	public void user_click_on_add_company_and_validate_add_company_page_is_displayed() {
	    company.addCompany();
	}



//	@Then("user enters {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
//	public void user_enters(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
//	  company.addCompanyDetails(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11); 
//	}


	@Then("user enters {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
	public void user_enters(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12,String string13) {
		company.addCompanyDetails(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13);
	}
	
	

	}
