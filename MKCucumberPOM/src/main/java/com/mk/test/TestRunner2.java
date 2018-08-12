package com.mk.test;

import org.testng.annotations.Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Harish\\git\\HARMKCucumberPOM\\MKCucumberPOM\\src\\main\\java\\com\\mk\\features\\test2.feature",
		glue= {"com.mk.stepdefinitions"},
		format= {"pretty","html:test-outout"},
		monochrome=true,
		dryRun=false
		)

@Test
public class TestRunner2 extends AbstractTestNGCucumberTests {

}
