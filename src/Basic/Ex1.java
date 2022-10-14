 package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex1 {

	public static void main(String[] args) {
		String url="https://demoqa.com/";
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.startup("ch", url);
	    String expttitle="ToolsQ";
	    String acttitle=driver.getTitle();
	    if(expttitle.equals(acttitle)) {
	    	System.out.println("correct");
	    	
	    }else {
	    	System.out.println("incorrect");
	    }
}

}
