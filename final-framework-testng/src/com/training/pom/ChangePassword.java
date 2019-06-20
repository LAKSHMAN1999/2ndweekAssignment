package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword {
	private WebDriver driver; 
	
	public ChangePassword (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//*[@id=\"post-133\"]/div[1]/div/div/ul[2]/li[1]/a"))
	private WebElement ChangePassword ; 
	
	public void clickChangePassword() {
		this.ChangePassword.click(); 
	}
	
	@FindBy(name="current_pass") 
	private WebElement CurrentPassword;
	
	public void sendCurrentPassword(String CurrentPassword) {
		this.CurrentPassword.clear();
		this.CurrentPassword.sendKeys(CurrentPassword);
	}
	
	@FindBy(name="pass1") 
	private WebElement NewPassword;
	
	public void sendNewPassword(String NewPassword) {
		this.NewPassword.clear();
		this.NewPassword.sendKeys(NewPassword);
	}
	@FindBy(name="pass2") 
	private WebElement ConfirmNewPassword;
	
	public void sendConfirmNewPassword(String ConfirmNewPassword) {
		this.ConfirmNewPassword.clear();
		this.ConfirmNewPassword.sendKeys(ConfirmNewPassword);
	}
	@FindBy(id="wp-submit")
	private WebElement SaveChanges ; 
	
	public void clickSaveChanges() {
		this.SaveChanges.click(); 
	}
}