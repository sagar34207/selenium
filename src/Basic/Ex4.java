 package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex4 {

	public static void main(String[] args) throws InterruptedException{
		String url="https://demoqa.com/radio-button";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
		WebElement element =driver.findElement(By.xpath("//label[@for='yesRadio']"));
		element.click();
		System.out.println((element.getText()));
		System.out.println(element.isEnabled());
		System.out.println(element.isSelected());
	    System.out.println(element.isDisplayed());
	    
	    
}

}
