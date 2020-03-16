package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM {
	private WebDriver driver; 
	
	public LogoutPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//img[@alt='Manzoor Mehadi']")
	private WebElement Prof;
	
	@FindBy(partialLinkText="Logout")
	private WebElement Logout; 
	
	public void clickProf() {
		this.Prof.click();
	}
	
	public void clickLogout() {
		this.Logout.click();
	}
	
	}
