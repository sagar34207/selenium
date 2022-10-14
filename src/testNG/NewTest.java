package testNG;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void addtion() {
	  System.out.println("Addition");
  }
  @Test(priority=2)
  public void subtraction() {
	  System.out.println("Subtraction");
	  multiplication();
  }
  public void multiplication() {
	  System.out.println("Multiplication");
  }
  @Test(priority=-5)
  public void string() {
	  String str="Pune";
	  System.out.println(str.charAt(2));
  }
}