 package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {

	public static void main(String[] args) throws InterruptedException{
		String url="https://demoqa.com/alerts";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	    WebElement ele=driver.findElement(By.id("confirmButton"));
		bu.scrollByJS(driver, ele);
		ele.click();
		System.out.println(alt.getText());
		alt.dismiss();
		WebElement ele1=driver.findElement(By.id("promtButton"));
		bu.scrollByJS(driver, ele1);
		ele1.click();
		alt.sendKeys("sagar is legend");
		Thread.sleep(2000);
		alt.accept();
		WebElement ele2=driver.findElement(By.id("timerAlertButton"));
		ele2.click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alt.getText());
		alt.accept();
		
	}

}
