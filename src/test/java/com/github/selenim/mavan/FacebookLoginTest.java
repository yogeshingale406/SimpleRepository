package com.github.selenim.mavan;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class FacebookLoginTest {
	public WebDriver driver;
	
	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver",
		    	"H:/New folder/ccleaner_4.4.0.exe/Selenium/workspaceWebdriver/BrowserDrivers/chromedriver.exe");
		    	driver= new ChromeDriver();
		    	driver.manage().window().maximize();
		    	driver.get("https://www.fb.com");
		    	System.out.println(driver.getTitle());

	}
	
	@Test
	public void dologin() {
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("yogesh");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("yogesh");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
	}
	@AfterTest
	public void trarDown() {
		driver.quit();

	}
}
