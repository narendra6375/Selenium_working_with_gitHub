package com.shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTextField;
	
	@FindBy(xpath ="//input[@id='Password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath ="//span[text()='Login']")
	private WebElement login_BtnElement;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLogin_BtnElement() {
		return login_BtnElement;
	}
	
	
}
