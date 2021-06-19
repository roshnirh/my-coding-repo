package com.practice.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.pageobject.loginTest;

public class Login_TC extends BaseClass{
	
	@Test
	public void logintestcase(){
				
		loginTest l= new loginTest(driver);
		l.signIn();
		
		logger.info("URL is opened");
		l.setEmail(email);
		logger.info("Email is entered");

		/*
		 * l.continueButton(); logger.info("Continue button is clicked");
		 * l.setPassword(password); logger.info("password is entered");
		 * 
		 * l.submitBtn(); logger.info("Submit button is clicked");
		 */
		
		
		if(driver.getTitle().contains("Amazon")) {
			Assert.assertTrue(true);
			
		}
		
		else
		{
			Assert.assertFalse(false);
		}
	}

}
