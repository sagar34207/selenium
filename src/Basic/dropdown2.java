 package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException{
		String url="https://demoqa.com/select-menu";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.id("oldSelectMenu"));
		bu.scrollByJS(driver, ele);
		//ele.click();
		//driver.findElement(By.xpath("//option[text()='White']")).click();
		//ele.click();
		/*Select sel=new Select(ele);
		sel.selectByIndex(3);
		List<WebElement> alloptions=sel.getOptions();
		int size=alloptions.size();
		for(int i=0;i<size;i++) {
			sel.selectByIndex(i);
			i++;
			
		*/}
			}

