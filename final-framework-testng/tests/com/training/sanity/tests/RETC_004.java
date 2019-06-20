package com.training.sanity.tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.Myprofile;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_004 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Myprofile myprofile;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		myprofile= new Myprofile(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("LAKSHMAN");
		loginPOM.sendPassword("lucky@123");
		loginPOM.clickLoginBtn();
		Thread.sleep(5000);
		myprofile.clickMyprofile();
		myprofile.sendAgenttitle("manzoor");
		myprofile.sendphone("9876543210");
		myprofile.clickSavechange();
		screenShot.captureScreenShot("First");
		
		
		
	}
}


