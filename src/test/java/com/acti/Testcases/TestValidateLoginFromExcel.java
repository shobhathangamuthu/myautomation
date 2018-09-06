package com.acti.Testcases;

import org.testng.annotations.Test;

import com.ms.utility.ExcelData;

import org.testng.annotations.DataProvider;




public class TestValidateLoginFromExcel extends TestBase {


	@Test(dataProvider="MSLogin")
	public void testLoginFunctioanlity(String Username, String Password)
	{
		mshp.clickonSignin();
		mslp.validateSignIn2(Username, Password);
	}
	
	
	
	@DataProvider(name="MSLogin")
	public Object[][] loginData()
	{
 ExcelData excelData = new ExcelData("./actiTestData/testdata.xlsx");
		int rows = excelData.getRowCount(0);
		
		Object[][] data = new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			data[i][0]=excelData.getData(0, i, 0);
			data[i][1]=excelData.getData(0, i, 1);
		}
		
		return data;
		
	}
}
