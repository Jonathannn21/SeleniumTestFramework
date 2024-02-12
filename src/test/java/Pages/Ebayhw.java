package Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class Ebayhw {

	
	private WebDriver driver;
	
	public Ebayhw() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(id = "gh-ac")
	public WebElement Ebaysearchbox;
	
	@FindBy(id= "gh-btn")
	public WebElement EbaySearchbtt;
	
	@FindBy (xpath="//span[@class='s-item__price']")
	public static List <WebElement> EbayPrice;
	

	public Ebayhw(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
		public static void ebayPrices() { 
		for (WebElement prices : EbayPrice) {
			System.out.println(prices.getText());
		}

			
	}






}
	 
	
	

