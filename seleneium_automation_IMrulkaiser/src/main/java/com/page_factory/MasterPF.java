package com.page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPF {
public MasterPF(WebDriver driver){
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//*[contains(text(),'Sign in')]")
private WebElement signinbtn;

@FindBy(xpath="(//*[contains(@id,'email')])[2]")
private WebElement email;

@FindBy(xpath="//*[@name='passwd']")
private WebElement password;

@FindBy(xpath="//*[@name='SubmitLogin']")
private WebElement submit;

@FindBy(xpath="//*[@class='logout']")
private WebElement signout;

public WebElement getSigninbtn() {
	return signinbtn;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSubmit() {
	return submit;
}
public WebElement getSignout() {
	return signout;
}

}
