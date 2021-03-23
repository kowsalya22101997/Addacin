package org.frame;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws IOException {
		
		
	File f= new File("C:\\Users\\kowsaly\\eclipse-workspace\\Maven\\Excel\\Excel3.xlsx");
	Workbook book = new XSSFWorkbook();
     Sheet sh = book.createSheet("Data");
     Row r1 = sh.createRow(0);
     Cell c1 = r1.createCell(0);
     c1.setCellValue("kowsalyag");
     Cell c2 = r1.createCell(1);
     c2.setCellValue("Raviguru@22");
      Row r2 = sh.createRow(1);
     Cell c3 = r2.createCell(0);
     c3.setCellValue("15/03/2021");
     Cell c4 = r2.createCell(1);
     c4.setCellValue("15/03/2021");
     Row r3 = sh.createRow(2);
     Cell c5 = r3.createCell(0);
     c5.setCellValue("kowsalya");
     Cell c6 = r3.createCell(1);
     c6.setCellValue("Gurupatham");
     Row r4 = sh.createRow(3);
     Cell c7 = r4.createCell(0);
     c7.setCellValue("187 bharathi nagar muthiyalpet village"
     		+ "Ayyanpet post"
     		+ "kanchipuram");
     Row r5 = sh.createRow(4);
     Cell c8 = r5.createCell(0);
     c8.setCellValue("1234567890");
     Row r6 = sh.createRow(5);
     Cell c9 = r6.createCell(0);
     c9.setCellValue("123");
     FileOutputStream f1=new FileOutputStream(f);
     book.write(f1);
      
     
     
     
     
     
     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
