package com.adactin.cucumber.adactin._cucumber_property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reader {
	
	public static Properties p;
	
	public Reader() throws IOException {
		
		File f = new File("C:\\Users\\rajuv\\eclipse-workspace\\adactin._cucumber\\info.properties");
		
		FileInputStream fi = new FileInputStream(f);
		
		 p = new Properties();
		
		p.load(fi);
		
				
	}

	public String getbrowser() {
		
		String  browser = p.getProperty("browser");
		
         return browser;
	}
	
	
	public String geturl() {
        
		String url = p.getProperty("url");
		
		return url;
	}
	
	
	public String getcardnumber() {
		
		String cardnumber = p.getProperty("cardnumber");
		
		return cardnumber;
	
		
	}
	
	
	public String getcvv() {
		
		String cvv = p.getProperty("cvv");
		
		return cvv;

		
	}
	
	
	
	
	
	
	
}
