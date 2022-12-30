package com.adactin.cucumber.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SDPPOM {
	
	
	public static WebDriver driver;
	
	Loginpage l;
	Searchhotel s;
	Select_hotel sh;
	Book_a_hotel bh;
	Booking_confirmation bc;
	
	
	
	
	
	public SDPPOM(WebDriver driver2) {
		
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	}

	public  Loginpage getloginpage() {
		
		 l = new Loginpage(driver);
		return l;

	}
	
    public Searchhotel getsearchhotel() {

    	 s = new Searchhotel(driver);
    	
    	return s;
	}
	
	public Select_hotel getselecthotel() {
		
		 sh = new Select_hotel(driver);
		
		return sh;
		

	}
	
	
	public Book_a_hotel getbookahotel() {
		
		 bh = new Book_a_hotel(driver);
		
		return bh;

	}
	
	
	public Booking_confirmation getbookingconfirmation() {
		
		 bc = new Booking_confirmation(driver);
		
		 return bc;

	}
	
	
	
	
	
	
	
	
	

}
