package com.practice.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.practice.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig rc= new ReadConfig();
	
	public String baseURL=rc.getUrl();
	public String email=rc.getEmail();
	public String password=rc.getPass();
	public String chromePath= rc.getChromePath();

	public  WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		logger=Logger.getLogger("Login_TC");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",rc.getFirefoxPath());
			driver=new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.get(baseURL);
	}
	
	@AfterClass
	public void tierDown() { 
		driver.quit();
	}

}
