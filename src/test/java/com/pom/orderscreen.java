package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class orderscreen extends BaseClass {

	public  orderscreen() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="summary_total_label")
	private WebElement amount;
	
	@FindBy(id="finish")
	private WebElement finish;
	
	public WebElement getAmount() {
		return amount;
	}

	public WebElement getFinish() {
		return finish;
	}
}
