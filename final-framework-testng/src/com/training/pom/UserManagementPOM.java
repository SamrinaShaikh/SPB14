package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;
public class UserManagementPOM {
	private WebDriver driver; 
	
	public UserManagementPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Users management']")
	private WebElement user_mgmt_img ;
	
	public void clickUsersimg() {
		Actions act =new Actions(this.driver);
		//act.moveToElement(Projects_img).click();
		this.user_mgmt_img.click();
	}
	
	
	@FindBy(xpath="//input[@value='691']")
	private WebElement chkbox ;
	

	
	public void clickCheckbox() { 
		this.chkbox.click();
	}
	
	@FindBy(linkText="Register")
	private WebElement Register_btn ;	

	public void clickRegister() { 
		this.Register_btn.click();
	}
	
	
	
	}
	
	

