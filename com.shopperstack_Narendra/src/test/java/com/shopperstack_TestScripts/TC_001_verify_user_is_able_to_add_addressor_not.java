package com.shopperstack_TestScripts;

import org.testng.annotations.Test;

//import com.shopperstack_POM.My_profile_page;

public class TC_001_verify_user_is_able_to_add_addressor_not {
    
	@Test
	public void addAddress() {
		homePage.getAccountSettingsBtn().click();
		homePage.getProfileBtn().click();
		
		My_profile_page myProfilePage =new My_profile_page(driver);
		Thread.sleep(2000);
		MyAdresses_Page  myAddressesPage = new MyAddresses_Page(driver);
		myAddressesPage.getAddressBtn().click();
		
		AddressForm_Page addressFormPage = new AddressForm_Page(driver);
		addressFormPage.getOfficeRadioButton().click();
		addressFormPage.getNameTextField().sendKeys(file_Utility.readDataFromExcelFile("Sheet1",1,0));
		addressFormPage.getHouseTextFiel().sendKeys(file_Utility.readDataFromExcelFile("Sheet1",1,1));
		addressFormPage.getStreetTextField().sendKeys(file_Utility.readDataFromExcelFile("Sheet1",1,2));
		addressFormPage.getLandmarkTextField().sendKeys(file_Utility.readDataFromExcelFile("Sheet1",1,3));
		
		webdriver_Utility.selectByValue(addressFormPage.getCountryDropDown),file_Utility.readDataFromPropertyFile("country");
		webdriver_Utility.selectByValue(addressFormPage.getStateDropDown),file_Utility.readDataFromPropertyFile("state");
		webdriver_Utility.selectByValue(addressFormPage.getCityDropDown),file_Utility.readDataFromPropertyFile("city");
		
		addressFormPage.getPincodeTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1",1,4));
		addressFormPage.getPhoneNumberTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1",1,5));
		addressFormPage.getAddAddressBtn().click();
		
		myAddressPage.getCloseBtn().click();
		
		webDriverUtility.getWebPageScreenshot(driver);
		
		
	}

	
	
}
