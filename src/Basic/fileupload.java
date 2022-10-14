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

public class fileupload {

	public static void main(String[] args) throws InterruptedException{
		String url="https://demoqa.com/automation-practice-form";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		WebElement choosephoto=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		bu.scrollByJS(driver, choosephoto);
		choosephoto.sendKeys("D:\\java\\Screenshot (680).png");
		 
	
	}

}
