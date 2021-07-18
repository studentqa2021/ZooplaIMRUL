package com.smoke;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.BaseloginTestngPart;
import com.generic.DriverManager;
import com.page_factory.MasterPF;

public class BaseLoginTestrunPart extends BaseloginTestngPart {
 
	WebDriver driver;
	@BeforeTest
	public void setup() {
	driver=new DriverManager().getdriver();
	}
	@Test
	public void logintest() {
		MasterPF obj=new BaseloginTestngPart().BaseLogintestng(driver);
		Assert.assertTrue(obj.getSignout().isDisplayed(),"login Passed");
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	// public static void main(String[] args) {
	//DriverManager dm =new DriverManager();
	
	//WebDriver driver=new DriverManager().getdriver();//setup
	
	//BaseloginTestngPart obj=new BaseloginTestngPart();
	//new BaseloginTestngPart().BaseLogintestng(driver);//login
	//driver.quit();
}
//}
