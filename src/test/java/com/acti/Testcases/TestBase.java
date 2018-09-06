package com.acti.Testcases;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import com.ms.Base.DriverScript;
import com.ms.Pages.CasualDressesPage;
import com.ms.Pages.DressesPage;
import com.ms.Pages.HomePage;
import com.ms.Pages.LoginPage;
import com.ms.utility.Helper;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class TestBase extends DriverScript {

public static ExtentReports report;
public static ExtentTest testlog;

	HomePage mshp;
	DressesPage msdp;
	 CasualDressesPage mscdp;
	 LoginPage mslp;
	
	 public TestBase()
	 {
		 super();
	 }
	
	 @BeforeMethod
	public void precondition()
	{
		
         report=new ExtentReports("C:\\FrameWork\\com.mystore.automation\\actiReports\\automation.html",false);
		 init();
	     mshp = new HomePage();
	     msdp = new DressesPage();
	     mscdp = new CasualDressesPage();
	     mslp = new LoginPage();
	     
	     
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE)
		{
			String path=Helper.getScreenshot(result.getName());
			testlog.log(LogStatus.FAIL, testlog.addScreenCapture(path));
			testlog.log(LogStatus.FAIL, result.getThrowable());
		}
		report.endTest(testlog);
		report.flush();
		driver.close();
		
		
	}
	
}
