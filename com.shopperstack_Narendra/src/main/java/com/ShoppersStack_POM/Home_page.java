package com.shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[contains(@class,'BaseBadge-badge MuiBadge-badge')]")
	private WebElement accountSettingElement;
	
	@FindBy(xpath ="//li[text()=\"My Profile\"]")
	private WebElement myProfileBtn;
	
	@FindBy(xpath ="//li[text()=\"Logout\"]")
	private WebElement LogoutBtn;

	public WebElement getAccountSettingElement() {
		return accountSettingElement;
	}

	public WebElement getMyProfileBtn() {
		return myProfileBtn;
	}

	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}
	
	
}
