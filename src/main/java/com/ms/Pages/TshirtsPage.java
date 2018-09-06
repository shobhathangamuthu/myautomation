package com.ms.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.Base.DriverScript;

public class TshirtsPage extends DriverScript{

	@FindBy(xpath=".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")
			private WebElement imgProduct;
	
	@FindBy(xpath=".//*[@id='add_to_cart']/button")
	private WebElement btnAddtoCart;



	public TshirtsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddToCart()
	{
	imgProduct.click();
	btnAddtoCart.click();
	}
	
}
