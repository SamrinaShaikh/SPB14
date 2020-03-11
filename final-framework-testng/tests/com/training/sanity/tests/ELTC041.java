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
import com.training.pom.AnswersPOM;
import com.training.pom.CourseCatalogPOM;
import com.training.pom.CourseHomePOM;
import com.training.pom.ElearningLoginPOM;
import com.training.pom.MyCoursePOM;
import com.training.pom.ProjectPOM;
import com.training.pom.RoleManagementPOM;
import com.training.pom.SubscribePOM;
import com.training.pom.TakeTestPOM;
import com.training.pom.TestPOM;
import com.training.pom.UserManagementPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
public class ELTC041 {

	private WebDriver driver;
	private String baseUrl;
	
	private ElearningLoginPOM elearningloginPOM;
	private CourseCatalogPOM coursecatalogPOM;
	//private MyCoursePOM mycoursePOM;
	private SubscribePOM subscribePOM;
	private CourseHomePOM coursehomePOM;
	private TestPOM testPOM;
	private TakeTestPOM taketestPOM;
	private AnswersPOM answersPOM;
	
	private AddNewProjectPOM addnewprojectPOM;
	private AddNewTaskPOM addnewtaskPOM;
	private AddNewRolePOM addnewrolePOM;
	private RoleManagementPOM rolemanagementPOM;
	private UserManagementPOM usermanagementPOM;
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
		//mycoursePOM = new MyCoursePOM(driver); 
		subscribePOM = new SubscribePOM(driver);
		coursehomePOM = new CourseHomePOM(driver);
		testPOM = new TestPOM(driver);
		taketestPOM = new TakeTestPOM(driver);
		answersPOM = new AnswersPOM(driver); 
		
		addnewprojectPOM = new AddNewProjectPOM(driver);
		addnewtaskPOM = new AddNewTaskPOM(driver);
		addnewrolePOM = new AddNewRolePOM(driver);
		rolemanagementPOM = new RoleManagementPOM(driver);
		usermanagementPOM = new UserManagementPOM(driver);
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
	public void validAddNewProject() throws InterruptedException {
		elearningloginPOM.sendUserName("manzoor_123");
		elearningloginPOM.sendPassword("mehadi");
		//elearningloginPOM.sendUserName("admin");
		//elearningloginPOM.sendPassword("admin@123");
		elearningloginPOM.clickLoginBtn(); 
		Thread.sleep(3000);
		coursecatalogPOM.clickCourseCatalog();
		coursecatalogPOM.sendSearchtxt("AWS");
		coursecatalogPOM.clickSearchbtn();
		subscribePOM.clickSubscribe();
		//subscribePOM.sendSearchtxt("AWS");
		screenShot.captureScreenShot("Subscribed");
		
		coursecatalogPOM.sendSearchtxt("AWS");
		coursecatalogPOM.clickSearchbtn();
		subscribePOM.clickTitle();
		coursehomePOM.clickCourse();
		testPOM.clickTests();
		testPOM.clickTests_clk();
		taketestPOM.clickStartTest();
		screenShot.captureScreenShot("Questions");
		answersPOM.clickAnswer1();
		answersPOM.clickNextQues();
		
		answersPOM.clickAnswer2();
		answersPOM.clickEndTest();
		screenShot.captureScreenShot("Result");
		//mycoursePOM.clickMycourse();
		//projectPOM.clickProjectsimg();
		
		//screenShot.captureScreenShot("Registered");
}
		
		
		
	
}
