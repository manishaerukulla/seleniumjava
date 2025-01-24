package actionclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Mousehover {
	WebDriver driver;
  @Test
  public void draganddrop() {
	  driver.get("https://www.techlearn.in/");
	  Actions act= new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
	 driver.findElement(By.xpath("//*[@id=\"mega-menu-item-46\"]/a")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
