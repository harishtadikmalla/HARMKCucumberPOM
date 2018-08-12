package com.mk.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mk.util.TestBase;

public class Products extends TestBase{
	
	
	
	public static void goToPDP(String styleID) {
		WebElement itemID = driver.findElement(By.xpath("//div[@class='LazyLoad is-visible']//img[contains(@src,'"+styleID+"')]"));
		itemID.click();
		
	}
	
	public static void selectColor(String color) {
		WebElement spanColor = driver.findElement(By.xpath("//span[@class='selected-color']"));
		String selectedColor = spanColor.getText();
		System.out.println(selectedColor);
		List<WebElement> availColors = driver.findElements(By.xpath("//ul[@class='facet-section']//li[@class='facet-color-options deselected']"));
		System.out.println(availColors.toString());
		for(WebElement we : availColors){
			if(selectedColor.equals(color)) {
		    	break;
		    }
			we.click();
			selectedColor = spanColor.getText();
			System.out.println(selectedColor);
		}
		
		
	}
}
