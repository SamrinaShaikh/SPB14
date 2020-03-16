package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineQuizPOM {
	private WebDriver driver; 
	
	public OnlineQuizPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Multiple choice']")
	private WebElement choice; 
	
	
	@FindBy(xpath="//input[@name='questionName']")
	private WebElement Ques; 
	
	@FindBy(xpath ="//iframe[@title='Rich Text Editor, answer[1]']")
	private WebElement context1; 
	
	@FindBy(className= "cke_contents_ltr")
	private WebElement body1; 
	
	@FindBy(xpath ="//iframe[@title='Rich Text Editor, answer[2]']")
	private WebElement context2; 
	
	@FindBy(className= "cke_contents_ltr")
	private WebElement body2; 
	
	//@FindBy(xpath= "//input[@value='1']")
	//private WebElement Value1;
	//private WebElement list;
	
	@FindBy(xpath= "(//input[@value='2'])[2]")
	private WebElement ans;
	
	@FindBy(xpath= "(//input[@name='weighting[2]]")
	private WebElement Score;
	
	@FindBy(xpath ="//iframe[@title='Rich Text Editor, answer[3]']")
	private WebElement context3; 
	
	@FindBy(className= "cke_contents_ltr")
	private WebElement body3; 
	
	@FindBy(xpath ="//iframe[@title='Rich Text Editor, answer[4]']")
	private WebElement context4; 
	
	@FindBy(className= "cke_contents_ltr")
	private WebElement body4; 
	
	
	@FindBy(id = "submit-question")
	private WebElement add_ques; 
	
	
	
	
	
	public void clickChoice() {
		this.choice.click();
	}

	
	
	public void sendQues(String Ques) {
		this.Ques.clear();
		this.Ques.sendKeys(Ques);
		
	}
	
	public void clickContext1() {
		driver.switchTo().frame(context1);
	}
	
	public void sendBody1(String body) {
		this.body1.sendKeys(body);
		driver.switchTo().defaultContent();
	}
	
	public void clickContext2() {
		driver.switchTo().frame(context2);
	}
	
	public void sendBody2(String body) {
		this.body2.sendKeys(body);
		driver.switchTo().defaultContent();
	}
	
	public void clickAnswer() {
		
		this.ans.click();
		//Actions act =new Actions(this.driver);
		//act.moveToElement(ans).click();
		//if(this.Value1.isSelected()) 
		//{
		//	this.Value1.c
		//}																													
		//this.ans.submit();
	}
	
	public void sendScore(String Score) {
		this.Score.clear();
		this.Score.sendKeys(Score);
		
	}
	
	public void clickContext3() {
		driver.switchTo().frame(context3);
	}
	
	public void sendBody3(String body) {
		this.body3.sendKeys(body);
		driver.switchTo().defaultContent();
	}
	
	public void clickContext4() {
		driver.switchTo().frame(context4);
	}
	
	public void sendBody4(String body) {
		this.body4.sendKeys(body);
		driver.switchTo().defaultContent();
	}
	
	
	public void clickAddQues() {
		this.add_ques.click();
	}
	
	
	
	}











































