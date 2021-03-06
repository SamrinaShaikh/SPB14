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
import com.training.pom.AdminPOM;
import com.training.pom.AnswersPOM;
import com.training.pom.CourseCatalogPOM;
import com.training.pom.CourseHomePOM;
import com.training.pom.CreateNewTestPOM;
import com.training.pom.ElearningLoginPOM;
import com.training.pom.MyCoursePOM;
import com.training.pom.OnlineQuizPOM;
import com.training.pom.PreviewPOM;
import com.training.pom.ProjectPOM;
import com.training.pom.RoleManagementPOM;
import com.training.pom.SubscribePOM;
import com.training.pom.TakeTestPOM;
import com.training.pom.TestNewPOM;
import com.training.pom.TestPOM;
import com.training.pom.UserManagementPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
public class ELTC070 {

	private WebDriver driver;
	private String baseUrl;
	
	private ElearningLoginPOM elearningloginPOM;
	private CourseCatalogPOM coursecatalogPOM;
	//private MyCoursePOM mycoursePOM;
	private SubscribePOM subscribePOM;
	private CourseHomePOM coursehomePOM;
	private TestNewPOM testnewPOM;
	private CreateNewTestPOM createnewtestPOM;
	private OnlineQuizPOM onlinequizPOM;
	private PreviewPOM previewPOM;
	private AdminPOM adminPOM;
	
	
	
	
	
	
	
	
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
		testnewPOM = new TestNewPOM(driver);
		createnewtestPOM = new CreateNewTestPOM(driver);
		onlinequizPOM = new OnlineQuizPOM(driver);
		previewPOM = new PreviewPOM(driver);
		adminPOM = new AdminPOM(driver);
		
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
		elearningloginPOM.sendUserName("SamrinaS");
		elearningloginPOM.sendPassword("Toffee@2018");
		elearningloginPOM.clickLoginBtn(); 
		Thread.sleep(3000);
		coursecatalogPOM.clickCourseCatalog();
		coursecatalogPOM.sendSearchtxt("AWS");
		coursecatalogPOM.clickSearchbtn();

		
		coursecatalogPOM.sendSearchtxt("AWS");
		coursecatalogPOM.clickSearchbtn();
		subscribePOM.clickTitle();
		coursehomePOM.clickCourse();
		testnewPOM.clickTests();
		testnewPOM.clickNewTest();
		createnewtestPOM.sendTitle("online quiz");
		createnewtestPOM.clickAdvancedSettings();
		createnewtestPOM.clickContext();
		createnewtestPOM.sendBody("quiz");
		createnewtestPOM.clickFeedback();
		createnewtestPOM.clickStartTime();
		createnewtestPOM.clickDatePicker();
		createnewtestPOM.clickDate();
		createnewtestPOM.clickDone();
		createnewtestPOM.clickPassPercent("50");
		createnewtestPOM.clickProceed();
		screenShot.captureScreenShot("Exercise added");
		onlinequizPOM.clickChoice();
		onlinequizPOM.sendQues("which course you're learning?");
		onlinequizPOM.clickContext1();
		onlinequizPOM.sendBody1("python");
		onlinequizPOM.clickContext2();
		onlinequizPOM.sendBody2("java");
		onlinequizPOM.clickAnswer();
		//onlinequizPOM.sendScore("10");
		onlinequizPOM.clickContext3();
		onlinequizPOM.sendBody3("c");
		onlinequizPOM.clickContext4();
		onlinequizPOM.sendBody4("c#");
		onlinequizPOM.clickAddQues();
		screenShot.captureScreenShot("Item added");
		previewPOM.clickPreview();
		previewPOM.clickStartTest();
		previewPOM.clickAns();
		previewPOM.clickEndTest();
		screenShot.captureScreenShot("Test Result");
		previewPOM.clickProf();
		previewPOM.clickLogout();
		elearningloginPOM.sendUserName("admin");
		elearningloginPOM.sendPassword("admin@123");
		elearningloginPOM.clickLoginBtn(); 
		Thread.sleep(3000);
		adminPOM.clickReporting();
		adminPOM.clickFollowedTeachers();
		adminPOM.sendKeyword("SamrinaS");
		adminPOM.clickSearch();
		adminPOM.clickDetails();
		adminPOM.clickStudent();
		adminPOM.clickTest();
		adminPOM.clickSendEmail();
		adminPOM.clickCorrectTest();
		screenShot.captureScreenShot("Mail Sent");
		adminPOM.clickCourse();
		screenShot.captureScreenShot("Course");
		
		
		
		
}
		
		
		
	
}
