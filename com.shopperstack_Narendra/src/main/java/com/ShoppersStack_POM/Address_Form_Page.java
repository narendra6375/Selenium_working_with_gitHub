package com.ShoppersStack_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Address_Form_Page {
	
	public void AddressForm_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Office")
	private WebElement officeRadioButton;

	@FindBy(id = "Name")
	private WebElement nameTextField;

	@FindBy(id = "House/Office Info")
	private WebElement houseTextField;

	@FindBy(id = "Street Info")
	private WebElement streetTextField;

	@FindBy(id = "Landmark")
	private WebElement landmarkTextField;

	@FindBy(id = "Country")
	private WebElement countryDropDown;

	@FindBy(id = "State")
	private WebElement stateDropDown;

	@FindBy(id = "City")
	private WebElement cityDropDown;

	@FindBy(id = "Pincode")
	private WebElement pincodeTextField;

	@FindBy(id = "Phone Number")
	private WebElement phoneNumberTextField;

	@FindBy(id = "addAddress")
	private WebElement addAddressBtn;

	public WebElement getOfficeRadioButton() {
		return officeRadioButton;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseTextField() {
		return houseTextField;
	}

	public WebElement getStreetTextField() {
		return streetTextField;
	}

	public WebElement getLandmarkTextField() {
		return landmarkTextField;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}

}
