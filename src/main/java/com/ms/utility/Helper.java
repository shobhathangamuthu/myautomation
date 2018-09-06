package com.ms.utility;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.ms.Base.DriverScript;

public class Helper extends DriverScript {
 
	public static String getScreenshot(String screenName)
	{
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  String dest="C:\\FrameWork\\com.mystore.automation\\MSScreenShot\\"+screenName+System.currentTimeMillis()+".png()";
	
	try {
		FileUtils.copyFile(src, new File(dest));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return dest;
	}
	public static void HighLightElement(WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",ele);
	}
	
	
	
	
	
	
}
