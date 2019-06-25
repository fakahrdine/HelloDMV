package implementop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MurcuryLoginobj {
	WebDriver driver ;
	//create a class for every web page
	//this will call from a test case
	By UserNameBox = By.name("userName");
	By PassWordBox = By.name("password");
	By LoginBoton = By.name("login");
	// we should create a constractor
	
	public MurcuryLoginobj(WebDriver driver1) {
	this.driver = driver1;
	}
	//define the locators for the objects
	
	
//add Method to do actions on this objects{{
	public void adduserName (String text) {
		driver.findElement(UserNameBox).sendKeys(text);
	}
	public void addpassword (String text) {
		driver.findElement(PassWordBox).sendKeys(text);
}
	public void pressLogin () {
		driver.findElement(LoginBoton).click();
}
}