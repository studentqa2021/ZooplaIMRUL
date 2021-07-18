package com.generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

public class ZooplaLogin {


public MasterPagefactory getlogin(WebDriver driver) {
	

	


MasterPagefactory obj=new MasterPagefactory(driver);

Highlighter.addColor(driver, obj.getCookiesbtn());
Screenshot.getpic(driver, "Home Page");
obj.getCookiesbtn().click();
Highlighter.addColor(driver, obj.getfirstSinginbtn());
obj.getfirstSinginbtn().click();
Highlighter.addColor(driver, obj.getUsername());
obj.getUsername().sendKeys(BaseConfig.getconfigfile("user"));
Highlighter.addColor(driver, obj.getPassword());
obj.getPassword().sendKeys(BaseConfig.getconfigfile("pass"));
Highlighter.addColor(driver, obj.getFinalsinginbtn());
 Screenshot.getpic(driver,"login page");
obj.getFinalsinginbtn().click();
//Highlighter.addColor(driver,obj.getMyZooplabtn());
//Screenshot.getpic(driver,"signout page");
obj.getMyZooplabtn();

Actions ac=new Actions(driver);
Screenshot.getpic(driver,"signout page");
Highlighter.addColor(driver,obj.getMyZooplabtn());
ac.moveToElement(obj.getMyZooplabtn()).perform();

if(obj.getSignoutbtn().isDisplayed()) {
System.out.println("Test is passed");
Assert.assertTrue(obj.getSignoutbtn().isDisplayed());

}else{

	System.out.println("Test is failed");
	
	Assert.assertTrue(obj.getSignoutbtn().isDisplayed());
}

	return obj;

}

}




