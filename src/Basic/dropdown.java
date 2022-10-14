 package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropdown {

	public static void main(String[] args) throws InterruptedException{
		String url="https://demoqa.com/select-menu";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#withOptGroup .css-1hwfws3")).click();
		System.out.println(driver.getPageSource());
		driver.findElement(By.xpath("//div[text()='Group 1, option 2']")).click();
	    
	    
}

}
