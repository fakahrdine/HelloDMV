package selenuimJavaFramwork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import selenuimJavaFramwork.BrowserTest;

public class Test_MloginPage {
	
	private static WebDriver driver;
	public static void main(String[] args) {
		
		loginpage();
		
	}
	
	



public static void loginpage()  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	  
	driver.get("http://newtours.demoaut.com/");
	//Thread.sleep(4000);
	
	//driver.findElement(By.name("userName")).sendKeys("fakhar");
	BrowserTest.UserNamebox(driver).sendKeys("fakhar");
	//driver.findElement(By.name("password")).sendKeys("59Mohamed@");
	BrowserTest.passwordbox(driver).sendKeys("59Mohamed@");
	//driver.findElement(By.name("login")).click();
	BrowserTest.loginBoton(driver).click();
	
}
}
