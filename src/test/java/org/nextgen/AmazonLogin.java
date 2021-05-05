package org.nextgen;

import org.base.BaseClass;
import org.testng.annotations.Test;

public class AmazonLogin extends BaseClass {

	@Test(dataProvider="amazon",dataProviderClass=DataProviderClass.class)
	private void amazon(String s) {
		getDriver();
		launchUrl("https://www.amazon.in/");
		enterText(elementById("twotabsearchtextbox"),s);
		btnClick(elementById("nav-search-submit-button"));
	}

}
