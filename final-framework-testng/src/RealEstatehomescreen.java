

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealEstatehomescreen {
	private WebDriver driver; 
	
	public RealEstatehomescreen(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='Real Estate']")
	private WebElement Realhome; 
	
	public void clickRealhome() {
		this.Realhome.click(); 
	}
	
	
	@FindBy(xpath=("//*[@id='header']/div[2]/div/div/div/ul/li[1]/a"))
	private WebElement Myprofile; 
	
	public void clickMyprofile() {
		this.Myprofile.click(); 
	}
	
}
