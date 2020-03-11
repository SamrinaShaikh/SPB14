package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribePOM {
	private WebDriver driver; 
	
	public SubscribePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	@FindBy(xpath="//a[@title='Subscribe']")
	private WebElement subscribe_btn ;
	
	public void clickSubscribe() {
		Actions act =new Actions(this.driver);
				//act.moveToElement(homepage).click();
		this.subscribe_btn.click();
	}
	
	
	
	@FindBy(xpath="//img[@alt='AWS']")
	private WebElement title ;
	
	public void clickTitle() {
		Actions act =new Actions(this.driver);
		//act.moveToElement(title).click();
		this.title.click();
	}
	
}
