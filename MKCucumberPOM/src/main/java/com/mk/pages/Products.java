package com.mk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mk.util.TestBase;

public class Products extends TestBase{
	
	
	
	public static void goToPDP(String styleID) {
		WebElement itemID = driver.findElement(By.xpath("//div[@class='LazyLoad is-visible']//img[contains(@src,'"+styleID+"')]"));
		itemID.click();
		
	}
}
