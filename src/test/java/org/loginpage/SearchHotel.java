package org.loginpage;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {

		PageFactory.initElements(driver, this);
	}
	
    public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNumberofrooms() {
		return numberofrooms;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSearch() {
		return search;
	}
	@FindAll({@FindBy(id="location"),@FindBy(xpath="(//select[@class='search_combobox'])[1]")})
    private WebElement location;
    @FindAll({@FindBy(id="hotels"),@FindBy(xpath="(//select[@class='search_combobox'])[2]")})
    private WebElement hotel;
    @FindAll({@FindBy(id="room_type"),@FindBy(xpath=("(//select[@class='search_combobox'])[3]"))})
    private WebElement roomtype;
    @FindAll({@FindBy(id="room_nos"),@FindBy(xpath=("(//select[@class='search_combobox'])[4]"))})
    private WebElement numberofrooms;
    @FindAll({@FindBy(id="datepick_in"),@FindBy(xpath=("(//input[@class='date_pick'])[1]"))})
    private WebElement checkindate;
    @FindAll({@FindBy(id="datepick_out"),@FindBy(xpath=("(//input[@class='date_pick'])[2]"))})
    private WebElement checkoutdate;
    @FindAll({@FindBy(id="adult_room"),@FindBy(xpath=("(//select[@class='search_combobox'])[5]"))})
    private WebElement adultroom;
    @FindAll({@FindBy(id="child_room"),@FindBy(xpath=("(//select[@class='search_combobox'])[6]"))})
    private WebElement childroom;
	@FindAll({@FindBy(id="Submit"),@FindBy(xpath=("(//input[@class='reg_button'])[1]"))})
	private WebElement search;
}
