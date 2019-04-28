package Section14ExcelSheets;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Lecture108WriteData {
	
	public static void main(String args[]) throws IOException{
		File f=new File("/Users/anoopsharma/Downloads/Rishu/NewExcelFile.xlsx");
		FileOutputStream fs=new FileOutputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Sheet1");
		
		for(int j=0;j<3;j++) {
			XSSFRow row=sheet.createRow(j);
		for(int i=0;i<4;i++) {
			XSSFCell cell=row.createCell(i);
			
		switch(j) {
		case 0:{
			switch (i){
		
			case 0:
				cell.setCellValue("Name");
				break;
			
			case 1 :
				cell.setCellValue("Class");
				break;
			
			case 2:
				cell.setCellValue("Roll No");
				break;
			
			case 3:
				cell.setCellValue("Designation");
				break;}
		break;}
		
		case 1:{
			switch(i) {
			
			case 0:
				cell.setCellValue("Rishabh");
				break;
				
			case 1:
				cell.setCellValue("B.Tech. 3rd Year");
				break;
				
			case 2:
				cell.setCellValue(11302074);
				break;
				
			case 3:
				cell.setCellValue("Sr. Chief Secretery");
				break;}
		break;}
		
		case 2:{
			switch(i) {
			
			case 0:
				cell.setCellValue("Aayushi");
				break;
				
			case 1:
				cell.setCellValue("B.Tech. 2nd Year");
				break;
				
			case 2:
				cell.setCellValue(11402001);
				break;
				
			case 3:
				cell.setCellValue("Jr. Secretery");
				break;}
		break;}
		}
		}
		}
		
		wb.write(fs);
		fs.close();
		
	}
	
}
