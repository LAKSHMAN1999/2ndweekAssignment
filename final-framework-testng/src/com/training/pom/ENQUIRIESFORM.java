package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ENQUIRIESFORM {
	private WebDriver driver; 
	
	public ENQUIRIESFORM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="your-name") 
	private WebElement yourname;
	
	public void sendyourname(String yourname) {
		this.yourname.clear();
		this.yourname.sendKeys(yourname);
	}
	@FindBy(name="your-email") 
	private WebElement youremail;
	
	public void sendyouremail(String youremail) {
		this.youremail.clear();
		this.youremail.sendKeys(youremail);
	}
	
	
	@FindBy(name="your-subject") 
	private WebElement yoursubject;
	
	public void sendyoursubject(String yoursubject) {
		this.yoursubject.clear();
		this.yoursubject.sendKeys(yoursubject);
	}
	
	@FindBy(name="your-message") 
	private WebElement yourmessage;
	
	public void sendyourmessage(String yourmessage) {
		this.yourmessage.clear();
		this.yourmessage.sendKeys(yourmessage);
	}
	@FindBy(xpath="//*[@class='wpcf7-form-control wpcf7-submit']")
	private WebElement Sendbutton; 
	
	public void clickSendbutton() {
		this.Sendbutton.click(); 
	}
	
	
}
