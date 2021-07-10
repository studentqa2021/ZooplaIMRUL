package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page_factory.MasterPF;
import com.util.ConfigProperty;
import com.util.Highlighter;
import com.util.ScreenShot;

public class BaseLogin{
	public static void getLogin() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(ConfigProperty.getconfigfile("URL"));
		driver.manage().window();
	MasterPF obj=new MasterPF(driver);
	ScreenShot.getpic(driver, "before signin");
	 Highlighter.addcolor(driver,obj.getSigninbtn());
	obj.getSigninbtn().click();
	
	 Highlighter.addcolor(driver,obj.getEmail());
	obj.getEmail().sendKeys(ConfigProperty.getconfigfile("username"));
	
	 Highlighter.addcolor(driver,obj.getPassword());
	obj.getPassword().sendKeys(ConfigProperty.getconfigfile("password"));
	 Highlighter.addcolor(driver,obj.getSubmit());
	 
	 obj.getSubmit().click();
	 ScreenShot.getpic(driver, "before signout");
	 Highlighter.addcolor(driver,obj.getSignout());
	obj.getSignout().click();
	}
}
