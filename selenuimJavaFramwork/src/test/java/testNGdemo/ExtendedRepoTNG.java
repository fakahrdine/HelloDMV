package testNGdemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendedRepoTNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent ;
	WebDriver driver;
	@BeforeTest
	public void setUp () {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		    
	        // create ExtentReports and attach reporter(s)
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\drivers\\chromedriver.exe");
	   	   driver = new ChromeDriver();

	       
	}
@Test
	public void test1 () throws Exception {
	  // creates a toggle for the given test, adds all log events under it    
    ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
    driver.get("http://newtours.demoaut.com/");
    test.log(Status.INFO, "This step shows usage of log(status, details)");

    // info(details)
    test.info("This step shows usage of info(details)");
    
    // log with snapshot
    test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
    
    // test with snapshot
    test.addScreenCaptureFromPath("screenshot.png");


}
@AfterTest
	public void endtest () {
	driver.close();
	driver.quit();
	System.out.println("the test is completed");
 
		
}
@AfterTest
public void teardown () {
	
extent.flush();
	
}

}	


