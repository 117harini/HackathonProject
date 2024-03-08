package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public void write(String sheetName, int rownum, int colnum, String data)throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Write.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file); 

		if(book.getSheetIndex(sheetName)==-1) {
			book.createSheet(sheetName);              
		}
		
		XSSFSheet sheet = book.getSheet(sheetName);
		
		if(sheet.getRow(rownum)==null)
		{
			sheet.createRow(rownum);
		}
		XSSFRow row = sheet.getRow(rownum);   
		
		XSSFCell cell = row.createCell(colnum); 
		
		cell.setCellValue(data); 
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Write.xlsx");
		book.write(fo);
		book.close();
		file.close();
		fo.close();
	}
	
	public static String[] read(){
		
		String[] str=new String[4];
		
		try {
		String f = System.getProperty("user.dir")+"\\TestData\\Read.xlsx";
		FileInputStream file = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		for(int i=0;i<4;i++) {
			DataFormatter formatter = new DataFormatter();
			XSSFCell cell = row.getCell(i);
			str[i]=formatter.formatCellValue(cell);
		}
		file.close();
		wb.close();
		}
		catch(Exception e) {
		}
		return str;
	}

}
