package com.ms.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ms.Base.DriverScript;

public class CasualDressesPage extends DriverScript {

	@FindBy(xpath=".//*[@id='center_column']/ul/li/div/div[1]/div")
	private WebElement imgPrintedDress;
	
	@FindBy(xpath=".//*[@id='add_to_cart']/button")
	private WebElement buttonAddToCart;
	
	@FindBy(xpath=".//*[@id='layer_cart']/div[1]/div[1]/h2")
	private WebElement textSuccessMsgOnAddToCart;
	
	public CasualDressesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean clickOnPrintedDress()
	{
		imgPrintedDress.click();
		driver.switchTo().frame(0);
		buttonAddToCart.click();
		driver.switchTo().defaultContent();
		return textSuccessMsgOnAddToCart.isDisplayed();
		
	}	
	
}
