package com.shopperstack_TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.shopperstack_GenericUtility.Base_Test;
import com.shopperstack_GenericUtility.File_Utility;
import com.shopperstack_GenericUtility.Webdriver_Utility;
import com.shopperstack_POM.Address_Form_Page;
import com.shopperstack_POM.Home_page;
import com.shopperstack_POM.MyAddress_Page;
import com.shopperstack_POM.My_Profile_Page;

//import com.ShopperStack_File_Generic_Utility.Base_Test;
//import com.ShopperStack_File_Generic_Utility.Webdriver_Utility;
//import com.ShopperStack_ShopperStack_POM.Address_Form_Page;
//import com.ShopperStack_ShopperStack_POM.Home_page;
//import com.ShopperStack_ShopperStack_POM.MyAddress_Page;
//import com.ShopperStack_ShopperStack_POM.My_Profile_Page;

public class Test_Case001_Adress extends Base_Test{
	
	@Test	public void add_Address() throws IOException, InterruptedException {
		
//for home page
		Thread.sleep(2000);
		WebDriver driver;
		Home_page hPage= new Home_page(driver);
		hPage.getAccountSettingElement().click();
		hPage.getMyProfileBtn().click();
		Thread.sleep(2000);
		
//for clicking on myadress
		My_Profile_Page my_Profile= new My_Profile_Page(driver);
		my_Profile.getAddressBtnElement().click();
		
		
		MyAddress_Page address_Page= new MyAddress_Page(driver);
		address_Page.getAdd_Address().click();
		Thread.sleep(1000);
		
//for filling address form
		Address_Form_Page  Form1= new Address_Form_Page(driver);
		Form1.getRadioOfficElement().click();
		Form1.getNameInput().sendKeys(File_Utility.Excel_Data_Read("Sheet1", 1, 0));
		Form1.getHouseOffice().sendKeys(File_Utility.Excel_Data_Read("Sheet1", 1, 1));
		Form1.getStreetInfo().sendKeys(File_Utility.Excel_Data_Read("Sheet1", 1, 2));
		Form1.getLandMark().sendKeys(File_Utility.Excel_Data_Read("Sheet1", 1, 3));
		Form1.getPincode().sendKeys(File_Utility.Excel_Data_Read("Sheet1", 1, 4));

		Form1.getCountry().sendKeys(File_Utility.ReadPropertyFile("country"));
		Form1.getState().sendKeys(File_Utility.ReadPropertyFile("state"));
		Form1.getCity().sendKeys(File_Utility.ReadPropertyFile("city"));
		
		Form1.getPhoneNumber().sendKeys(File_Utility.Excel_Data_Read("Sheet1", 1, 5));
		Thread.sleep(2000);
		Form1.getAdd_Address_Btn().click();

		Thread.sleep(1500);
		Webdriver_Utility webdriver_Utility=  new Webdriver_Utility();
		webdriver_Utility.WebPage_SS(driver);
		
		
	}

}
