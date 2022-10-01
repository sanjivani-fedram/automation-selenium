package com.redifmail.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasetestRedif {
	
	public static WebDriver driver = null;
	
	public Properties prop = new Properties();
	
	public void initilizaltion() {
		try {
			FileInputStream file = new FileInputStream("./src/main/java/com/redifmail/configration/Config.properties");
		  prop.load(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String BrowserName = prop.getProperty("browser");
		String path = "";
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			 path =prop.getProperty("chromepath");
			 System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();
		
			
		}else if(BrowserName.equalsIgnoreCase("firefox")) {
		 path =prop.getProperty("firefoxpath");
			System.setProperty("webdriver.gecko.driver", path);	
			driver=new FirefoxDriver();
			
	}
		String time = prop.getProperty("timeunit");
		driver.manage().timeouts().implicitlyWait(Long.parseLong(time),TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("baseurl"));
		
	}
	public void teardown() {
		driver.quit();

}
}