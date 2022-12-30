package com.adactin_base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	
	public static WebDriver driver;

	
	
	//sendkeys
	public static void inputvalue(WebElement element, String value) {
		
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//click
	public static void clickonElement(WebElement element) {
      
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	//browser launch
	public static WebDriver browserlaunch(String value) {
		
		try {
			if (value.equalsIgnoreCase(value)) {

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajuv\\eclipse-workspace\\adactin._cucumber\\Driver\\chromedriver.exe");
				
				 driver = new ChromeDriver();
				
			} else {

				System.out.println("invalid browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
		
	}
	
	
	//url
	 public static  void url(String value) {
		 
		 try {
			driver.get(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	//get title
	public static void gettitle() {
		try {
			String title = driver.getTitle();
			System.out.println(title);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//quit
	public static void quit() {
		
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//close
	public static void close() {
		
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//navigate to
	public static void navigateto(String value) {
		
		driver.navigate().to(value);

	}
	
	//navigate back
	public static void navigateback() {
		
		driver.navigate().back();

	}
	//refresh
	public static void refresh() {
		
		driver.navigate().refresh();

	}
	
	//get text
	public static void gettext(WebElement element) {
		
		System.out.println(element.getText());

	}
	
	
	//Screenshot
	public static void screenshot() throws IOException {
		
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    
	    File destination = new File("C:\\Users\\rajuv\\eclipse-workspace\\adactin._cucumber\\screenshots\\signup.png");
	    
	    FileUtils.copyFile(source, destination);
	   		

	}
	
	//impilicit wait
	
	
	public static void implicitwait() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	//scroll
	
	public static void scroll() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scroll(0,800)", null);
	
	}
	
//scrolldown
	
	
	public static void scrolldown() {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.scroll(0,document.body.scrollheight)", null);
	
	}
	
	
          public static void getattribute(WebElement element) {
        	  
        	  String attribute = element.getAttribute("value");
        	  
        	  System.out.println(attribute);
        	  

		}
     
	
	
	
	
	
	
	
	
	
	
	
	
	
	//dropdown
	
	public static void dropdown(WebElement element, String value, String i) {
		
		Select s = new Select(element);
		
		if (value.equals("index")) {
			
			s.selectByIndex(Integer.parseInt(i));
			
		}
		
		else if (value.equals("value")) {
			
			s.selectByValue(value);
			
		}

		else if (value.equals("visible text")) {
			
			
			s.selectByVisibleText(value);
		}
		
	}
	
	
	       public static void index(WebElement element, int i) {
	    	   
	    	   Select s = new Select(element);
	    	   
	    	   s.selectByIndex(i);

		}
	       
	       public static  void value(WebElement element, String value) {
	    	   
	    	   Select s = new Select(element);
	    	   
	    	   s.selectByValue(value);
	    	   

		}
	
	       
	       public static void visibletext(WebElement element, String value) {
	    	   
	    	   Select s = new Select(element);
	    	   s.selectByVisibleText(value);

		}
	
}
