package utils;

import org.openqa.selenium.By;

public class demo {

	
	public static void main(String[] args) {
		Ebayhw();
	}
	
	public static void Ebayhw() {
		Driver.getDriver().get("https://ebay.com");
		Driver.getDriver().findElement(By.id("gh-ac")).sendKeys("coffe mug");
		Driver.getDriver().findElement(By.id("gh-btn")).click();
		
	}
}
