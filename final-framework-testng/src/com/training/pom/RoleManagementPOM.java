package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;
public class RoleManagementPOM {
	private WebDriver driver; 
	
	public RoleManagementPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(className="filter-option-inner-inner")
	private WebElement user_id;

	
	public void clickUserId() { 
		this.user_id.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Sunil')]")
	private WebElement title;
	
	public void clickTitle() { 
		this.title.click();
			
	}
	
	@FindBy(id="assign_task_submit")
	private WebElement validate_btn;

	
	public void clickValidate() { 
		this.validate_btn.click();
	}
	
	
		//Select user_drpdwn1= new Select((WebElement) user_drpdwn);
		
		//user_drpdwn1.getOptions();
		//user_drpdwn1.getAllSelectedOptions();
		//user_drpdwn1.selectByIndex(2);
		//user_drpdwn1.selectByValue("Sunil Kumar");
		//user_drpdwn1.getOptions();
		//act.moveToElement(user_drpdwn).perform();
		//user_drpdwn1.selectByVisibleText("victor sam");	
	
	}
	
	

