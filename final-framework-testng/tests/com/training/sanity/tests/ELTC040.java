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
import com.training.pom.ElearningLoginPOM;
import com.training.pom.MyCoursePOM;
import com.training.pom.ProjectPOM;
import com.training.pom.RoleManagementPOM;
import com.training.pom.UserManagementPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
public class ELTC040 {

	private WebDriver driver;
	private String baseUrl;
	
	private ElearningLoginPOM elearningloginPOM;
	private MyCoursePOM mycoursePOM;
	private ProjectPOM projectPOM;
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
		mycoursePOM = new MyCoursePOM(driver); 
		projectPOM = new ProjectPOM(driver);
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
		elearningloginPOM.sendUserName("SamrinaS");
		elearningloginPOM.sendPassword("Toffee@2018");
		elearningloginPOM.clickLoginBtn(); 
		Thread.sleep(3000);
		mycoursePOM.clickMycourse();
		projectPOM.clickProjectsimg();
		screenShot.captureScreenShot("Project");
		addnewprojectPOM.createnewproject();
		screenShot.captureScreenShot("NewProject");
		addnewprojectPOM.sendProjectTitle("e learning");
		addnewprojectPOM.sendProjectSubTitle("e learning project");
		screenShot.captureScreenShot("ProjectCredentials");
		addnewprojectPOM.clickSubmitBtn();
		screenShot.captureScreenShot("NewProjectAdded");
		screenShot.captureScreenShot("Welcome");
		addnewprojectPOM.clickTitle();
		addnewprojectPOM.createNewTask();
		addnewtaskPOM.sendTaskTitle("design");
		addnewtaskPOM.clickSaveBtn();
		screenShot.captureScreenShot("NewTaskAdded");
		addnewrolePOM.clickRoleMgmtImg();
		addnewrolePOM.clickNewRoleImg();
		addnewrolePOM.sendRoleTitle("developer");
		addnewrolePOM.clickSaveBtn();
		screenShot.captureScreenShot("NewRoleAdded");
		addnewrolePOM.clickAssignRole();
		rolemanagementPOM.clickUserId();
		rolemanagementPOM.clickTitle();
		screenShot.captureScreenShot("User");
		rolemanagementPOM.clickValidate();
		screenShot.captureScreenShot("TaskAssigned");
		usermanagementPOM.clickUsersimg();
		usermanagementPOM.clickCheckbox();
		usermanagementPOM.clickRegister();
		screenShot.captureScreenShot("Registered");
}
		
		
		
	
}