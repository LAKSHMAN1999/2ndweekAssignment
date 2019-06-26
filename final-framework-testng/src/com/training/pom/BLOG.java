package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLOG {
	private WebDriver driver; 
	
	public BLOG (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"menu-item-617\"]/a")
	private WebElement BLOG; 
	
	public void clickBLOG() {
		this.BLOG.click(); 
	}
	
	@FindBy(xpath=("//*[@id=\"ajaxsearchlite1\"]/div/div[3]/form/input[1]"))
	private WebElement Searchproperties ; 
	
	public void clickSearchproperties() {
		this.Searchproperties.click(); 
	}
	
	@FindBy(xpath="//*[@id=\"ajaxsearchlite1\"]/div/div[3]/form/input[1]") 
	private WebElement SearchPropertie;
	
	public void sendSearchPropertie(String SearchPropertie) {
		this.SearchPropertie.clear();
		this.SearchPropertie.sendKeys(SearchPropertie);
	}
	@FindBy(xpath="//*[@class = 'resdrg']/div[1]")
	private WebElement SearchResult; 
	
	public void clickSearchResult() {
		this.SearchResult.click(); 
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