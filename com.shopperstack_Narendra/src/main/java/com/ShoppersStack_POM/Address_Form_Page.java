package com.shopperstack_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Address_Form_Page {
	
	public Address_Form_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "Office")
	private WebElement radioOfficElement;
	
	@FindBy(id = "Name")
	private WebElement NameInput;
	
	@FindBy(id = "House/Office Info")
	private WebElement HouseOffice;
	
	@FindBy(id = "Street Info")
	private WebElement StreetInfo;
	
	@FindBy(id = "Landmark")
	private WebElement LandMark;
	
	@FindBy(id = "Country")
	private WebElement Country;
	
	@FindBy(id = "State")
	private WebElement State;
	
	@FindBy(id = "City")
	private WebElement City;
	
	
	@FindBy(id = "Pincode")
	private WebElement Pincode;
	
	@FindBy(id = "Phone Number")
	private WebElement PhoneNumber;
	
	@FindBy(id = "addAddress")
	private WebElement Add_Address_Btn;

	public WebElement getRadioOfficElement() {
		return radioOfficElement;
	}

	public WebElement getNameInput() {
		return NameInput;
	}

	public WebElement getHouseOffice() {
		return HouseOffice;
	}

	public WebElement getStreetInfo() {
		return StreetInfo;
	}

	public WebElement getLandMark() {
		return LandMark;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getPincode() {
		return Pincode;
	}

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public WebElement getAdd_Address_Btn() {
		return Add_Address_Btn;
	}
	
	
}
