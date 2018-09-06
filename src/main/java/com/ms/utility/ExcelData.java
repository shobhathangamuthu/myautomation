package com.ms.utility;


import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ms.Base.DriverScript;

public class ExcelData extends DriverScript {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelData(String xlpath)
	{
		try
		{
			File src = new File(xlpath);
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public int getRowCount(int sheetIndex)
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}
	
	public String getData(int sheetNum,int row,int col)
	{
		sheet=wb.getSheetAt(sheetNum);
		String data = sheet.getRow(row).getCell(col).toString();
//		String data = wb.getSheetAt(sheetNum).getRow(row).getCell(col).toString();
		return data;
		
	}
	
		

	
}
