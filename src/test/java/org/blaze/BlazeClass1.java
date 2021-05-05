package org.blaze;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.loginpage.ChooseFlight;
import org.loginpage.Reservation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BlazeClass1 extends BaseClass {
	
	@BeforeClass
	private void tc0() {

		getDriver();
		launchUrl("https://blazedemo.com/");
		
		}
	
	 @Test
	  private void tc1() {

		 WelcomePage w = new WelcomePage();
		 selectByIndex(w.getDepcity(),5);
		 selectByIndex(w.getDescity(),4);
		 btnClick(w.getFindflight());
		 }
	
	 @Test
	 private void tc2() {

		 ChooseFlight c = new ChooseFlight();
		 
		 btnClick(c.getChoose());
	}
	 
	 @Test
	 private void tc3() throws IOException {

		 Reservation r = new Reservation();
         enterText(r.getFirstname(), getDataFromExcel("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Blaze.xlsx","Sheet1",1,2));
         enterText(r.getAddress(), getDataFromExcel("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Blaze.xlsx","Sheet1",1,3));
         enterText(r.getCity(), getDataFromExcel("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Blaze.xlsx","Sheet1",1,4));
         enterText(r.getState(), getDataFromExcel("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Blaze.xlsx","Sheet1",1,5));
         enterText(r.getZipcode(), getDataFromExcel("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Blaze.xlsx","Sheet1",1,6));
         enterText(r.getCardtype(), getDataFromExcel("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Blaze.xlsx","Sheet1",1,7));
         enterText(r.getCardnumber(), getDataFromExcel("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Blaze.xlsx","Sheet1",1,8));
         enterText(r.getCardmonth(), getDataFromExcel("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Blaze.xlsx","Sheet1",1,9));
         enterText(r.getCardyear(), getDataFromExcel("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Blaze.xlsx","Sheet1",1,10));
         enterText(r.getNameoncard(), getDataFromExcel("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Blaze.xlsx","Sheet1",1,11));
         btnClick(r.getPurchase());
         
         List<WebElement> trow = driver.findElements(By.tagName("tr"));
        	 WebElement row = trow.get(1);
        	 
         List<WebElement> tdata = driver.findElements(By.tagName("td"));
         WebElement data = tdata.get(1);
        	 String text = data.getText();
        	 System.out.println(text);
			
         
          File f = new File("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Blaze.xlsx");
          FileInputStream stream = new FileInputStream(f);
          Workbook w = new XSSFWorkbook(stream);
          Sheet s = w.getSheet("Sheet1");
          Row row1 = s.getRow(1);
          Cell cell = row1.createCell(12);
          cell.setCellValue(text);
          
          FileOutputStream file = new FileOutputStream(f);
          w.write(file);
          System.out.println(text);
          
         }
           }
	 
