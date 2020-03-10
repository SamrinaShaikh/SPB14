package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPOM {
	private WebDriver driver; 
	
	public PasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="I lost my password")
	private WebElement lostpswd; 
	
	public void clicklostpswd() {
		this.lostpswd.click();
	}
	
	
}
