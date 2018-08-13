package com.mk.test;

//import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Harish\\git\\HARMKCucumberPOM\\MKCucumberPOM\\src\\main\\java\\com\\mk\\features\\test1.feature",
		glue= {"com.mk.stepdefinitions"},
		format= {"pretty","html:test-outout"},
		monochrome=true,
		dryRun=false
		)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
