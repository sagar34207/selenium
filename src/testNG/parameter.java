package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Basic.BaseUtility;

public class parameter {
	@Parameters({"userName","password"})
  @Test
  public void Ex1(String uname,String pwd) {
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    	  
	   
  }
 
}
