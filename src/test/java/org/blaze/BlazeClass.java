package org.blaze;

import org.base.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;

public class BlazeClass extends BaseClass{
	
	
		@Before
		public void tc0() {
			getDriver();
			launchUrl("https://demoblaze.com/");
		}
		
		@Test
		public void cart() throws InterruptedException {
			btnClick(elementByXpath("(//a[@class='hrefch'])[1]"));
			Thread.sleep(5000);
			btnClick(elementByXpath("//a[@class='btn btn-success btn-lg']"));
			Thread.sleep(5000);

			Alert alert = driver.switchTo().alert();
			alert.accept();
			
		}
		
		@After
		public void exit() {

			driver.close();
		}
		
}

