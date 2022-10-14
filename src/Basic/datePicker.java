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

public class datePicker {

	public static void main(String[] args) throws InterruptedException{
		String url="https://demoqa.com/automation-practice-form";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		Actions act= new Actions(driver);
	
		WebElement date=driver.findElement(By.id("dateOfBirthInput"));
	    bu.scrollByJS(driver, date);
    	date.click();
	    date.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	    date.sendKeys("3 apr 1995");
	    date.sendKeys(Keys.ENTER);
	
	
	
	
	      
}

}
