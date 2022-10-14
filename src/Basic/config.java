package Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class config {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis =new FileInputStream("./config/config.properties");
		Properties prop =new Properties();
		prop.load(fis);
		String browser= prop.getProperty("browserName");
		String url=prop.getProperty("url");
		String uName=prop.getProperty("uName");
		String password=prop.getProperty("Password");
		
		
		
		
		BaseUtility bu=new BaseUtility();

		WebDriver driver=bu.startup(browser, url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uName);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	   
	  
	}


}
 