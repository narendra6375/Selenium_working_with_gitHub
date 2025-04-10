package com.shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_Page {

	public MyAddress_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//button[text()='Add Address']")
	private WebElement Add_Address;
	
	public WebElement getAdd_Address() {
		return Add_Address;
	}

	public WebElement getDelete_btn() {
		return Delete_btn;
	}

	public WebElement getYes_Btn() {
		return Yes_Btn;
	}

	@FindBy(xpath ="//button[@fdprocessedid=\"clp6qj\"]")
	private WebElement Delete_btn;
	
	@FindBy(xpath ="//button[text()='Yes']")
	private WebElement Yes_Btn;
	
}
