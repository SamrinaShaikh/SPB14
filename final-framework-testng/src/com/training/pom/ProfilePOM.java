package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProfilePOM {
	private WebDriver driver; 
	
	public ProfilePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="profile_password0")
	private WebElement Profile_pswd ;
	
	@FindBy(id="password1")
	private WebElement New_pswd ;
	

	@FindBy(id="profile_password2")
	private WebElement Conf_pswd ;
	
	
	@FindBy(id="profile_apply_change")
	private WebElement Save_btn ;
	
	public void sendcurrpswd(String password) {
		this.Profile_pswd.clear();
		this.Profile_pswd.sendKeys(password);
	}
	
	
	public void sendnewpwd(String password) {
		this.New_pswd.clear();
		this.New_pswd.sendKeys(password);
	}
	
	
	public void sendconfpswd(String password) {
		this.Conf_pswd.clear();
		this.Conf_pswd.sendKeys(password);
	}
	
	
	
	public void clickSavebtn() {
	this.Save_btn.click();	
	}
	
	@FindBy(className="alert-info")
	private WebElement alert_btn ;
	
	public void displayalert() {
		this.alert_btn.isDisplayed();
	}
	
}
