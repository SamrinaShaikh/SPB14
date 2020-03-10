package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePOM {
	private WebDriver driver; 
	
	public HomepagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	@FindBy(linkText="Homepage")
	private WebElement homepage ;
	
	public void clickhomepage() {
		Actions act =new Actions(this.driver);
		//act.moveToElement(homepage).click();
		this.homepage.click();
	}
	
	@FindBy(linkText="Edit profile")
	private WebElement edit_profile ;
	
	public void clickeditprofile() {
		Actions act =new Actions(this.driver);
		//act.moveToElement(edit_profile).click();
		this.edit_profile.click();
	}
	
	
}
