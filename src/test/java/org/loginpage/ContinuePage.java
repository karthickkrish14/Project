package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class ContinuePage extends BaseClass {
	public ContinuePage() {
     PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id="radiobutton_0"),@FindBy(xpath="//input[@type='radio']")})
	private WebElement select;
	
	@FindAll({@FindBy(id="continue"),@FindBy(xpath="(//input[@class='reg_button'])[1]")})
	private WebElement ctnue;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getCtnue() {
		return ctnue;
	}
	

}

