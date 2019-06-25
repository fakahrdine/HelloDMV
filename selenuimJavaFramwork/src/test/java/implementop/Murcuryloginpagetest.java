package implementop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// in this one we will create our test case fo login page wivh will depend on using MPO
public class Murcuryloginpagetest {
	public static WebDriver driver;
	
	
public static void main(String[] args) {
	Murcurylogintest();
	
}
public static void Murcurylogintest() { //call this function from the main methode otherwise the code will not work
	System.setProperty("webdriver.chrome.driver","C:\\Users\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 MurcuryLoginobj Logipanobj = new MurcuryLoginobj(driver);
	 //start creating my tests 
	 driver.get("http://newtours.demoaut.com/");
	 Logipanobj.adduserName("fakhar");
	 Logipanobj.addpassword("59Mohame");
	 Logipanobj.pressLogin();
	
	 
}

}
