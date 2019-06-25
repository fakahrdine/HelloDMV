package testNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentRepoDimo {
	 public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		//start our html reporter
 ExtentHtmlReporter Htmlrepo = new ExtentHtmlReporter("MurcuryloginR.html");
 //create extent reports 
ExtentReports extent = new ExtentReports();
extent.attachReporter(Htmlrepo);
ExtentTest test1  = extent.createTest("login page");
test1.log(Status.INFO ,"starting login page");

System.setProperty("webdriver.chrome.driver","C:\\Users\\drivers\\chromedriver.exe");
driver = new ChromeDriver();

driver.get("http://newtours.demoaut.com/");
test1.pass("navigate to the URL");
driver.findElement(By.name("userName")).sendKeys("fakhar");
test1.pass("enter username");
driver.findElement(By.name("password")).sendKeys("59Mohamed@");
test1.pass("enter password");
driver.findElement(By.name("login")).click();
test1.pass("click on login botton");
driver.close();
driver.quit();
test1.pass("close the browser");
test1.info("the test is finish");
extent.flush();



		
		
	}

}
