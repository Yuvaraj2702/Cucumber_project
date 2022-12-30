package com.adactin.cucumber.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {

	

	public static WebDriver driver;
	
	
	@FindBy(id = "radiobutton_0")
	private WebElement select;
	
	@FindBy(name = "continue")
	private WebElement click;
	
	
	public Select_hotel(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);

	
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getClick() {
		return click;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
