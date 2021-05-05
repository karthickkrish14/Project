package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	public static Select s;
	
	
	public static void getDriver() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
	}
	
	public static void launchUrl(String data) {
         driver.get(data);	
		}
	public static void enterText(WebElement element,String data) {
         element.sendKeys(data);
		}
	
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	public static WebElement elementById(String data) {
        WebElement findElement = driver.findElement(By.id(data));
		return findElement;
	}
	
	public static WebElement elementByName(String data) {
		WebElement findElement = driver.findElement(By.name(data));
		return findElement;
    }
	
	public static WebElement elementByXpath(String data) {
        WebElement findElement = driver.findElement(By.xpath(data));
		return findElement;
	}
	public static void moveToElement(WebElement target) {
		Actions ac = new Actions(driver);
	    ac.moveToElement(target).perform();
	}
		
	public static void rightClick(WebElement target) {
       Actions ac = new Actions(driver);
		ac.contextClick(target).perform();
	}
	
	public static void dragAndDrop(WebElement Source,WebElement Dest) {
	   Actions ac = new Actions(driver);
	   ac.dragAndDrop(Source, Dest).perform();
       
	}
	
	public static void selectByIndex(WebElement element,int id) {
       Select s = new Select(element);
       s.selectByIndex(id);
	}
	
	public static void selectByValue(WebElement element,String data) {
		Select s = new Select(element);
		s.selectByValue(data);
         
	}
	
	public static void selectByVisibleText(WebElement element,String data) {
        Select s = new Select(element);
        s.selectByVisibleText(data);
	}
	
	
	
	public String getDataFromExcel(String pathname,String name,int rowno,int cellno) throws IOException {
	File file = new File(pathname);
	FileInputStream inputStream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(inputStream);
	Sheet sheet = workbook.getSheet(name);
	Row row = sheet.getRow(rowno);
	Cell cell = row.getCell(cellno);
	int cellType = cell.getCellType();
	String value="";
	if(cellType==1) {
		value = cell.getStringCellValue();
	}
	else if (DateUtil.isCellDateFormatted(cell)) {
		Date dateCellValue = cell.getDateCellValue();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
		value = format.format(dateCellValue);
	}
	else
	{
		double numericCellValue = cell.getNumericCellValue();
		long l = (long)numericCellValue;
		value = String.valueOf(l);
	}
	return value;
	
}
	}

