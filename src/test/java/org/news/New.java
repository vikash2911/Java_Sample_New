package org.news;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class New {
	
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\raj\\eclipse-workspace\\NewFrame\\datas\\Book1.xlsx");
		

		
		Workbook book = new XSSFWorkbook();
		
		Sheet sheet = book.createSheet("Sheet2");
		
		Row cre = sheet.createRow(4);
		
		Cell ce = cre.createCell(0);
		
		ce.setCellValue("Vikash");
		
		FileOutputStream f = new FileOutputStream(file);
		
		book.write(f);
		
		System.out.println("done");
		
	
		
	}

}
