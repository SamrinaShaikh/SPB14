package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseHomePOM {
	private WebDriver driver; 
	
	public CourseHomePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Course home")
	private WebElement Course; 
	
	
	public void clickCourse() {
		this.Course.click();
	}
	
	}
