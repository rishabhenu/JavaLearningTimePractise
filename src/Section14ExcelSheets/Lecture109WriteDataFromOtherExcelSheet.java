package Section14ExcelSheets;
import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Lecture109WriteDataFromOtherExcelSheet {
	
	public static void main(String args[]) throws IOException {
		File fin=new File("/Users/anoopsharma/Downloads/Rishu/NewExcelFile.xlsx");
		File fout=new File("/Users/anoopsharma/Downloads/Rishu/NewExcelFileCopy.xlsx");
		
		FileInputStream fsin=new FileInputStream(fin);
		FileOutputStream fsout=new FileOutputStream(fout);
		
		XSSFWorkbook wbin=new XSSFWorkbook(fsin);
		XSSFWorkbook wout=new XSSFWorkbook();
		
		XSSFSheet sheetin=wbin.getSheet("Sheet1");
		XSSFSheet sheetout=wout.createSheet("newSheet1");
		
		for(int i=0;i<sheetin.getPhysicalNumberOfRows();i++) {
			XSSFRow rowin=sheetin.getRow(i);
			XSSFRow rowout=sheetout.createRow(i);
			
			for(int j=0;j<rowin.getPhysicalNumberOfCells();j++) {
				XSSFCell cellin=rowin.getCell(j);
				XSSFCell cellout=rowout.createCell(j);
				
				if(cellin.getCellType()==1)cellout.setCellValue(cellin.getStringCellValue());
				else if(cellin.getCellType()==0)cellout.setCellValue(cellin.getNumericCellValue());
			}
		}
		
		wout.write(fsout);
		wout.close();
	}

}
