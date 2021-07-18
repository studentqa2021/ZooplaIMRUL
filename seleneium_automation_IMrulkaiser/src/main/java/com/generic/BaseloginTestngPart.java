package com.generic;

import org.openqa.selenium.WebDriver;

import com.page_factory.MasterPF;
import com.util.ConfigProperty;
import com.util.Highlighter;
import com.util.ScreenShot;

public class BaseloginTestngPart {
	public MasterPF BaseLogintestng( WebDriver driver) {
		
	MasterPF obj =new MasterPF( driver);	
	
	ScreenShot.getpic(driver,"before signin");

	Highlighter.addcolor(driver,obj.getSigninbtn());
	obj.getSigninbtn().click();

	Highlighter.addcolor(driver,obj.getEmail());
	obj.getEmail().sendKeys(ConfigProperty.getconfigfile("username"));

	Highlighter.addcolor(driver,obj.getPassword());
	obj.getPassword().sendKeys(ConfigProperty.getconfigfile("password"));
	Highlighter.addcolor(driver,obj.getSubmit());

	obj.getSubmit().click();
	ScreenShot.getpic(driver,"before signout");
	Highlighter.addcolor(driver,obj.getSignout());
	obj.getSignout().click();
	obj.getSignout().isDisplayed();
	//boolean loginStatus=false;
	//try {
		//loginStatus=obj.getSignout().isDisplayed();
		
	//}catch(Exception e) {
		//e.printStackTrace();
	//}
	//if(loginStatus) {
		System.out.println("Login Passed");
	//}else {
		System.out.println("Login failed");
	//}
	return obj;
}
}
