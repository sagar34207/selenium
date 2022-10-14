 package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException{
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		
		
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(5));
		//wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@placeholder='Username']"))));
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	   // driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    //System.out.println(driver.getPageSource());
	   System.out.println(driver.getWindowHandle());
	   
	  
	    //driver.close();
	    
	    
}

}
