package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LostPswdPOM {
	private WebDriver driver; 
	
	public LostPswdPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="lost_password_user")
	private WebElement lost_userName; 
	
	@FindBy(id="lost_password_submit")
	private WebElement lost_pswd_btn;
	
	//@FindBy(id="form-login_submitAuth")
	//private WebElement loginBtn; 
	
	public void sendlostuserName(String userName) {
		this.lost_userName.clear();
		this.lost_userName.sendKeys(userName);
	}
	
	//public void sendPassword(String password) {
	//	this.password.clear(); 
	//	this.password.sendKeys(password); 
	//}
	
	public void clicklostpswd() {
		this.lost_pswd_btn.click(); 
	}
}
