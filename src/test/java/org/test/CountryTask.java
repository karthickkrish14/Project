package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryTask {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.id("countries"));
		Select s = new Select(country);
		
		List<WebElement> list = s.getOptions();
		File f = new File("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Country.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Count");
		
		
		for (int i = 0; i < list.size(); i++) {
			WebElement a = list.get(i);
			String text = a.getText();
			System.out.println(text);
			Row row = createSheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
				}
		FileOutputStream o = new FileOutputStream(f);
		w.write(o);
	}

}
