package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class Cartscreen extends BaseClass {

	
	public  Cartscreen() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="inventory_item_desc")
	private WebElement desc;
	
	@FindBy(id="checkout")
	private WebElement checkout;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postalcode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement con;
	
	public WebElement getDesc() {
		return desc;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPostalcode() {
		return postalcode;
	}

	public WebElement getCon() {
		return con;
	}
	
}
