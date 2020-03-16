package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPOM {
	private WebDriver driver; 
	
	public AdminPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(partialLinkText="Reporting")
	private WebElement Reporting; 
	
	@FindBy(linkText="Followed teachers")
	private WebElement Followed_teachers; 
	
	@FindBy(xpath="//input[@id='search_user_keyword']")
	private WebElement Keyword;
	
	@FindBy(id="search_user_submit")
	private WebElement Search;
	
	@FindBy(xpath="//img[@alt='Details SamrinaS']")
	private WebElement Details;
	
	//@FindBy(xpath="//a[@href*='course=AWS&']")
	
	@FindBy(xpath="(//img[@src='http://elearningm1.upskills.in/main/img/icons/22/2rightarrow.png'])[8]")
	private WebElement Student; 
	
	@FindBy(xpath="//img[@alt='Test']")
	private WebElement Test;
	
	@FindBy(xpath="//input[@name='send_notification']")
	private WebElement Send_email;
	
	@FindBy(id="form-email_submit")
	private WebElement Correct_Test;
	
	@FindBy(partialLinkText="AWS")
	private WebElement Course;
	
	
	
	public void clickReporting() {
		this.Reporting.click();
	}
	
	public void clickFollowedTeachers() {
		this.Followed_teachers.click();
	}
	
	public void sendKeyword(String teacher) {
		this.Keyword.clear();
		this.Keyword.sendKeys(teacher);
	}
	
	public void clickSearch() {
		this.Search.click();
	}
	
	public void clickDetails() {
		this.Details.click();
	}
	
	public void clickStudent() {
		this.Student.click();
		//Actions act =new Actions(this.driver);
		//act.moveToElement(Student).click();
	}
	
	public void clickTest() {
		this.Test.click();
	}
	
	public void clickSendEmail() {
		this.Send_email.click();
	}
	
	public void clickCorrectTest() {
		this.Correct_Test.click();
	}
	
	public void clickCourse() {
		this.Course.click();
	}
	
	}











































