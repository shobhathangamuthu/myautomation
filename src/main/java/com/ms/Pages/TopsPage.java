package com.ms.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ms.Base.DriverScript;

public class TopsPage extends DriverScript{

@FindBy(xpath=".//*[@id='subcategories']/ul/li[1]/h5/a")
private WebElement imgTshirts;

    public TopsPage()
{
	PageFactory.initElements(driver, this);
}

public void clickonTshirts()
{
	imgTshirts.click();
}

}