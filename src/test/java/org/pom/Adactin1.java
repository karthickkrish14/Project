package org.pom;

import org.base.BaseClass;
import org.loginpage.Book;
import org.loginpage.ContinuePage;
import org.loginpage.Login;
import org.loginpage.SearchHotel;
import org.openqa.selenium.WebElement;

public class Adactin1 extends BaseClass {
	
	public static void main(String[] args) {
		
		getDriver();
		launchUrl("https://adactinhotelapp.com/");
		Login l = new Login();
		enterText(l.getTxtUserName(),"karthi007");
		enterText(l.getTxtPassWord(),"Karthi@1989");
		btnClick(l.getBtnClick());
		
		SearchHotel hotel = new SearchHotel();
		selectByIndex(hotel.getLocation(),4);
		selectByIndex(hotel.getHotel(),2);
		selectByIndex(hotel.getRoomtype(), 2);
		selectByIndex(hotel.getNumberofrooms(),1);
		enterText(hotel.getCheckindate(), "28/04/2021");
		enterText(hotel.getCheckoutdate(), "29/04/2021");
		selectByIndex(hotel.getAdultroom(), 1);
		selectByIndex(hotel.getChildroom(), 1);
		btnClick(hotel.getSearch());
		
		ContinuePage c = new ContinuePage();
		btnClick(c.getSelect());
		btnClick(c.getCtnue());
		
		Book b = new Book();
		enterText(b.getFirstname(), "Karthick");
		enterText(b.getLastname(), "S");
		enterText(b.getAddress(),"Chennai");
		enterText(b.getCreditcard(), "1234567890123456");
		selectByIndex(b.getCreditcardtype(), 2);
		selectByIndex(b.getEmonth(), 4);
		selectByIndex(b.getEyear(), 11);
		enterText(b.getCvvnum(), "321");
		btnClick(b.getBook());
}
}
