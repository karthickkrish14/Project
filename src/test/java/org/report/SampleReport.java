package org.report;

import java.io.File;
import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SampleReport extends BaseClass {

	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest createTest;
	TakesScreenshot ts;

	@BeforeSuite
	private void beforesuite() {

		reports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("facebook.html");
        reports.attachReporter(htmlReporter);
	}
	
	@BeforeClass
	private void beforeclass() {
       getDriver();
       launchUrl("https://www.facebook.com/");
		}
	
	@Test
	private void tc0() throws IOException {
       createTest = reports.createTest("Validating Facebook HomePage");
       createTest.log(Status.INFO,"Validating fb url");
        ts = (TakesScreenshot)driver;
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshotAs, new File("fb.png"));
        if(driver.getCurrentUrl().contains("facebook")) {
        	createTest.log(Status.PASS, "valid url");
        	createTest.addScreenCaptureFromPath("fb.png");
        }
        else
        {
        	createTest.log(Status.FAIL,"Invalid url");
        }
        createTest.log(Status.INFO, "Validating facebook text present in homepage");
        WebElement getTextFromPage = driver.findElement(By.xpath("//h2[contains(text(),'people')]"));
        if(getTextFromPage.getText().contains("people in")) {
        	createTest.log(Status.PASS, "particular text is present in the webpage");
        }
        else
        {
        	createTest.log(Status.FAIL, "particular text is not present in the webpage");
        }
       }
	@Test
	private void tc1() throws IOException {

		 createTest = reports.createTest("Validating username and password field");
		 
		 WebElement txtUserName = driver.findElement(By.id("email"));
		 txtUserName.sendKeys("hijava");
		 
		 WebElement txtPassword = driver.findElement(By.id("pass"));
		 txtPassword.sendKeys("welcome");
		 
		 File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(screenshotAs, new File("Credential.png"));
		 
		 createTest.addScreenCaptureFromPath("Credential.png");
		 WebElement btnlogin = driver.findElement(By.name("login"));
		 btnlogin.click();
		 }
	@AfterSuite
	private void aftersuite() {

		reports.flush();
	}

}
