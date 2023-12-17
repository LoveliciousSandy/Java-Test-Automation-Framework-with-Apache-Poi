package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadExcelData;

@Test(dataProviderClass = ReadExcelData.class,dataProvider = "testData")
public class TC_001 extends BaseTest {
	
	public static void Login(String username, String password) {
		
		driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys(username);
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("login"))).click();
	}

}