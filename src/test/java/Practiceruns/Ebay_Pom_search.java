package Practiceruns;

import java.util.List;

import Pages.Ebayhw;
import utils.Driver;
import utils.propertiesReader;

public class Ebay_Pom_search {
	public static void main(String[] args) {
		ebayCoffeMugSearch();
	}

	
	public static void ebayCoffeMugSearch() {
		Ebayhw EbSearchpage = new Ebayhw();
		Driver.getDriver().get(propertiesReader.getProperty("Ebay_url"));
		EbSearchpage.Ebaysearchbox.sendKeys("Coffe Mug");
		EbSearchpage.EbaySearchbtt.click();
			Ebayhw.ebayPrices();
	}
	
	
}
