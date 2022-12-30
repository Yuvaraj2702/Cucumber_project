package com.adactin.cucumber.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {
	
	
	public static WebDriver driver;
	

	@FindBy(name = "location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement Noofrooms;
	
	@FindBy(name = "datepick_in")
	private WebElement checkindate;
	
	@FindBy(name = "datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(id = "adult_room")
	private WebElement adults;
	
	@FindBy (id = "child_room")
	private WebElement child;
	
	@FindBy(name = "Submit")
	private WebElement search;
	

	public Searchhotel(WebDriver driver2) {
      this.driver=driver2;
      PageFactory.initElements(driver2, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return Noofrooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	
	

}
