package dropdownmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Visibletext {
	WebDriver driver;
  @Test
  public void Dropdownoptions() {
	  driver.get("https://www.astroyogi.com/panchang/today-panchang");
	  //Select m= new Select(driver.findElement(By.xpath("//*[@id=\"Month\"]")));
	 // m.selectByVisibleText("June");
	  //m.selectByValue("5");
	  //m.selectByIndex(9);
	  //m.selectByContainsVisibleText("Sep");
	  //m.selectByContainsVisibleText("March");
	  //m.deselectByVisibleText("September");
	  new Select(driver.findElement(By.xpath("//*[@id=\"Month\"]"))).selectByVisibleText("February");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
