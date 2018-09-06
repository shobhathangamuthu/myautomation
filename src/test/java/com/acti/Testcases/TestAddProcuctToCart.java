package com.acti.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ms.Base.DriverScript;
import com.ms.Pages.HomePage;
import com.ms.Pages.TopsPage;
import com.ms.Pages.TshirtsPage;
import com.ms.Pages.WomanDressesPage;

public class TestAddProcuctToCart extends DriverScript{
	
	HomePage hp;
	WomanDressesPage wp;
	TopsPage tp;
	TshirtsPage tsp;
	
	
	public TestAddProcuctToCart()
	{
		super();
	}
	
	@BeforeMethod
	public void preCondition()
	{
		   init();
		 hp = new HomePage();
		 wp = new WomanDressesPage();
		tp = new TopsPage();
	 tsp = new TshirtsPage();
	
	}
	
	@Test
	public void testAddProcuctToCartFunctionality()
	
	{
        
		
		hp.clickonwomenTab();
	
		wp.clickonTopsLink();
	
		tp.clickonTshirts();
		
		tsp.AddToCart();
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
		
	
	
}
