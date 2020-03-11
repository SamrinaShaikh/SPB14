package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCoursePOM {
	private WebDriver driver; 
	
	public MyCoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	@FindBy(partialLinkText="AWS_2")	
	//@FindBy(partialLinkText="selenium") 
	private WebElement my_course ;
	
	public void clickMycourse() {
		Actions act =new Actions(this.driver);
		//act.moveToElement(my_course).click();
		this.my_course.click();
	}
	
	
	
	
}
