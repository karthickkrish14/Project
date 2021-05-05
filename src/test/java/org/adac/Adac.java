package org.adac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.loginpage.Book;
import org.loginpage.ContinuePage;
import org.loginpage.Login;
import org.loginpage.SearchHotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adac extends BaseClass {
	@BeforeClass
	public static void beforeclass() {
		getDriver();
		launchUrl("https://adactinhotelapp.com/");

	}

	@Test
	public void tc0() throws IOException {

		Login log = new Login();
		enterText(log.getTxtUserName(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 0));
		enterText(log.getTxtPassWord(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 1));
		btnClick(log.getBtnClick());
	}

	@Test
	public void tc1() throws IOException {

		SearchHotel hotel = new SearchHotel();
		enterText(hotel.getLocation(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 2));
		enterText(hotel.getHotel(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 3));
		enterText(hotel.getRoomtype(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 4));
		enterText(hotel.getNumberofrooms(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 5));
		enterText(hotel.getCheckindate(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 6));
		enterText(hotel.getCheckoutdate(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 7));
		enterText(hotel.getAdultroom(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 8));
		enterText(hotel.getChildroom(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 9));
		btnClick(hotel.getSearch());

	}

	@Test
	public void tc2() {
		ContinuePage c = new ContinuePage();
		btnClick(c.getSelect());
		btnClick(c.getCtnue());
	}

	@Test
	public void tc3() throws IOException, InterruptedException {
		Book b = new Book();
		enterText(b.getFirstname(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 10));
		enterText(b.getLastname(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 11));
		enterText(b.getAddress(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 12));
		enterText(b.getCreditcard(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 13));
		enterText(b.getCreditcardtype(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 14));
		enterText(b.getEmonth(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 15));
		enterText(b.getEyear(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 16));
		enterText(b.getCvvnum(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx", "Sheet1", 1, 17));
		btnClick(b.getBook());
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.id("order_no"));
		String attribute = element.getAttribute("value");
		

		File file = new File("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Adactin.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row row = s.getRow(1);
		Cell cell = row.createCell(18);
		cell.setCellValue(attribute);

		FileOutputStream f = new FileOutputStream(file);
		w.write(f);

		System.out.println(attribute);

	}

}
