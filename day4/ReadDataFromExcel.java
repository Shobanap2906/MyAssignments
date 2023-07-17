package week4.day4;


import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			XSSFWorkbook book = new XSSFWorkbook("./datas/CreateLead.xlsx");
			//getsheet
			XSSFSheet sheet= book.getSheetAt(0);
			//rowcount
			int rowNo=	sheet.getLastRowNum();
			System.out.println(rowNo);
			//with header
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println(physicalNumberOfRows);
			
			//read cell count and value
			
			int cellNum =sheet.getRow(0).getLastCellNum();
			System.out.println(cellNum);
			
			String stringCellValue=sheet.getRow(1).getCell(3).getStringCellValue();
			System.out.println(stringCellValue);
			
			//print all set of data
			
		for (int i = 1; i <= rowNo; i++) {
			
			XSSFRow row=sheet.getRow(i);
			for (int j = 0; j < cellNum; j++) {
				
				String data = row.getCell(j).getStringCellValue();
				System.out.println(data);
				
			}
			
		}
			book.close();
	}

}
