package testNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo2 {
	
	WebDriver driver ;
	@BeforeTest
	
public void testSetup () {	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
}
@Test
public void	testexcution2 () {
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.name("userName")).sendKeys("fakhar");
	driver.findElement(By.name("password")).sendKeys("59Mohamed@");
    driver.findElement(By.name("login")).click();


}
@AfterTest
public void endtext () {
	
	driver.close();
	
}
}
	
	
	
	
	
	


