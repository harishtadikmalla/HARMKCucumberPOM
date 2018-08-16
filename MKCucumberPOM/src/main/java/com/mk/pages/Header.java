package com.mk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mk.util.TestBase;

public class Header extends TestBase{
	
	static WebElement signInLnk = driver.findElement(By.xpath("//div[@class='user-items-wrapper']//li[@class='mk-sign-in']//div[@class='header-my-account']//a[@title='Sign In']"));
	
	public static void openSignInFlyout() {
		sleep(3);
		wait(driver,signInLnk);
		signInLnk.click();
	}
	public static void signIn(String username,String password) {
		//driver.switchTo().frame(0);
		WebElement uname = driver.findElement(By.xpath("//form[@id='signInForm']//input[@id='username']"));
		WebElement pwd = driver.findElement(By.xpath("//form[@id='signInForm']//input[@type='password' and @id='password']"));
		WebElement signInBtn = driver.findElement(By.xpath("//form[@id='signInForm']//button[@type='submit' and @name='sign-in']"));
		uname.sendKeys(username);
		pwd.sendKeys(password);
		signInBtn.click();
		sleep(10);
		
	}
}
