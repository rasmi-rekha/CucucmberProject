package com.seleniumcucmber.app.salesforce.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebConnector {
	
	
	Properties OR=null;
	Properties CONFIG=null;
	WebDriver driver=null;
	WebDriver mozilla=null;
	WebDriver chrome=null;
	WebDriver ie=null;
    static WebConnector w;
	
	private WebConnector(){
		if(OR==null){
			
			//Initialize OR
			
			
			try{
				OR=new Properties();
				FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\seleniumcucmber\\app\\salesforce\\config\\OR.properties");
				OR.load(fs);
				//OR.getProperty("testEnv");
				
				CONFIG=new Properties();
				fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\seleniumcucmber\\app\\salesforce\\config\\"+OR.getProperty("testEnv")+"_config.properties");
				CONFIG.load(fs);
				
				System.out.println(OR.getProperty("loginusername"));
				System.out.println(CONFIG.getProperty("loginUrl"));
				
				
			}catch(Exception e){
				
				
				System.out.println("Error on initializing properties files");
			}
		}
		
	}
	
	public void openBrowser(String browserType){
		if (browserType.equals("Mozilla") && mozilla==null){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//driver//geckodriver.exe");
			driver=new FirefoxDriver();
			mozilla=driver;
		}else if (browserType.equals("Mozilla") && mozilla!=null){
			driver=mozilla;
			
		}
		
		else if (browserType.equals("Chrome") && chrome==null){
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chrome//chromedriver.exe");
			
			driver=new ChromeDriver();
			chrome=driver;
		}else if (browserType.equals("Chrome") && chrome!=null){
				driver=chrome;
			}
		else if (browserType.equals("IE")){
			
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
    public void navigate(String URL){
    	
    	driver.get(CONFIG.getProperty(URL));
    	
    }
    
    
	public void click(String ObjectName){
		
      driver.findElement(By.xpath(OR.getProperty(ObjectName))).click();
		
		
	}
	
	public void type(String text,String ObjectName){
		
		driver.findElement(By.xpath(OR.getProperty(ObjectName))).sendKeys(text);
		
	}
	
	public void select(String text,String ObjectName){
		
		driver.findElement(By.xpath(OR.getProperty(ObjectName))).sendKeys(text);
	}
	
	public boolean isElementPresent(String ObjectName){
		
		int count=driver.findElements(By.xpath(OR.getProperty(ObjectName))).size();
		if(count==0)
			return false;
			else
		return true;
		
	}
	
public boolean isLoggedIn(){
		
		if(isElementPresent("searchText"))
			
			return true;
			else
				return false;
		
		

		
}

public void doDefaultLogin(){
	
	navigate("loginUrl");
	type(CONFIG.getProperty("defaultUsername"),"loginusername");
	type(CONFIG.getProperty("defaultPassword"),"loginpassword");
	click("loginButton");
}
	
	//-----------------------Application dependent function--------------------------------------
	//------------------------Singleton----------------------------------//
	
	public static WebConnector getInstance(){
		if(w==null)
             w=new WebConnector();
		return w;
	}
	
	//----------------utility--------------------//
	
	
}
