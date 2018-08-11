package com.mk.util;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Harish\\eclipse-workspace\\MKCucumberPOM\\src\\main\\java\\com\\mk\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
	public static void Initialization() {
		String browsername = prop.getProperty("browser");
		if(browsername.toUpperCase().equals("CHROME")) {
			driver = new ChromeDriver();
		}else if(browsername.toUpperCase().equals("FIREFOX")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		//driver.manage().
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	public static WebElement getMegaMenuWebElement(String megaMenuOption) {
		
		String xpathVal = "//a[@class ='menu-link main l1flyout' and contains(text(),'"+megaMenuOption+"')]";
		WebElement ele = driver.findElement(By.xpath(xpathVal));
		return ele;
	}
	
	public static WebElement getSubMenuWebElement(String subMenuOption) {
		
		String xpathVal = "//a[@class ='menu-link l2flyout' and @title = '"+subMenuOption.toUpperCase()+"']";
		WebElement ele = driver.findElement(By.xpath(xpathVal));
		return ele;
	}
	
	public static WebElement getWebElementWithXpath(String xpathStr) {
		WebElement eleXpath = driver.findElement(By.xpath(xpathStr));
		return eleXpath;
	}
	
	public static void sleep(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
	public static void wait(WebDriver driver,WebElement ele) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	
	public static void moveToElement(WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
	}
	
	

}
