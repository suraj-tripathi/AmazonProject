 package com.testcase.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobject.com.LogOutClass;
import com.pageobject.com.LoginClass;
import com.utilities.com.DataDrivenTesting1;

public class TestCase extends BaseClass
{

@Test(priority = 0, dataProvider = "Datapro")
	void login(String user, String pass)
	{
		driver.get(url);
		LoginClass lc=new LoginClass(driver);
		lc.getUsername(user);
		lc.getPassword(pass);
		lc.Submit();
	}
@Test(priority = 1)
	void logout()
	{
	LogOutClass lc=new LogOutClass(driver);
	lc.user_Logout();
	}
@DataProvider(name="Datapro")
public String [][] getData() throws Exception
{
	String filename="C:\\Users\\19530\\Desktop\\t3.xlsx";
	int row=DataDrivenTesting1.getRow(filename, "Sheet1");
	int col=DataDrivenTesting1.getCol(filename, "Sheet1");
	String s1[][]=new String[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					s1[i][j]=DataDrivenTesting1.getcellData(filename, "Sheet1", i, j);
					
				}
			}
			return s1;
}
	
}
