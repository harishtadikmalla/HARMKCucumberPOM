package com.mk.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mk.pages.Header;
import com.mk.pages.Search;
import com.mk.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class test1 extends TestBase {
	
	@Given("^user is in Main Page$")
	public void user_is_in_Main_Page(){
		TestBase.Initialization();
		sleep(5);
		WebElement clsBtn = driver.findElement(By.xpath("//div[@class='korsvip-signUp-sub-wrapper']//div//button[@id='closekorsvipsignUpModel']"));
		if(clsBtn.isDisplayed()){
		clsBtn.click();
		}
	}
	
	@Then("^Search for an item$")
	public void search_for_an_item(){
		System.out.println(prop.toString());
		String styleID = prop.getProperty("styleid");
		Search.searchAnItem(styleID);
	}
	
	@Then("^navigate to PDP from products page$")
	public void navigate_to_PDP_from_products_page() {
	   
	}


	@Then("^Mouse hover on the Mega Menu$")
	public void Mouse_hover_on_the_Mega_Menu() throws Throwable {
		
		WebElement shoes = getMegaMenuWebElement("shoes");
		wait(driver,shoes);
		moveToElement(shoes);
	
	}
	
	@Then("^Click on a Sub Menu Item$")
	public void click_on_a_Sub_Menu_Item(){
		WebElement viewAllShoes = getSubMenuWebElement("VIEW ALL SHOES");
		wait(driver,viewAllShoes);
		viewAllShoes.click();
	}
	
	@Then("^Open Sign In Flyout$")
	public void Open_Sign_In_Flyout(){
		Header.openSignInFlyout();
	}
	
	@Then("^Sign In$")
	public void Sign_In(){
		Header.signIn(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	

}
