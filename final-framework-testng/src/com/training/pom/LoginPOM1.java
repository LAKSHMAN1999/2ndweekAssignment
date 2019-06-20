package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM1 {
	private WebDriver driver; 
	
	public LoginPOM1(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='Real Estate']")
	private WebElement Realhome; 
	
	
	
	public void clickRealhome() {
		this.Realhome.click(); 
	}
	
}

