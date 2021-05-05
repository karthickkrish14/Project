package org.nextgen;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@DataProvider(name="amazon")
	private Object[][] getDataAmazon() {
		return new Object[][] {{"oneplus mobile"},{"hp laptop"},{"apple watch"}};
		}

}
   