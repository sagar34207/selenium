package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Basic.BaseUtility;

public class invocation2 {
  @Test(dataProvider="login") 
  public void Ex1(String uname,String pwd) {
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    	  
	   
  }
  @DataProvider
  public Object[][]login(){
	  Object[][] data =new Object[3][2];
	  data[0][0]="Admin";
	  data[0][1]="admin123";
	  
	  data[1][0]="Admin1";
	  data[1][1]="Admin";
	  
	  data[2][0]="Adminaa";
	  data[2][1]="Admin123";
	  return data;
  }
}
