package com.cucumber.adactin;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.cucumber.adactin._cucumber_property.Helper;
import com.adactin_base.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
  features = "C:\\Users\\rajuv\\eclipse-workspace\\adactin._cucumber\\Features\\adactin.feature",
  glue = "stepdefinition.Stefdef"

        )




public class Test_Runner {
	
	public static WebDriver driver;
	
	public static void setup() throws IOException  {
		
		
		String browser = Helper.getinstance().getinstanceCR().getbrowser();
		
	     driver = Baseclass.browserlaunch(browser);

				
	}
	
	
	
	
	public static void teardown() {
		
		driver.close();
		

	}
	
	
	
	
	
	
	
	
	
	

}
