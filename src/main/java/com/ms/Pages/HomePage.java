 package com.ms.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.Base.DriverScript;
import com.ms.utility.Helper;

public class HomePage extends DriverScript {
	
	
	//This is created for selenium batch
	@FindBy(xpath=".//*[@id='header_logo']/a/img")
	private WebElement imgLogo;

	@FindBy(linkText="Women")
	private WebElement lnkWomenTab;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement linkDressesTab;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement linkBlousesTab;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement linkTShirtsTab;
	
	@FindBy(id="search_query_top")
	private WebElement SearchTB;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	private WebElement linkSignin; 
	
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public String Verifyhomepagetitle()
	{
	return driver.getTitle();
	}
	public boolean verifyyourLogo()
	{
		Helper.HighLightElement(imgLogo);
		return imgLogo.isDisplayed();
	}
	
	public boolean verifyWomensTab()
	{
		Helper.HighLightElement(lnkWomenTab);
	return lnkWomenTab.isDisplayed();
	}
	
	public boolean verifyDressesTab()
	{
		return linkDressesTab.isDisplayed();
	}
	
	public boolean verifyTShirtsTab()
	{
		return linkTShirtsTab.isDisplayed();
		
	}	
	
	public String validateWomenTab()
	{
		Actions action = new Actions(driver);
		action.moveToElement(lnkWomenTab).perform();
		action.moveToElement(linkBlousesTab).perform();
		return linkBlousesTab.getAttribute("title");
	}
	
	
	public void clickonSignin()
	{
		linkSignin.click();
	}
	
	public boolean verifySearchBox()
	{
		return SearchTB.isDisplayed();
	}
	
	public void clickonwomenTab()
	{
		lnkWomenTab.click();
	}
	
	
}














