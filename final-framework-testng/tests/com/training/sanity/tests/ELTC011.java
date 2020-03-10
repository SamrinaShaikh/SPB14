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
import com.training.pom.HomepagePOM;
import com.training.pom.LoginPOM;
import com.training.pom.ProfilePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
public class ELTC011 {

	private WebDriver driver;
	private String baseUrl;
	private ElearningLoginPOM elearningloginPOM;
	private HomepagePOM homepagePOM;
	private ProfilePOM profilePOM;
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
		homepagePOM= new HomepagePOM(driver); 
		profilePOM= new ProfilePOM(driver); 
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
	public void validChangePassword() throws InterruptedException {
		elearningloginPOM.sendUserName("manzoor_123");
		elearningloginPOM.sendPassword("manzoor");
		elearningloginPOM.clickLoginBtn(); 
		
		Thread.sleep(3000);
		homepagePOM.clickhomepage();
		screenShot.captureScreenShot("Profile");
		homepagePOM.clickeditprofile();
		profilePOM.sendcurrpswd("manzoor");
		//screenShot.captureScreenShot("Password");
		profilePOM.sendnewpwd("mehadi");
		//screenShot.captureScreenShot("NewPassword");
		profilePOM.sendconfpswd("mehadi");
		screenShot.captureScreenShot("ConfPassword");
		profilePOM.clickSavebtn();
		screenShot.captureScreenShot("NewProfile");
}
		
		
		
	
}
