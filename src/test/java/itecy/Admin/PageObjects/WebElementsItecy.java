package itecy.Admin.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsItecy {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	co.addArguments("start-maximized");
		co.addArguments("incognito");
//		oc.addArguments("--no-sandbox");
//	      oc.addArguments("--disable-dev-shm-usage");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testitecy.azurewebsites.net/admin");

System.out.println(driver.getTitle());
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hr@clientservertech.com");
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Pass@123");
driver.findElement(By.xpath("//body/div[1]/form[1]/div[5]/button[1]")).click();
System.out.println(driver.getCurrentUrl());
driver.quit();
driver = new ChromeDriver(co);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://testitecy.azurewebsites.net/admin");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hr@clientservertech.co");
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Pass@123");
driver.findElement(By.xpath("//body/div[1]/form[1]/div[5]/button[1]")).click();
System.out.println(driver.getCurrentUrl());
driver.quit();

	}

}
