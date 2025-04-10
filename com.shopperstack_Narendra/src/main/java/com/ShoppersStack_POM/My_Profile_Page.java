package com.shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Profile_Page {

	public My_Profile_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[text()='My Addresses']")
	private WebElement addressBtnElement;

	public  WebElement getAddressBtnElement() {
		return addressBtnElement;
	}
	
	
}
