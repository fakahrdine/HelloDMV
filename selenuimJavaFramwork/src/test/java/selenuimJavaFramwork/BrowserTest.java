package selenuimJavaFramwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserTest {
	
	private  static WebElement element ;

	public static WebElement UserNamebox (WebDriver driver) {
	    element = driver.findElement(By.name("userName"));
		return element;
		
		
	}
	public static WebElement passwordbox(WebDriver driver) {

		element =driver.findElement(By.name("password"));
		return element;
		
}
	public static WebElement loginBoton(WebDriver driver) {

		element =driver.findElement(By.name("login"));
		return element;
}
	
}