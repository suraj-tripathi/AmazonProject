package com.pageobject.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass
{
	
	public static WebDriver ldriver;
	
	public LoginClass(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "username") WebElement username;
	@FindBy(id = "password") WebElement password;
	@FindBy(id = "submit") WebElement submit;
	
	public void getUsername(String u)
	{
		username.sendKeys(u);
	}
	public void getPassword(String p)
	{
		password.sendKeys(p);
	}
	public void Submit()
	{
		submit.click();
	}

}
