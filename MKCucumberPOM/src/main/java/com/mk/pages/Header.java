package com.mk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mk.util.TestBase;

public class Header extends TestBase{
	
	static WebElement signInLnk = driver.findElement(By.xpath("//div[@class='header-my-account']/a[@title='Sign In']"));
	static WebElement uname = driver.findElement(By.xpath("//input[@type='email' and id='username']"));
	static WebElement pwd = driver.findElement(By.xpath("//input[@type='password' and id='password']"));
	static WebElement signInBtn = driver.findElement(By.xpath("//button[@type='submit' and name='sign-in']"));
	public static void openSignInFlyout() {
		signInLnk.click();
	}
	public static void signIn(String username,String password) {
		uname.sendKeys(username);
		pwd.sendKeys(password);
		signInBtn.click();
		
	}
}
