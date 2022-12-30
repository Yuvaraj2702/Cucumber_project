package com.adactin.cucumber.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_confirmation {
	
	
	public static WebDriver driver;
	

	@FindBy(xpath = "(//input[@type='text'])[16]")
	private WebElement orderno;
	
	@FindBy(id="logout")
	private WebElement logout;
	
	public Booking_confirmation(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
