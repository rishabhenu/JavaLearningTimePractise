package Section14ExcelSheets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String args[]) throws IOException {
		
		File f=new File("/Users/anoopsharma/Downloads/Rishu/SportsClubECE.xlsx");
		
		FileInputStream fs=new FileInputStream(f);
		
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
	
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				
				XSSFCell cell=row.getCell(j);
				
//				if(cell.getCellType()==0)
//					{System.out.print(cell.getNumericCellValue());}
//				else if(cell.getCellType()==1)
//					{System.out.print(cell.getStringCellValue());}
				
				try
				{
					System.out.print(cell.getStringCellValue());
				}
				catch(Exception  e)
				{
					System.out.print(cell.getNumericCellValue());
				}
				
				System.out.print("	");
			
			}
			System.out.println();
		}
		
	}

}
