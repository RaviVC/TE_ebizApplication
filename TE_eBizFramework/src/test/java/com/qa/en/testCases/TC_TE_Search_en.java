package com.qa.en.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_TE_Search_en {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void Search_2mm()
	{	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www-stage.te.com/usa-en/home.html");
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
}
