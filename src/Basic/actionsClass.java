 package Basic;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actionsClass {

	public static void main(String[] args) throws InterruptedException{
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
	    WebElement uNAmeFeild=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	    act.sendKeys(uNAmeFeild,"Admin").perform();
	   WebElement pwdFeild=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	   act.sendKeys(pwdFeild,"admin123").perform();
	    WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
	   act.click(loginbtn).perform();
	 
	  
	
	    
}

}
