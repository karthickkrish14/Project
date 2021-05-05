package org.nextgen;


import org.base.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleGen extends BaseClass{
	
	@Parameters({"username","password"})
	@Test
	private void tc0(String s,String s1) {
		getDriver();
		launchUrl("https://www.facebook.com/");
     enterText(elementById("email"), s);
     enterText(elementById("pass"), s1);
	}
	
	
	}
