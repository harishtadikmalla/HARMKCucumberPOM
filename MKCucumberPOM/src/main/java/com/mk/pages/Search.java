package com.mk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mk.util.TestBase;

public class Search extends TestBase{
	
	
	
	public static void searchAnItem(String searchTxt) {
		WebElement searchFld = driver.findElement(By.xpath("//a[@class='search-link loyalty-search-link']"));
		searchFld.click();
		
		WebElement searchInptBox = driver.findElement(By.xpath("//input[@id='search-box' and @class='mk-search-input show-auto-suggest']"));
		searchInptBox.sendKeys(searchTxt);
		Actions action = new Actions(driver); 
		action.sendKeys(Keys.ENTER).build().perform();
	}
}
