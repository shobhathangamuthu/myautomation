
package com.acti.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.ms.Base.DriverScript;
import com.ms.Pages.HomePage;
import com.relevantcodes.extentreports.LogStatus;

public class TestHomePage extends TestBase{

	
	@Test(priority=1)
	public void testverifyHomepageElements()
	{
		testlog=report.startTest("Verifying HomePage Elements");
		String title = mshp.Verifyhomepagetitle();
		Assert.assertEquals(title,"My Store","title");
		testlog.log(LogStatus.PASS,"Home Page Title Verified");
		Assert.assertTrue(mshp.verifyyourLogo());
		testlog.log(LogStatus.PASS,"Logo Page is Verified");
		Assert.assertTrue(mshp.verifyWomensTab());
		Assert.assertTrue(mshp.verifyDressesTab());
		Assert.assertTrue(mshp.verifyTShirtsTab());
	}
	
	
	//@Test(priority=2)
	public void testValidateWomensTab()
	{
	String title=mshp.validateWomenTab();
	Assert.assertEquals("Women", title);
		
	}
	
	
}

