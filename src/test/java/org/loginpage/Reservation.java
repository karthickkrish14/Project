package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reservation extends BaseClass{
	public Reservation() {
        PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id="inputName"),@FindBy(xpath="//input[@placeholder='First Last']")})
	private WebElement firstname;
	
	@FindAll({@FindBy(id="address"),@FindBy(xpath="//input[@placeholder='123 Main St.']")})
	private WebElement address;
	
	@FindAll({@FindBy(id="city"),@FindBy(xpath="//input[@placeholder='Anytown']")})
	private WebElement city;
	
	@FindAll({@FindBy(id="state"),@FindBy(xpath="//input[@placeholder='State']")})
	private WebElement state;
	
	@FindAll({@FindBy(id="zipCode"),@FindBy(xpath="//input[@placeholder='12345']")})
	private WebElement zipcode;
	
	@FindAll({@FindBy(id="cardType"),@FindBy(xpath="//select[@class='form-inline']")})
	private WebElement cardtype;
	
	@FindAll({@FindBy(id="creditCardNumber"),@FindBy(xpath="//input[@placeholder='Credit Card Number']")})
	private WebElement cardnumber;
	
	@FindAll({@FindBy(id="creditCardMonth"),@FindBy(xpath=("//input[@placeholder='Month']"))})
	private WebElement cardmonth;
	
	@FindAll({@FindBy(id="creditCardYear"),@FindBy(xpath=("//input[@placeholder='Year']"))})
	private WebElement cardyear;
	
	@FindAll({@FindBy(id="nameOnCard"),@FindBy(xpath="//input[@placeholder='John Smith']")})
	private WebElement nameoncard;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement purchase;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getNameoncard() {
		return nameoncard;
	}

	public WebElement getPurchase() {
		return purchase;
	}
		}
