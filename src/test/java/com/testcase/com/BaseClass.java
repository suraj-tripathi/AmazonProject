package com.testcase.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.utilities.com.ReadConfiguration;

public class BaseClass {
	
	public static WebDriver driver;
	ReadConfiguration rc=new ReadConfiguration();
	String Browser=rc.getBrowser();
	String url=rc.getUrl();
	
	@BeforeTest
	void browserLaunch()
	{
		switch(Browser.toLowerCase())
		{
		
		case "chrome":
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		break;
		
		case "msedge":
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		break;
		
		case "firefox":
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		break;
		
		default:
			driver=null;
			break;
		
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
