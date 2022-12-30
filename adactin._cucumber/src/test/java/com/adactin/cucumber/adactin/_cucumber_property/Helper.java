package com.adactin.cucumber.adactin._cucumber_property;

import java.io.IOException;

public class Helper {
	
	
	
	public Reader getinstanceCR() throws IOException {
		
		Reader r = new Reader();
        return r;
		
	}
	
	
	
	public static Helper getinstance() {
		
		Helper h = new Helper();
		
		return h;
	}
	
	
	
	public Helper() {
		
		
	}
	
	
	

}
