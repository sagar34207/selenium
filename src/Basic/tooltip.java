package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tooltip {

	public static void main(String[] args) throws InterruptedException{
		String url="https://demoqa.com/tool-tips";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		Actions act=new Actions(driver);
		WebElement tooltip=(driver.findElement(By.id("toolTipButton")));
		act.moveToElement(tooltip).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    String tooltiptxt = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		System.out.println(tooltiptxt);

	    
}

}
 