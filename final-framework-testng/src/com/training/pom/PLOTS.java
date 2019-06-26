package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PLOTS {
	private WebDriver driver; 
	
	public PLOTS (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=(" //*[@id=\"menu-item-570\"]/a"))
	private WebElement Plots ; 
	
	public void clickPlots() {
		this.Plots.click(); 
	}
	
	@FindBy(xpath=("//*[@id=\"realteo-search-form\"]/div[3]/div/button"))
	private WebElement Search ; 
	
	public void clickSearch() {
		this.Search.click(); 
	}
	
	@FindBy(xpath="//a[.='All Users']")
	private WebElement Allusers; 
	
	public void clickAllusers() {
		this.Allusers.click(); 
	}
	
	@FindBy(id="keyword_search") 
	private WebElement Address;
	
	public void sendAddress(String Address) {
		this.Address.clear();
		this.Address.sendKeys(Address);
	}
	@FindBy(name="email") 
	private WebElement Email;
	
	public void sendEmail(String Email) {
		this.Email.clear();
		this.Email.sendKeys(Email);
	}
	@FindBy(id="first_name") 
	private WebElement Firstname;
	
	public void sendFirstname(String Firstname) {
		this.Firstname.clear();
		this.Firstname.sendKeys(Firstname);
	}
	@FindBy(id="lasst_name") 
	private WebElement Lastname;
	
	public void sendLastname(String Lastname) {
		this.Lastname.clear();
		this.Lastname.sendKeys(Lastname);
	}
	@FindBy(id="url") 
	private WebElement Website;
	
	public void sendWebsite(String Website) {
		this.Website.clear();
		this.Website.sendKeys(Website);
	}
	
	
	@FindBy(xpath="//*[@class=\"button wp-generate-pw hide-if-no-js\"]")
	private WebElement ShowPassword ; 
	
	public void clickShowPassword() {
		this.ShowPassword.click(); 
	}
	
	@FindBy(id="pass1-text") 
	private WebElement Password;
	
	public void sendPassword(String Password) {
		this.Password.clear();
		this.Password.sendKeys(Password);
	}
	@FindBy(name="role")
	private WebElement Role ; 
	
	public void clickRole() {
		this.Role.click(); 
	}
	@FindBy(id="createusersub") 
	private WebElement Addnewuserbutton;
	
	public void clickAddnewuserbutton() {
		this.Addnewuserbutton.click(); 
	}
}