package Section14ExcelSheets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Lecture105FindNoOfRows {
	
	public static void main(String args[]) throws IOException {
		File f=new File("/Users/anoopsharma/Downloads/Rishu/SportsClubECE.xlsx");
		FileInputStream fs=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		System.out.println("no of rows is: "+sheet.getPhysicalNumberOfRows());
	
		XSSFRow row=sheet.getRow(0);
		
		System.out.println("no of columns is: "+row.getPhysicalNumberOfCells());
		
	}

}
