package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	public Login() {

		PageFactory.initElements(driver, this);
	}
		
	
	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(name="password")
	private WebElement txtPassWord;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement btnClick;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}



}



