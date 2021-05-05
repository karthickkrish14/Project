package org.grou;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleGroup {

	@Test(groups = "smoke")
	public void tc0() {
		System.out.println("Method1");
	}

	@Test(groups = "reg")
	public void tc1() {
		System.out.println("Method2");
	}

	@Test(groups = "sanity")
	public void tc2() {
		System.out.println("Method3");
	}

	@Test(groups = "E2E",dependsOnGroups="smoke")
	public void tc3() {
		System.out.println("Method4");
	}

	@Test(groups = "smoke")
	public void tc4() {
		Assert.assertTrue(false);
		System.out.println("Method5");
	}

	@Test(groups = "reg")
	private void tc5() {
		System.out.println("Method6");
	}

	@Test(groups = "sanity")
	private void tc6() {
		System.out.println("Method7");
	}

}
