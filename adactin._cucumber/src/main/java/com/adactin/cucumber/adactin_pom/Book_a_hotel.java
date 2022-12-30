package com.adactin.cucumber.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_a_hotel {
	
	
	public static WebDriver driver;
	

	@FindBy(name = "first_name")
	private WebElement firstname;
	
	
	@FindBy(name = "last_name")
    private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(name = "cc_num")
	private WebElement creditnumber;
	
	@FindBy(id = "cc_type")
	private WebElement cctype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expyear;
	
	@FindBy(name  = "cc_cvv")
	private WebElement cvvno;
	
	@FindBy(id = "book_now")
	private WebElement book;
	
	public Book_a_hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);

	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditnumber() {
		return creditnumber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBook() {
		return book;
	}

	
	
	
	
	
	
	
	
	
	
}
