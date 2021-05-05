package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;

public class Book extends BaseClass{
	public Book() {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindAll({@FindBy(id="first_name"),@FindBy(xpath="(//input[@class='reg_input'])[1]")})
	private WebElement firstname;
	@FindAll({@FindBy(id="last_name"),@FindBy(xpath="(//input[@class='reg_input'])[2]")})
	private WebElement lastname;
	@FindAll({@FindBy(id="address"),@FindBy(xpath="//textarea[@class='txtarea']")})
	private WebElement address;
	@FindAll({@FindBy(id="cc_num"),@FindBy(xpath="(//input[@class='reg_input'])[3]")})
	private WebElement creditcard;
	@FindAll({@FindBy(id="cc_type"),@FindBy(xpath="//select[@class='select_combobox']")})
	private WebElement creditcardtype;
	@FindAll({@FindBy(id="cc_exp_month"),@FindBy(xpath="(//select[@class='select_combobox2'])[1]")})
	private WebElement emonth;
	@FindAll({@FindBy(id="cc_exp_year"),@FindBy(xpath="(//select[@class='select_combobox2'])[2]")})
	private WebElement eyear;
	@FindAll({@FindBy(id="cc_cvv"),@FindBy(xpath="(//input[@class='reg_input'])[4]")})
	private WebElement cvvnum;
	@FindAll({@FindBy(id="book_now"),@FindBy(xpath="(//input[@class='reg_button'])[1]")})
	private WebElement book;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditcard() {
		return creditcard;
	}
	public WebElement getCreditcardtype() {
		return creditcardtype;
	}
	public WebElement getEmonth() {
		return emonth;
	}
	public WebElement getEyear() {
		return eyear;
	}
	public WebElement getCvvnum() {
		return cvvnum;
	}
	public WebElement getBook() {
		return book;
	}
	
}