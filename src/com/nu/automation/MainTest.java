package com.nu.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
	
	public static void main(String[] args) {
		String exePath = "/Users/Vidala/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new ChromeDriver();
		//  Wait For Page To Load
		// Put a Implicit wait, this means that any search for elements on the page
		// could take the time the implicit wait is set for before throwing exception 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Navigate to URL
		driver.get("http://www.ebay.com/");
		// Maximize the window.
		driver.manage().window().maximize();
		
		//Goto Login page
		driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).click();
		
		//Enter username
		//driver.findElement(By.className("fld")).sendKeys("pngtesters789@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Email or username']")).sendKeys(pngtesters789@gmail.com); 
		
		//Enter password
		//driver.findElement(By.className("fld")).sendKeys("National1!");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).getAttribute("placeholder"); 
		
		driver.findElement(By.id("sgnBt")).click();
		
		
		//Close the browser.
		driver.close();
		
	}
	
	
}
