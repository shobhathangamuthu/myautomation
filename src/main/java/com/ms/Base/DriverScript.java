package com.ms.Base;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class DriverScript {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public static ExtentReports report;
	public static ExtentTest testlog;

	
	
	public DriverScript()
	{
		try
		{
			prop = new Properties();
			fis = new FileInputStream("./actiConfiguration/config.properties");
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("No File Found "+e.getMessage());
		}
	}
	
	public void init()
	{
		String browser = prop.getProperty("Browser");
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./actiBrowserExe/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("QAURL"));
	}

}
