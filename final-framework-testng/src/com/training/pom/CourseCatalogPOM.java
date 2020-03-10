package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CourseCatalogPOM {
	private WebDriver driver; 
	
	public CourseCatalogPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(linkText="Course catalog")
	private WebElement Course_catalog ;
	
	public void clickCourseCatalog() {
		this.Course_catalog.click();
		//Assert.assertEquals(Course_catalog).isDisplayed);
	}
	
	@FindBy(className="form-control")
	private WebElement Search_txt ;
	
	public void sendSearchtxt(String course) {
		this.Search_txt.clear();
		this.Search_txt.sendKeys(course);
	}
	
	@FindBy(className="btn-default")
	private WebElement Search_btn ;
	
	
	public void clickSearchbtn() {
	this.Search_btn.click();	
	}
	
	
	
}
