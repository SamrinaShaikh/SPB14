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
import com.training.pom.AddNewProjectPOM;
import com.training.pom.AddNewRolePOM;
import com.training.pom.AddNewTaskPOM;
import com.training.pom.AddUserPOM;
import com.training.pom.AdminPOM;
import com.training.pom.AnswersPOM;
import com.training.pom.CourseCatalogPOM;
import com.training.pom.CourseHomePOM;
import com.training.pom.CreateNewTestPOM;
import com.training.pom.ElearningLoginPOM;
import com.training.pom.LogoutPOM;
import com.training.pom.MyCoursePOM;
import com.training.pom.OnlineQuizPOM;
import com.training.pom.PreviewPOM;
import com.training.pom.ProjectPOM;
import com.training.pom.RoleManagementPOM;
import com.training.pom.StudentPOM;
import com.training.pom.SubscribePOM;
import com.training.pom.TakeTestPOM;
import com.training.pom.TestNewPOM;
import com.training.pom.TestPOM;
import com.training.pom.UserManagementPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
public class ELTC072 {

	private WebDriver driver;
	private String baseUrl;
	
	private ElearningLoginPOM elearningloginPOM;
	private AddUserPOM adduserPOM;
	
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
		adduserPOM = new AddUserPOM(driver); 
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test
	public void validAddNewProject() throws InterruptedException {
		elearningloginPOM.sendUserName("admin");
		elearningloginPOM.sendPassword("admin@123");
		elearningloginPOM.clickLoginBtn(); 
		Thread.sleep(3000);
		adduserPOM.clickAddUser();
		//adduserPOM.sendfirstname("manzoor");
		//adduserPOM.sendlastname("mehadi");
		
		
		
		
}
		
		
		
	
}
