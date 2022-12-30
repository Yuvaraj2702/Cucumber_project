package stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.cucumber.adactin._cucumber_property.Helper;
import com.adactin.cucumber.adactin_pom.SDPPOM;
import com.adactin_base.Baseclass;
import com.cucumber.adactin.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stefdef extends Baseclass {
	
	public static WebDriver driver = Test_Runner.driver;
	
	SDPPOM sp =  new SDPPOM(driver);

	@Given("^User Launch The Adactin Url$")
	public void user_Launch_The_Adactin_Url() throws Throwable {
		
		String url = Helper.getinstance().getinstanceCR().geturl();
		 url(url);
		 implicitwait();
	    
	}

	@When("^User Enters The Username In Username Field$")
	public void user_Enters_The_Username_In_Username_Field() throws Throwable {
		
		inputvalue(sp.getloginpage().getUsername(), "Yuvikane");
	    
	    
	}

	@When("^User Enters The Password In Password Field$")
	public void user_Enters_The_Password_In_Password_Field() throws Throwable {
	   inputvalue(sp.getloginpage().getPassword(), "9MYH30");
	    
	}

	@Then("^User Clicks Loginbtn And It Navigates To Search Hotel Page$")
	public void user_Clicks_Loginbtn_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		clickonElement(sp.getloginpage().getLgn());
		implicitwait();
	   
	    
	}
	
	@When("^User Select The Location in Location Field$")
	public void user_Select_The_Location_in_Location_Field() throws Throwable {
	   index(sp.getsearchhotel().getLocation(), 4);
	    
	}

	@When("^User Select The Hotel In Hotel Field$")
	public void user_Select_The_Hotel_In_Hotel_Field() throws Throwable {
		 index(sp.getsearchhotel().getHotels(), 3);
	    
	}

	@When("^User Select The Room Type In Room Type Field$")
	public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {
		value(sp.getsearchhotel().getRoomtype(), "Deluxe");
	    
	}

	@When("^User Select The No Of Rooms In No Of Rooms Field$")
	public void user_Select_The_No_Of_Rooms_In_No_Of_Rooms_Field() throws Throwable {
		value(sp.getsearchhotel().getNoofrooms(), "8");
	    
	}

	@When("^User Select The Check-In Date In Check-In Date Field$")
	public void user_Select_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		inputvalue(sp.getsearchhotel().getCheckindate(), "24/12/2022");
	    
	}

	@When("^User Select The Check-Out Date In Check-Out Date Field$")
	public void user_Select_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		inputvalue(sp.getsearchhotel().getCheckoutdate(), "26/12/2022");
	    
	}

	@When("^User Select The Adults Per Room In Adults Per Room Field$")
	public void user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Field() throws Throwable {
		visibletext(sp.getsearchhotel().getAdults(), "4 - Four");
	    
	}

	@When("^User Select The Childrens Per Room In Childrens Per Room Field$")
	public void user_Select_The_Childrens_Per_Room_In_Childrens_Per_Room_Field() throws Throwable {
		visibletext(sp.getsearchhotel().getChild(), "1 - One");
	    
	}

	@Then("^User Clicks The Searchbtn And It Navigates To Select Hotel Page$")
	public void user_Clicks_The_Searchbtn_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		clickonElement(sp.getsearchhotel().getSearch());
		implicitwait();
	    
	}

	@When("^User Clicks The Selectbtn$")
	public void user_Clicks_The_Selectbtn() throws Throwable {
		clickonElement(sp.getselecthotel().getSelect());
	    
	}

	@Then("^User Clicks The Continuebtn And it Navigates to Book A Hotel Page$")
	public void user_Clicks_The_Continuebtn_And_it_Navigates_to_Book_A_Hotel_Page() throws Throwable {
		clickonElement(sp.getselecthotel().getClick());
		implicitwait();
	    
	}

	@When("^User Enters The Firstname In Firstname Field$")
	public void user_Enters_The_Firstname_In_Firstname_Field() throws Throwable {
		inputvalue(sp.getbookahotel().getFirstname(), "messi");
	    
	}

	@When("^User Enters The Lastname In Lastname Field$")
	public void user_Enters_The_Lastname_In_Lastname_Field() throws Throwable {
		inputvalue(sp.getbookahotel().getLastname(), "alvarez");
	    
	}

	@When("^User Enters The Address In Billing Address Field$")
	public void user_Enters_The_Address_In_Billing_Address_Field() throws Throwable {
		inputvalue(sp.getbookahotel().getAddress(), "No 25 IHFD nagar pallavaram");
	    
	}

	@When("^User Enters The Card Number In  Credit Card Number Field$")
	public void user_Enters_The_Card_Number_In_Credit_Card_Number_Field() throws Throwable {
	 String cardno = Helper.getinstance().getinstanceCR().getcardnumber();
	 inputvalue(sp.getbookahotel().getCreditnumber(), cardno);
	 
	}
	@When("^User Select The Card Type In Credit Card Type Field$")
	public void user_Select_The_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
		index(sp.getbookahotel().getCctype(), 2);
	    
	}

	@When("^User Select The Month Expiry Date Field$")
	public void user_Select_The_Month_Expiry_Date_Field() throws Throwable {
		value(sp.getbookahotel().getExpmonth(), "12");
	    
	}

	@When("^User Select The Year In Expiry Date Field$")
	public void user_Select_The_Year_In_Expiry_Date_Field() throws Throwable {
		visibletext(sp.getbookahotel().getExpyear(), "2022");
	    
	}

	@When("^User Enters The Cvv Number In  Cvv Number Field$")
	public void user_Enters_The_Cvv_Number_In_Cvv_Number_Field() throws Throwable {
		String cvv = Helper.getinstance().getinstanceCR().getcvv();
		   inputvalue(sp.getbookahotel().getCvvno(), cvv);
	    
	}

	@Then("^User Clicks The Booknowbtn And It Navigates To Booking Confimation Page$")
	public void user_Clicks_The_Booknowbtn_And_It_Navigates_To_Booking_Confimation_Page() throws Throwable {
		clickonElement(sp.getbookahotel().getBook());
		implicitwait();
	    
	}

	@When("^User Get The Order No in Order No Field$")
	public void user_Get_The_Order_No_in_Order_No_Field() throws Throwable {
		getattribute(sp.getbookingconfirmation().getOrderno());
		implicitwait();
	    
	}

	@When("^User Get The Screen Shot Of Booking Confirmation Page$")
	public void user_Get_The_Screen_Shot_Of_Booking_Confirmation_Page() throws Throwable {
	   screenshot();
	    
	}

	@Then("^User Clicks The Logoutbtn$")
	public void user_Clicks_The_Logoutbtn() throws Throwable {
		clickonElement(sp.getbookingconfirmation().getLogout());
	    
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
