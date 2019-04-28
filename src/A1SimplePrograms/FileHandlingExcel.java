package A1SimplePrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandlingExcel{
	
	static File f=new File("/Users/anoopsharma/Downloads/Rishu/NewExcelFile.xlsx");
	
	
	public static  void getSingleCell() throws IOException {		
		FileInputStream fs=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		XSSFRow row0=sheet.getRow(0);
		XSSFCell cell=row0.getCell(0);
		System.out.println(cell.getStringCellValue());
	}
	
	public static void getCompleteSheet() throws IOException{
		
		FileInputStream fs=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		for(int r=0;r<sheet.getPhysicalNumberOfRows();r++) {
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<row.getPhysicalNumberOfCells();c++) {
				XSSFCell cell=row.getCell(c);
				
				if(cell.getCellType()==1)System.out.print(cell.getStringCellValue());
				else System.out.print(cell.getNumericCellValue());
				
				System.out.print("   ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) throws IOException {
		
		getSingleCell();
		getCompleteSheet();
		
	}
}
