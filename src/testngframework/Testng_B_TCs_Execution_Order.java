package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Testng_B_TCs_Execution_Order {
	WebDriver driver;
  @Test
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test
  public void seleniumdev() {
	  driver.get("https://www.selenium.dev");
  }
  @Test
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  @Test
  public void swiggy() {
	  driver.get("https://www.swiggy.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
