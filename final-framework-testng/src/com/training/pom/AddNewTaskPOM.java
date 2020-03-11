package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewTaskPOM {
	private WebDriver driver; 
	
	public AddNewTaskPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="add_post_title")
	private WebElement task_title ;
	
	@FindBy(className="fa-check")
	private WebElement save_btn ;
	
	public void sendTaskTitle(String title) {
		this.task_title.clear();
		this.task_title.sendKeys(title);
	}
	
	public void clickSaveBtn() {
		this.save_btn.click();
	
	}
	
	
}
