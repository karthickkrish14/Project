package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseFlight extends BaseClass{
	public ChooseFlight() {
       PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class='btn btn-small'])[2]")
	private WebElement choose;

	public WebElement getChoose() {
		return choose;
	}
	
	

}
