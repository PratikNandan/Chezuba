package Task;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class search {
	WebDriver driver ;
	
	
@BeforeTest
public void bt() {
	//setting up driver
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
}
	
@Test
public void tc1() {
	
	// entering item name in searchbox
	driver.findElement(By.id("inputValEnter")).sendKeys("watch");
	//clicking on search icon
	driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
	
	// validating search elements are displayed.
	WebElement res = driver.findElement(By.xpath("//div[@id='searchMessageContainer']//span[contains(@class,'nnn')]"));
	Assert.assertTrue(res.isDisplayed());
	System.out.println("Results for watch");

}

}
