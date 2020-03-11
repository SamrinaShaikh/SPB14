package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewRolePOM {
	private WebDriver driver; 
	
	public AddNewRolePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//img[@alt='Roles management']")
	private WebElement role_mgmt_img ;
	
	public void clickRoleMgmtImg() {
		Actions act =new Actions(this.driver);
		//act.moveToElement(new_project).click();
		this.role_mgmt_img.click();
	}
	
	@FindBy(xpath="//img[@alt='Add a new role']")
	private WebElement new_role_img ;
	
	public void clickNewRoleImg() {
		Actions act =new Actions(this.driver);
		//act.moveToElement(new_project).click();
		this.new_role_img.click();
	}
	
	@FindBy(xpath="//input[@name='task_name']")
	private WebElement role_title ;
	
	public void sendRoleTitle(String taskName) {
		this.role_title.clear();
		this.role_title.sendKeys(taskName);
	}
	
	@FindBy(className="save")
	private WebElement save_btn;
	
	public void clickSaveBtn() {
		this.save_btn.click(); 
	}
	
	@FindBy(xpath="//img[@alt='Assign roles']")
	private WebElement assign_role ;
	
	public void clickAssignRole() {
		Actions act =new Actions(this.driver);
		//act.moveToElement(new_project).click();
		this.assign_role.click();
	}
}
