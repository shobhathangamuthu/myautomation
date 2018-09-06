package com.ms.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.Base.DriverScript;

public class LoginPage extends  DriverScript {
	@FindBy(id="email")
	private WebElement tbEmail;
	
	@FindBy(name="passwd")
	private WebElement tbPassword;
	
	@FindBy(id="SubmitLogin")
	private WebElement signInButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateSignIn()
	{
		tbEmail.sendKeys("dummytest@gmail.com");
		tbPassword.sendKeys("Pass@123");
		signInButton.click();
	}
	
	public void validateSignIn2(String Username, String Password)
	{
		tbEmail.sendKeys(Username);
		tbPassword.sendKeys(Password);
		signInButton.click();
	}
	
}
