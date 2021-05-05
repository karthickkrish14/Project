package org.testnext;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	
	@BeforeClass
	private void beforeClass() {
        System.out.println("Before Class");
		
	}
	
	@AfterClass
	private void afterClass() {
        System.out.println("After Class");
		
	}

	@AfterMethod
	private void afterMethod() {
        System.out.println("After Method");
	}
	
	@BeforeMethod
	private void beforeMethod() {
        System.out.println("Before Method");
	}
	
	@Test
	private void tc0() {
        System.out.println("Test1");
	}
}

