package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Face {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\ADMIN\\eclipse-Karthick\\Framework\\ExcelSheet\\Framework.xlsx");
		FileInputStream f1 = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(f1);

		Sheet s = w.getSheet("Sheet1");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			System.out.println();

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);

				int type = c.getCellType();

				if (type == 1) {
					String name = c.getStringCellValue();
					System.out.println(name);
				}
				if (type == 0) {
					double d = c.getNumericCellValue();
					long l = (long) d;
					String string = String.valueOf(l);
					System.out.println(string);
				}
				if(type==0) {
					if(DateUtil.isCellDateFormatted(c)) {
						String name = new SimpleDateFormat("dd-MMM-yy").format(c.getDateCellValue());
						System.out.println(name);
					}
				}
					}
			

			}
		}

	}


