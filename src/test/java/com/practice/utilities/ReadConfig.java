package com.practice.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadConfig {
	
	Properties pro;
	
	File src = new File("./Configurations/config.properties");
	
	public ReadConfig() {
		try {
		FileInputStream fis= new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);

	}
	catch(Exception e) {
		System.out.println("Exception" + e.getMessage());
	}
	
  }	

	public String getUrl() {
		String url=pro.getProperty("baseURL");
		return url;
				
	}
	
	public String getEmail() {
		String em=pro.getProperty("email");
		return em;
}
	
	public String getPass() {
		String ps= pro.getProperty("password");
		return ps;
	}
	
	public String getChromePath() {
		String cpath= pro.getProperty("chromePath");
		return cpath;
	}
	
	public String getFirefoxPath() {
		String fpath= pro.getProperty("firefoxPath");
		return fpath;
}
}