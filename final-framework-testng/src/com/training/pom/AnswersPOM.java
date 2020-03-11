package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnswersPOM {
	private WebDriver driver; 
	
	public AnswersPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@value='1116']")
	//@FindBy(id = "choice-288-1")
	private WebElement Answer1; 
	
	
	public void clickAnswer1() {
		this.Answer1.click();
		//Actions act =new Actions(this.driver);
		//act.moveToElement(Answer2).click();
	}
	
	@FindBy(className = "btn-primary")
	private WebElement NextQues; 
	
	
	public void clickNextQues() {
		this.NextQues.click();
		//Actions act =new Actions(this.driver);
		//act.moveToElement(NextQues).click();
	}

	@FindBy(xpath = "//input[@value='1121']")
	//@FindBy(id = "choice-289-2")
	private WebElement Answer2; 
	
	
	public void clickAnswer2() {
		this.Answer2.click();
		//Actions act =new Actions(this.driver);
		//act.moveToElement(Answer2).click();
	}
	
	@FindBy(className = "btn-warning")
	private WebElement EndTest; 
	
	
	public void clickEndTest() {
		//Actions act =new Actions(this.driver);
		//act.moveToElement(EndTest).click();
		this.EndTest.click();
	}
	
	}
