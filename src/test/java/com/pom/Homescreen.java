package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class Homescreen extends BaseClass{
	
	public Homescreen() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement burgermenu;
	
	@FindBy(xpath="//button[@id='react-burger-cross-btn']")
	private WebElement close;
	
	@FindBy(className="product_sort_container")
	private WebElement dropdown;
    
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement addtocart;
	
	@FindAll({@FindBy(className="shopping_cart_link"),@FindBy(id="shopping_cart_container")})
	private WebElement cart;
	
	public WebElement getBurgermenu() {
		return burgermenu;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCart() {
		return cart;
	}
}
