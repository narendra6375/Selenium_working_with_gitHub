package com.ShoppersStack_Kishan;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShopperStack_File_Generic_Utility.Base_Test;
import com.ShopperStack_File_Generic_Utility.Webdriver_Utility;
import com.ShopperStack_ShopperStack_POM.Address_Form_Page;
import com.ShopperStack_ShopperStack_POM.Home_page;
import com.ShopperStack_ShopperStack_POM.MyAddress_Page;
import com.ShopperStack_ShopperStack_POM.My_Profile_Page;

public class Test_Case001_Adress extends Base_Test {
	
	@Test	public void add_Address() throws IOException, InterruptedException {
		
		//for home page
		Thread.sleep(2000);
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
		
		//for fillinf address form
		Address_Form_Page  Form1= new Address_Form_Page(driver);
		Form1.getRadioOfficElement().click();
		Form1.getNameInput().sendKeys(fileUtility.Excel_Data_Read("Sheet1", 1, 0));
		Form1.getHouseOffice().sendKeys(fileUtility.Excel_Data_Read("Sheet1", 1, 1));
		Form1.getStreetInfo().sendKeys(fileUtility.Excel_Data_Read("Sheet1", 1, 2));
		Form1.getLandMark().sendKeys(fileUtility.Excel_Data_Read("Sheet1", 1, 3));
		Form1.getPincode().sendKeys(fileUtility.Excel_Data_Read("Sheet1", 1, 4));

		Form1.getCountry().sendKeys(fileUtility.ReadPropertyFile("country"));
		Form1.getState().sendKeys(fileUtility.ReadPropertyFile("state"));
		Form1.getCity().sendKeys(fileUtility.ReadPropertyFile("city"));
		
		Form1.getPhoneNumber().sendKeys(fileUtility.Excel_Data_Read("Sheet1", 1, 5));
		Thread.sleep(2000);
		Form1.getAdd_Address_Btn().click();;

		Thread.sleep(1500);
		Webdriver_Utility webdriver_Utility=  new Webdriver_Utility();
		webdriver_Utility.WebPage_SS(driver);
		
		

		
		
		
		

	}

}
