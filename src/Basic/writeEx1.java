package Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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



public class writeEx1 {

	public static void main(String[] args) throws IOException {
		
	FileInputStream fis=new FileInputStream("./excelfile/testdata.xlsx");
	Workbook wb =WorkbookFactory.create(fis);
	Sheet s1=wb.getSheet("Allstringdata");
	s1.getRow(0).createCell(3).setCellValue("Result");
	s1.getRow(1).createCell(3).setCellValue("Distinction");
	s1.getRow(2).createCell(3).setCellValue("Distinction");
	s1.getRow(3).createCell(3).setCellValue("Distinction");
	s1.createRow(4).createCell(0).setCellValue("Distinction");
	
	FileOutputStream fos=new FileOutputStream("./excelfile/testdata.xlsx");
	wb.write(fos);
	fos.close();
	
	
	   
		
	


}
}
 