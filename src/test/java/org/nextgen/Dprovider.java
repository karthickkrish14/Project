package org.nextgen;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dprovider extends BaseClass {

	@Test(dataProvider = "value")
	private void tc0(String s,String s1) {
		getDriver();
		launchUrl("https://www.facebook.com/");
		enterText(elementById("email"), s);
		enterText(elementById("pass"),s1);
		btnClick(elementByName("login"));
	}
	@DataProvider(name="value")
	private Object[][] getData() {
		return new Object[][]{{"hijava","welcome"},{"welcome","hijava"}};

	}

}
