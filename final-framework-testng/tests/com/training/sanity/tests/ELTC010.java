package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CourseCatalogPOM;
import com.training.pom.ElearningLoginPOM;
import com.training.pom.HomePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC010 {

	private WebDriver driver;
	private String baseUrl;
	private ElearningLoginPOM elearningloginPOM;
	private CourseCatalogPOM coursecatalogPOM;
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
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		elearningloginPOM = new ElearningLoginPOM(driver); 
		coursecatalogPOM= new CourseCatalogPOM(driver); 
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
	public void validCourseCatalog() throws InterruptedException {
		elearningloginPOM.sendUserName("SamrinaS");
		elearningloginPOM.sendPassword("Toffee@2018");
		elearningloginPOM.clickLoginBtn(); 
		//Thread.sleep(3000);
		coursecatalogPOM.clickCourseCatalog();
		screenShot.captureScreenShot("Course Catalog");
		coursecatalogPOM.sendSearchtxt("selenium");
		screenShot.captureScreenShot("Search");
		coursecatalogPOM.clickSearchbtn();
		screenShot.captureScreenShot("Course");
}
		
		
		
	
}
