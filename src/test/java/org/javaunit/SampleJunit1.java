package org.javaunit;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class SampleJunit1 {
	
	@Test
	public void tc0() {
		String s = "Karthick";
		Assert.assertEquals("karthick",s);
		System.out.println("End");
       
	}
	
	@Test
	public void tc1() {
		System.out.println("Test1");

	}
	@Test
	public void tc2() {
        System.out.println("Test2");
	}

}
