package actionclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class DragandDrop {
	WebDriver driver;
  @Test
  public void draganddrop() {
	  driver.get("https://www.techlearn.in/code/drag-and-drop/");
	  Actions act= new Actions(driver);
	  WebElement source=driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
	  WebElement target=driver.findElement(By.xpath("//*[@id=\"div1\"]"));
	  act.dragAndDrop(source, target).build().perform();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
