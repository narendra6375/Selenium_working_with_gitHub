package com.shopperstack_TestScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.shopperstack_GenericUtility.Base_Test;
//import com.shopperstack_POM.Home_page;

//import com.shopperstack_GenericUtility.Base_Test;
//import com.shopperstack_POM.MyAddress_Page;
//import com.shopperstack_POM.My_Profile_Page;

//import com.ShopperStack_File_Generic_Utility.Base_Test;
//import com.ShopperStack_ShopperStack_POM.MyAddress_Page;
//import com.ShopperStack_ShopperStack_POM.My_Profile_Page;

public class Address_Delete extends Base_Test {

	@Test
	public void delete_Address() throws InterruptedException {
		Home_page.getAccountSettingElement().click();
		homePage.getMyProfileBtn().click();
		
		Thread.sleep(2000);
		My_Profile_Page my_Profile_Page= new My_Profile_Page(driver);
		my_Profile_Page.getAddressBtnElement().click();
		
		MyAddress_Page myAddress_Page= new MyAddress_Page(driver);
		wait.until(ExpectedConditions.elementToBeClickable(myAddress_Page.getDelete_btn())).click();
		wait.until(ExpectedConditions.elementToBeClickable(myAddress_Page.getYes_Btn())).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		

	}
}
