package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

import com.util.BaseConfig;

public class DriverManager {

public   WebDriver getDriver(){//default
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(BaseConfig.getconfigfile("URL"));//****
		driver.manage().window().maximize();
		return driver;
}	
		public static void main(String[] args) {
			DriverManager obj=new DriverManager();
			obj.getDriver();
		}
}
