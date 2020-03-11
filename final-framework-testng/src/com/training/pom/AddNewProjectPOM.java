package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewProjectPOM {
	private WebDriver driver; 
	
	public AddNewProjectPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//@FindBy(css="a[title=\"Create a new project\"]")
	
	
	@FindBy(xpath="//img[@alt='Create a new project']")
	private WebElement new_project ;
	
	public void createnewproject() {
		Actions act =new Actions(this.driver);
		//act.moveToElement(new_project).click();
		this.new_project.click();
	}
	
	@FindBy(id="add_blog_blog_name")
	private WebElement prjct_title ;
	
	@FindBy(id="add_blog_blog_subtitle")
	private WebElement prjct_sbtitle ;
	
	public void sendProjectTitle(String title) {
		this.prjct_title.clear();
		this.prjct_title.sendKeys(title);
	}
	
	public void sendProjectSubTitle(String subtitle) {
		this.prjct_sbtitle.clear();
		this.prjct_sbtitle.sendKeys(subtitle);
	}
	
	@FindBy(id="add_blog_submit")
	private WebElement submit_btn ;
	
	public void clickSubmitBtn() {
		this.submit_btn.click(); 
	}
	
	@FindBy(linkText="e learning")
	private WebElement title ;
	
	public void clickTitle() {
		this.title.click(); 
	}
	
	@FindBy(xpath="//img[@alt='New task']")
	private WebElement new_tsk ;
	
	public void createNewTask() {
		Actions act =new Actions(this.driver);
		//act.moveToElement(new_project).click();
		this.new_tsk.click();
	}
	
}
