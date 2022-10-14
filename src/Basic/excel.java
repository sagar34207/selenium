package Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;



public class excel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis =new FileInputStream("./excelfile/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int sht=wb.getNumberOfSheets();
		System.out.println(sht);
		//System.out.println(wb.getSheetName(1));
		System.out.println(wb.getSheet("Alltypedata"));
		System.out.println(wb.getSheetIndex("Alltypedata"));
		Sheet s1=wb.getSheet("Allstringdata");
		System.out.println(s1.getLastRowNum());
		System.out.println(s1.getPhysicalNumberOfRows());
		//Row r1=s1.getRow(1);
       // System.out.println(r1.getLastCellNum());
	   // Cell c1=r1.getCell(1); 
	  //  System.out.println(c1.getCellType());
	   
		for(int i=0;i<=s1.getLastRowNum();i++) {
			Row r1=s1.getRow(i);
			for(int k=0;k<r1.getLastCellNum();k++) {
		
				Cell c1=r1.getCell(k); 
				System.out.println(c1.getStringCellValue());
				 
			 }
			
			System.out.println();
		}
	


}
}
 