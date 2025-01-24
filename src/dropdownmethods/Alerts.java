package dropdownmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Alerts {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.techlearn.in/");
	  //driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	
	 //driver.switchTo().alert().sendKeys("Manisha Rithika Sahiti");
	 //driver.switchTo().alert().accept();
	 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[3]/svg")).click();
	 driver.switchTo().alert().dismiss();
	 //driver.findElement(By.cssSelector("ays_pb_material_close_icon")).click();
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
