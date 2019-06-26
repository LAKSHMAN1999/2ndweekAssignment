package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealEstatehome {
	private WebDriver driver; 
	
	public RealEstatehome(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='Real Estate']")
	private WebElement Realhome; 
	
	public void clickRealhome() {
		this.Realhome.click(); 
	}
	@FindBy(xpath="//*[@id=\"menu-item-571\"]/a")
	private WebElement Villas; 
	
	public void clickVillas() {
		this.Villas.click(); 
	}
	
	@FindBy(xpath="//*[@id=\"menu-item-617\"]/a")
	private WebElement BLOG; 
	
	public void clickBLOG() {
		this.BLOG.click(); 
	}
	
	@FindBy(xpath="//*[@id=\"ajaxsearchlite2\"]/div/div[3]/form/input[1]")
	private WebElement SearchProperties; 
	
	public void clickSearchProperties() {
		this.SearchProperties.click(); 
	}
	@FindBy(xpath="//*[@id=\"ajaxsearchlite2\"]/div/div[3]/form/input[1]") 
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
	
	
}
