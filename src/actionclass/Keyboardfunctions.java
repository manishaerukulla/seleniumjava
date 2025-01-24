package actionclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Keyboardfunctions {
	WebDriver driver;
  @Test
  public void keyboardfunctions() {
	  driver.get("https://www.techlearn.in/admin");
	  Actions act= new Actions(driver);
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Manisha");
	  act.sendKeys(Keys.TAB).build().perform();
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("abc");
	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).sendKeys(Keys.ENTER);
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
