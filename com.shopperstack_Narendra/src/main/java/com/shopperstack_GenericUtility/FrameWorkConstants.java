package com.shopperstack_GenericUtility;


public interface FrameWorkConstants {

	Java_Utility javaUtility= new Java_Utility();
	
	final static String Excel_File_Path="./src/test/resources/Test_data/ShopperExcel.xlsx";
	
	final static String Property_File_Path ="./src/test/resources/Test_data/ShopStackProp.properties";
	
	final static String screenshotPath = "./Take_ScreenShot/" + javaUtility.Current_Date_Time() + ".png";
	
	final static String Reports_Path ="./Reports/"+javaUtility.Current_Date_Time()+".html";
	

	
	final static String ChromeKey="webdriver.chrome.driver";
	
	final static String ChromeValue="./src/main/resources/driver/chromedriver.exe";


}
