package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CourseCatalogPOM;
import com.training.pom.ElearningLoginPOM;
import com.training.pom.LostPswdPOM;
import com.training.pom.PasswordPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC012 {

	private WebDriver driver;
	private String baseUrl;
	private PasswordPOM passwordPOM;
	private LostPswdPOM lostpswdPOM;
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
		passwordPOM= new PasswordPOM(driver); 
		lostpswdPOM= new LostPswdPOM(driver); 
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
		passwordPOM.clicklostpswd();
		screenShot.captureScreenShot("LostPassword");
		lostpswdPOM.sendlostuserName("SamrinaS");
		screenShot.captureScreenShot("Credentials");
		lostpswdPOM.clicklostpswd();
		screenShot.captureScreenShot("Message");
		Reporter.log("Sending email is not configured");
}
		
		
		
	
}
