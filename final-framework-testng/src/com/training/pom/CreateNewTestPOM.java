package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTestPOM {
	private WebDriver driver; 
	
	public CreateNewTestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='exercise_title']")
	private WebElement Title; 
	
	@FindBy(id="advanced_params")
	private WebElement adv_btn;
	
	
	
	
	@FindBy(className= "cke_wysiwyg_frame")
	private WebElement context; 
	
	@FindBy(className= "cke_contents_ltr")
	private WebElement body; 
	
	
	
	@FindBy(xpath = "//input[@value ='0']")
	private WebElement feedback; 
	
	@FindBy(xpath="//input[@name='activate_start_date_check']")
	private WebElement en_start_time; 
	
	@FindBy(id="start_time_alt_text")
	private WebElement date_picker; 
	
	@FindBy(className="ui-datepicker-current")
	private WebElement date;
	
	@FindBy(className="ui-datepicker-close")
	private WebElement done;
	
	@FindBy(xpath="//input[@id='pass_percentage']")
	private WebElement Pass_percent;
	
	@FindBy(id="exercise_admin_submitExercise")
	private WebElement proceed; 
	
	public void sendTitle(String title) {
		this.Title.clear();
		this.Title.sendKeys(title);
	}
	
	
	public void clickAdvancedSettings() {
		this.adv_btn.click();	
	}
	
	
	//public void sendContext(String context) {
		//driver.switchTo().frame(this.context);
		//this.context.sendKeys(context);
		//driver.switchTo().defaultContent();
	//}
	
	public void clickContext() {
		driver.switchTo().frame(context);
	}
	
	public void sendBody(String body) {
		this.body.sendKeys(body);
		driver.switchTo().defaultContent();
	}
	
	
	public void clickFeedback() {
		this.feedback.click();	
	}
	
	
	public void clickStartTime() {
		this.en_start_time.click();	
	}
	

	public void clickDatePicker() {
		this.date_picker.click();	
	}
	
	
	public void clickDate() {
		this.date.click();
	}

	
	public void clickDone() {
		this.done.click();
	}
	
	public void clickPassPercent(String percent) {
		this.Pass_percent.clear();
		this.Pass_percent.sendKeys(percent);
	}
	
	public void clickProceed() {
		this.proceed.click();
	}
}
