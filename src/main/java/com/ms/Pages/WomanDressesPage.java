package com.ms.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.Base.DriverScript;

public class WomanDressesPage extends DriverScript{
	
	@FindBy(xpath=".//*[@id='categories_block_left']/div/ul/li[1]/a")
    private WebElement linkTops;
	
	public WomanDressesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonTopsLink()
	{
		linkTops.click();
	}
	
	
	
}
