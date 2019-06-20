package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myprofile {
	private WebDriver driver; 
	
	public Myprofile (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//*[@id=\"post-133\"]/div[1]/div/div/ul[1]/li[2]/a"))
	private WebElement Myprofile; 
	
	public void clickMyprofile() {
		this.Myprofile.click(); 
	}
	
	@FindBy(name="agent_title")
	private WebElement Agenttitle;
	
	public void sendAgenttitle(String Agenttitle) {
		this.Agenttitle.clear();
		this.Agenttitle.sendKeys(Agenttitle);
	}
	
	@FindBy(id="phone")
	private WebElement phone;
	
	public void sendphone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}
	@FindBy(xpath="//*[@class='button margin-top-20 margin-bottom-20']")
	private WebElement Savechange;
	
	public void clickSavechange(){
		this.Savechange.click();
		
	
	}
}