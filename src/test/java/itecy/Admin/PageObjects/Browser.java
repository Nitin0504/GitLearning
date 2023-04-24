package itecy.Admin.PageObjects;

import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.OutputType;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.*;

public class Browser {
	public static WebDriver driver;

	@Before
	public void browser() {
		ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	co.addArguments("start-maximized");
		co.addArguments("incognito");
//		oc.addArguments("--no-sandbox");
//	      oc.addArguments("--disable-dev-shm-usage");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testitecy.azurewebsites.net/admin");

	}

	@After
	public void teardown(Scenario sc) {
//		if (sc.isFailed()) {

//			TakesScreenshot ts = (TakesScreenshot) driver;
//
//			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//			sc.attach(src, "image/png", "screenshot");
			
			TakesScreenshot tc= (TakesScreenshot) driver;
			byte[] src=tc.getScreenshotAs(OutputType.BYTES);
			sc.attach(src, "image/png", "screenshot");
			
			
			
//		}
		
		// driver.quit();
	}

}

