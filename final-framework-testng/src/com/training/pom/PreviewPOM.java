package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreviewPOM {
	private WebDriver driver; 
	
	public PreviewPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Preview']")
	private WebElement Preview; 
	
	
	@FindBy(linkText="Start test")
	private WebElement StartTest; 
	

	
	@FindBy(xpath ="(//input[@type='radio'])[2]")
	private WebElement ans; 
	
	@FindBy(className= "question-validate-btn")
	private WebElement EndTest; 
	
	@FindBy(xpath ="//img[@alt='Samrina Shaikh']")
	private WebElement Prof;
	
	@FindBy(partialLinkText="Logout")
	private WebElement Logout; 
	
	public void clickPreview() {
		this.Preview.click();
	}

	public void clickStartTest() {
		this.StartTest.click();
	}
	
	public void clickAns() {
		this.ans.click();
	}
	
	
	public void clickEndTest() {
		this.EndTest.click();
	}
	
	public void clickProf() {
		this.Prof.click();
	}
	
	public void clickLogout() {
		this.Logout.click();
	}
	}











































