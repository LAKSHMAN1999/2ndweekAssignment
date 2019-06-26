package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.BLOG;
import com.training.pom.ENQUIRIESFORM;
import com.training.pom.RealEstatehome;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_038 {

	private WebDriver driver;
	private String baseUrl;
	private RealEstatehome Home;
	private ENQUIRIESFORM Enquiri;
	private BLOG Blog;
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
		Home = new RealEstatehome(driver); 
		Blog=new BLOG(driver);
		Enquiri=new ENQUIRIESFORM(driver);
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
	public void logintest() throws InterruptedException {
		
		Home.clickRealhome();
		Blog.clickBLOG();
		Blog.clickSearchproperties();
		Blog.sendSearchPropertie(properties.getProperty("Apartmentsearchbox"));
		Blog.clickSearchResult();
		
		String parentWindow = driver.getWindowHandle();
		List<String> windowHandles= new ArrayList(driver.getWindowHandles());
		System.out.println(windowHandles.size());
		String lastwindow=null;
		for(int i=0; i<windowHandles.size(); i++)
		{
			lastwindow=windowHandles.get(i).toString();
			
			System.out.println(lastwindow);
		}
		driver.switchTo().window(lastwindow);
		
		
		Enquiri.sendyourname("selenium");
		Enquiri.sendyouremail("selenium@gmail.com");
		Enquiri.sendyoursubject("apartment");
		Enquiri.sendyourmessage("looking for apartment");
		Enquiri.clickSendbutton();
		Thread.sleep(4000);
		screenShot.captureScreenShot("First");
	}
}
