Feature: Hotel Booking Apllication In Adactin Website

Scenario: Login Page

Given User Launch The Adactin Url
When User Enters The Username In Username Field
And User Enters The Password In Password Field
Then User Clicks Loginbtn And It Navigates To Search Hotel Page

Scenario: Search Hotel

When User Select The Location in Location Field
And  User Select The Hotel In Hotel Field
And  User Select The Room Type In Room Type Field
And  User Select The No Of Rooms In No Of Rooms Field
And  User Select The Check-In Date In Check-In Date Field  
And  User Select The Check-Out Date In Check-Out Date Field
And  User Select The Adults Per Room In Adults Per Room Field
And  User Select The Childrens Per Room In Childrens Per Room Field
Then User Clicks The Searchbtn And It Navigates To Select Hotel Page

Scenario: Select Hotel

When User Clicks The Selectbtn
Then User Clicks The Continuebtn And it Navigates to Book A Hotel Page

Scenario: Book A Hotel

When User Enters The Firstname In Firstname Field 
And  User Enters The Lastname In Lastname Field 
And  User Enters The Address In Billing Address Field
And  User Enters The Card Number In  Credit Card Number Field 
And  User Select The Card Type In Credit Card Type Field 
And  User Select The Month Expiry Date Field 
And  User Select The Year In Expiry Date Field 
And  User Enters The Cvv Number In  Cvv Number Field
Then User Clicks The Booknowbtn And It Navigates To Booking Confimation Page

Scenario: Booking Confirmation
When User Get The Order No in Order No Field
And User Get The Screen Shot Of Booking Confirmation Page
Then User Clicks The Logoutbtn 
