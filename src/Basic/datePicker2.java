package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class datePicker2 {

	public static void main(String[] args) throws InterruptedException{
		String url="https://demoqa.com/automation-practice-form";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		//Actions act= new Actions(driver);
		WebElement date=driver.findElement(By.id("dateOfBirthInput"));
		bu.scrollByJS(driver, date);
		date.click();
		driver.findElement(By.className("react-datepicker__year-select")).click();
		driver.findElement(By.xpath("//option[@value='2002']")).click();
        
		driver.findElement(By.xpath("//option[@value='1']")).click();
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--005']")).click();
		
		
	
	
	
	
	
	      
}

}
