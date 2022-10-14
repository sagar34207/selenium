 package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex2 {

	public static void main(String[] args) {
		String url="https://www.google.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
	    String expturl="https://www.goggle.com/";
	    String acturl=driver.getCurrentUrl();
	    if(expturl.equals(acturl)) {
	    	System.out.println("correct");
	    	
	    }else {
	    	System.out.println("incorrect");
	    }
}

}
