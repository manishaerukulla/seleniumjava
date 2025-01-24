package demo;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class locators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() {
		driver=new ChromeDriver();
	}

	@Test
	void totallinks(){
		driver.get("https://www.google.com");
		
		List<WebElement> totallinks =driver.findElements(By.tagName("a"));
		System.out.println("total no of links"+ totallinks.size());
		
	}
	@Test
	void xpath(){
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("rithika");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/div[1]/form/p[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		
	}

}
