package com.mk.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mk.pages.Header;
import com.mk.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class test1 extends TestBase {
	
	@Given("^user is in Main Page$")
	public void user_is_in_Main_Page(){
		TestBase.Initialization();
		sleep(1000);
		WebElement clsBtn = driver.findElement(By.xpath("//div[@class='korsvip-signUp-sub-wrapper']//div//button[@id='closekorsvipsignUpModel']"));
		clsBtn.click();
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
	
	

}