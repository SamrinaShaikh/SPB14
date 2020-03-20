package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.AddUserPOM;
import com.training.pom.ElearningLoginPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginExcelTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AddUserPOM adduserPOM;
	private ElearningLoginPOM elearningloginPOM;
	
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
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
		
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.id("form-login_submitAuth")).click();
		adduserPOM = new AddUserPOM(driver);
				
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	//@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	@Test(dataProvider = "userData", dataProviderClass = LoginDataProviders.class)
	//public void loginDBTest(String userName, String password) {
	public void loginDBTest(String firstname, String lastname, String email, String phone, String login, String password, String profile) {
		adduserPOM.clickAddUser();
		adduserPOM.sendfirstname(firstname);
		adduserPOM.sendlastname(lastname);
		adduserPOM.sendEmail(email);
		adduserPOM.sendPhone(phone);
		adduserPOM.sendUsername(login);
		adduserPOM.sendPassword(password);
		adduserPOM.clickEnterPassword();
		adduserPOM.clickProfile();
		adduserPOM.sendText(profile);
		adduserPOM.clickTextSelect();
		adduserPOM.clickSubmit();
		screenShot.captureScreenShot("userAdded");
		
		
		
		

	}

}