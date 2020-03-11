package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeTestPOM {
	private WebDriver driver; 
	
	public TakeTestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Start test")
	//@FindBy(className="btn btn-success btn-large") 
	private WebElement Test_start; 
	
	
	public void clickStartTest() {
		//Actions act =new Actions(this.driver);
		//act.moveToElement(Test_start).click();
		this.Test_start.click();
	}
	
	}
