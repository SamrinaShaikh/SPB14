package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPOM {
	private WebDriver driver; 
	
	public TestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Tests']")
	private WebElement Tests; 
	
	
	public void clickTests() {
		this.Tests.click();
	}
	
	@FindBy(linkText="TestAWS1")
	private WebElement Tests_clk; 
	
	
	public void clickTests_clk() {
		this.Tests_clk.click();
	}
	
	}
