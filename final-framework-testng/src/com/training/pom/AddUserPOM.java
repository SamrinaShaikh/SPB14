package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPOM {
	private WebDriver driver; 
	
	public AddUserPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Add a user")
	private WebElement Add_user; 
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='0']")
	private WebElement enter_password;
	
	@FindBy(className="filter-option-inner-inner")
	private WebElement profile;
	
	@FindBy(xpath="(//div[@class='bs-searchbox']/input)[1]")
	private WebElement text;
	
	//@FindBy(xpath = "//ul[@class = 'dropdown-menu inner']//li/a")...bs-searchbox
	
	
	@FindBy(xpath="//span[@class='text']")
	private WebElement text_select;
	
	@FindBy(name="submit")
	private WebElement submit_btn;
	
	public void clickAddUser() {
		this.Add_user.click();
	}
	
	public void sendfirstname(String firstname) {
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}
	
	public void sendlastname(String lastname) {
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}
	
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void sendPhone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}
	
	public void sendUsername(String login) {
		this.login.clear();
		this.login.sendKeys(login);
	}
	
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public void clickEnterPassword() {
		this.enter_password.click();
	}
	
	public void clickProfile() {
		this.profile.click();
	}
	
	public void sendText(String text) {
		//this.profile.clear();
		this.text.sendKeys(text);
	}
	
	public void clickTextSelect() {
		this.text_select.click();
	}
	
	public void clickSubmit() {
		this.submit_btn.click();
	}
	
	}
