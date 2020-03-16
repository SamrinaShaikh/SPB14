package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestNewPOM {
	private WebDriver driver; 
	
	public TestNewPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Tests']")
	private WebElement Tests; 
	
	@FindBy(xpath="//img[@alt='Create a new test']")
	private WebElement NewTest; 
	
	public void clickTests() {
		this.Tests.click();
	}
	
	
	
	
	public void clickNewTest() {
		this.NewTest.click();
	}
	
	}
