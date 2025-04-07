package com.shopperstack_GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {
	
	public static String ReadPropertyFile(String key) throws IOException {
		FileInputStream fis= new FileInputStream(FrameWorkConstants.Property_File_Path);
		Properties pro= new Properties();
		pro.load(fis);
		String valueString = pro.getProperty(key);
		return valueString;
	}

	
	public static String Excel_Data_Read(String sheetName , int row, int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(FrameWorkConstants.Excel_File_Path);
		Workbook wbWorkbook= WorkbookFactory.create(fis);
		Sheet S1=wbWorkbook.getSheet(sheetName);
		String valueString=  S1.getRow(row).getCell(cellnum).getStringCellValue();
		return valueString;
		
	}
}
