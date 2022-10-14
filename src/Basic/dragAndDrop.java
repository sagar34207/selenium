 package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException{
		String url="https://demoqa.com/droppable";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		Actions act=new Actions(driver);
		
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement des=driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		bu.scrollByJS(driver,des);
	//	act.dragAndDrop(src,des).perform();
	//	act.dragAndDropBy(src,250,50).perform();
		
		act.click(src).clickAndHold().moveToElement(des).release().build().perform();
		
		
	
	
	}

}
