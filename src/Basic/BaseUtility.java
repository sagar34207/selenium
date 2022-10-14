package Basic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtility {
	

	public WebDriver startup(String browserName,String url) {
		WebDriver driver=null;

	if(browserName.equalsIgnoreCase("CH")||browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("start-maximized");
		 driver= new ChromeDriver(options);
		driver.get(url);
		}
	else {
		System.out.println("Invalid browser");
	}
	
	return driver;
	}
	public void scrollByJS(WebDriver driver, WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		 
	}
	
	public void clickByJS(WebDriver driver,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ele);
		
	}
  
	
	
}

