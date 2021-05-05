package org.javaunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SampleJunit {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("BeforeClass");
		}
	@AfterClass
	public static void afterclass() {
        System.out.println("AfterClass");
		}
	@Before
	public void before() {
        System.out.println("Before");
	}
	@After
	public void after() {
        System.out.println("After");
	}
	@Ignore
	@Test
	public void tc0() {
        System.out.println("Test1");
	}
	@Test
	public void tc1() {
        System.out.println("Test2");
	}

}
