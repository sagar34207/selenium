 package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {

	public static void main(String[] args) throws InterruptedException{
		String url="https://www.facebook.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
	
		driver.switchTo().activeElement().sendKeys("manojsureshkadam@gmail.com");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Kadammanoj@96");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().click();
		

		
		
		
	    
}

}
