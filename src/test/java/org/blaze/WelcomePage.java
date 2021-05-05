package org.blaze;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BaseClass {
	
	public WelcomePage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindAll({@FindBy(name="fromPort"),@FindBy(xpath="(//select[@class='form-inline'])[1]")})
	private WebElement depcity;
	
	@FindAll({@FindBy(name="toPort"),@FindBy(xpath="(//select[@class='form-inline'])[2]")})
	private WebElement descity;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement findflight;

	public WebElement getDepcity() {
		return depcity;
	}

	public WebElement getDescity() {
		return descity;
	}

	public WebElement getFindflight() {
		return findflight;
	}
	
	
	
	
	

}
