package com.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.DriverManager;

import com.generic.MasterPagefactory;
import com.generic.ZooplaLogin;

public class ZooplaTest {
	WebDriver driver;
@BeforeTest
	public void setup() {
	 driver=new DriverManager().getDriver();
}
@Test 
public void loginTest() {
	MasterPagefactory obj=new ZooplaLogin().getlogin(driver);
Assert.assertTrue(obj.getFinalsinginbtn().isDisplayed(),"Login Test Passed");
}



@AfterTest
public void teardown() {
	//driver.quit();
}
}
