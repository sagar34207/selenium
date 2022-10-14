package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class frameinframe {

	public static void main(String[] args) throws InterruptedException{
		String url="https://demoqa.com/frames";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		driver.switchTo().frame("frame1");
		WebElement ele1=driver.findElement(By.id("sampleHeading"));
		System.out.println(ele1.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement ele2=driver.findElement(By.id("sampleHeading"));
		System.out.println(ele2.getText());
		
	
	   
	    
}

}
 