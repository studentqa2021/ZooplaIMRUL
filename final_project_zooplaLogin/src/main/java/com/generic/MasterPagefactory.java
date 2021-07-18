package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPagefactory {
	
	public MasterPagefactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(xpath = "(//*[contains(text(),'Accept all cookies')])[2]")	
private WebElement cookiesbtn;
@FindBy(xpath = "(//*[contains(@class,'css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0')])[4]")
private WebElement firstsinginbtn;
@FindBy(xpath = "//*[contains(@name,'email')]")
private WebElement username;
@FindBy(xpath = "//*[contains(@id,'input-password')]")
private WebElement password;
@FindBy(xpath = "(//*[contains(text(),'Sign in')])[10]")
private WebElement finalsinginbtn;
@FindBy(xpath="(//*[contains(text(),'My Zoopla')])[1]")
private WebElement MyZooplabtn;
@FindBy(xpath="//*[contains@class,'esdwd6d0 css-wxwl91-StyledLink-Link e33dvwd0')])[5]")
private WebElement signoutbtn;

public WebElement getCookiesbtn() {
	return cookiesbtn;
}
public WebElement getfirstSinginbtn() {
	return firstsinginbtn;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getFinalsinginbtn() {
	return finalsinginbtn;

}
public WebElement getMyZooplabtn() {
	return MyZooplabtn;
}


public WebElement getSignoutbtn() {
	return signoutbtn;

}

}

