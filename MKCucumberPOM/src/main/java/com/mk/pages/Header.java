package com.mk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mk.util.TestBase;

public class Header extends TestBase{
	
	static WebElement signInLnk = driver.findElement(By.xpath("//div[@class='header-my-account']/a[@title='Sign In']"));
	public static void openSignInFlyout() {
		signInLnk.click();
	}
}
