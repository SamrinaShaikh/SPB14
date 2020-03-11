package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPOM {
	private WebDriver driver; 
	
	public ProjectPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//@FindBy(id="toolimage_16151")
	@FindBy(xpath="//img[@alt='Projects']")
	private WebElement Projects_img ;
	
	public void clickProjectsimg() {
		Actions act =new Actions(this.driver);
		//act.moveToElement(Projects_img).click();
		this.Projects_img.click();
	}
	
	
	
	
}
