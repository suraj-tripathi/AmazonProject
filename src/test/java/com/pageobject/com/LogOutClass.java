package com.pageobject.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutClass {
	
	public static WebDriver ldriver;
	
	public LogOutClass(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//div/div/div/a[text()='Log out']") WebElement Logout;
	
	 public void user_Logout()
	 {
		 Logout.click();
	 }

}
