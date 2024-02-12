package utils;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		String browser = System.getProperty("browser");
		
		if(browser==null) {
			
			browser= propertiesReader.getProperty("Browser_type");
			if(driver==null)
				switch(browser) {
			case "chrome":
				 driver = new ChromeDriver();
				break;
			case "chrome--headless":
				ChromeOptions ChOpt = new ChromeOptions();
				ChOpt.addArguments("--headless");
				ChOpt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
				driver = new ChromeDriver(ChOpt);
				break;
			case"firefox":
				driver = new FirefoxDriver();
				break;
			case"firefox--headless":
				FirefoxOptions Ffopt = new FirefoxOptions();
				Ffopt.addArguments("--headless");
				Ffopt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
				driver = new FirefoxDriver(Ffopt);
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
				default:
					driver = new ChromeDriver();
					break;
				
				}
		}
		
		
		
		return driver;
		
	}
	
	
	
	
}
