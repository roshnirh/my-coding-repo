package com.practice.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginTest {
	
	WebDriver driver;
	
	public loginTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	@CacheLookup
	WebElement signIn;
	
	@FindBy(id="ap_email")
	@CacheLookup
	WebElement email;
	
	@FindBy(id="continue")
	@CacheLookup
	WebElement continueBtn;
	
	@FindBy(id="ap_password")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="signInSubmit")
	@CacheLookup
	WebElement submit;
	
	
	public void signIn() {
		signIn.click();
	}

	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void continueButton() {
		continueBtn.click();
	}
	
	public void setPassword(String password1) {
		password.sendKeys(password1);
	}
	
	public void submitBtn() {
		submit.click();
	}
	
	
}
