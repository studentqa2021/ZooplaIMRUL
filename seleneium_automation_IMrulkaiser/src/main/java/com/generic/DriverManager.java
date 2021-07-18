package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.ConfigProperty;

public class DriverManager {
 public  WebDriver getdriver() {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(ConfigProperty.getconfigfile("URL"));
	driver.manage().window();	
	return driver;
}
}
