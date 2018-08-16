package com.mk.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mk.pages.Header;
import com.mk.pages.Products;
import com.mk.pages.Search;
import com.mk.util.TestBase;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.formatter.Reporter;

public class test1 extends TestBase {
	String styleID = prop.getProperty("styleid");
	
	@Given("^user is in Main Page$")
	public void user_is_in_Main_Page(){
		TestBase.Initialization();
		sleep(5);
		WebElement clsBtn = driver.findElement(By.xpath("//div[@class='korsvip-signUp-sub-wrapper']//div//button[@id='closekorsvipsignUpModel']"));
		if(clsBtn.isDisplayed()){
		clsBtn.click();
		}
		//logger.log(LogStatus.PASS, "User is in Main page");
	}
	
	@Then("^Search for an item$")
	public void search_for_an_item(){
		Search.searchAnItem(styleID);
		//logger.log(LogStatus.PASS, "Search for an Item");
		//Reporter.addStepLog(“Step Log message goes here”);
	}
	
	@Then("^select a color$")
	public void select_a_color() {
	    Products.selectColor("OPTIC WHITE");
	  //  logger.log(LogStatus.PASS, "Select A Color");
	    
	}

	
	@Then("^navigate to PDP from products page$")
	public void navigate_to_PDP_from_products_page() {
		Products.goToPDP(styleID);
		//logger.log(LogStatus.PASS, "Navigate to PDP");
	}


	@Then("^Mouse hover on the Mega Menu$")
	public void Mouse_hover_on_the_Mega_Menu() throws Throwable {
		
		WebElement shoes = getMegaMenuWebElement("shoes");
		wait(driver,shoes);
		moveToElement(shoes);
		//logger.log(LogStatus.PASS, "Mouse Hover on Mega Menu");
	}
	
	@Then("^Click on a Sub Menu Item$")
	public void click_on_a_Sub_Menu_Item(){
		WebElement viewAllShoes = getSubMenuWebElement("VIEW ALL SHOES");
		wait(driver,viewAllShoes);
		viewAllShoes.click();
		//logger.log(LogStatus.PASS, "Click on Sub Menu item");
	}
	
	@Then("^Open Sign In Flyout$")
	public void Open_Sign_In_Flyout(){
		Header.openSignInFlyout();
		//logger.log(LogStatus.PASS, "Open Sign In Flyout");
	}
	
	@Then("^Sign In$")
	public void Sign_In(){
		Header.signIn(prop.getProperty("username"),prop.getProperty("password"));
	//	logger.log(LogStatus.PASS, "Sign In ");
	}
	
	

}
