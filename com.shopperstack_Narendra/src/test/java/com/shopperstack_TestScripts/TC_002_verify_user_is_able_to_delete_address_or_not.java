package com.shopperstack_TestScripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.shopperstack_POM.My_profile_page;
import com.shopperstack_POM.homePage;

public class TC_002_verify_user_is_able_to_delete_address_or_not {

	@Test
	public void deleteAddress() {
		
		homePage.getAccountSettingsBtn().click();
		homePage.getMyProfileBtn().click();
		
		My_profile_page myProfilePage = new My_profile_page(driver);
		myProfilePage.getMyAddressBtn().click();
		
		MyAddresses_Page myAddressesPage = new MyAddresses_page(driver);
		wait.until(ExpectedConditions.elementToBeClickable(myAddressPage.getDeleteBtn()));
		wait.until(ExpectedConditions.elementToBeClickable(myAddressPage.getYesBtn()));
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		webDriverUtility.getWebPageScreenshot(driver);
		
		
	}
}
