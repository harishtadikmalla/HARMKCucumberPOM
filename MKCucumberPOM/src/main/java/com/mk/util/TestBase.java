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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	protected static ExtentReports report;
	protected static ExtentTest logger;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Harish\\git\\HARMKCucumberPOM\\MKCucumberPOM\\src\\main\\java\\com\\mk\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
	/*@BeforeTest
	public void beforeTest() {
		report = new ExtentReports("C:\\Users\\Harish\\Desktop\\Report\\MK1.html");
		logger = report.startTest("MK First Test");
	}
	
	@AfterTest
	public void afterTest() {
		report.endTest(logger);
	    report.flush();
	}*/
	
	public static void Initialization() {
		
		String browsername = prop.getProperty("browser");
		if(browsername.toUpperCase().equals("CHROME")) {
			driver = new ChromeDriver();
		}else if(browsername.toUpperCase().equals("FIREFOX")) {
			driver = new FirefoxDriver();
		}
	//	logger.log(LogStatus.INFO, "Browser Initialized");
		driver.manage().window().maximize();
		//driver.manage().
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	//	logger.log(LogStatus.INFO, "URL Opened");
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
	
	public static void wait(WebElement ele) {
		WebDriverWait eleWait = new WebDriverWait(driver,20);
		eleWait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	
	

}
