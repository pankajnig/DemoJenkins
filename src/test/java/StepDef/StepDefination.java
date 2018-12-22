package StepDef;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StepDefination {
	public static WebDriver testdriver;
	public static String testing;
	
	
	@Given("open Browser")
	public void open_Browser() {
		System.out.println(testing);
		testdriver.get("https://www.google.com");
		//Pankaj
	} 
	
	@Given("open Browser2")
	public void open_Browser2() {
		System.out.println(testing);
		testdriver.get("https://www.google.com");
	} 
}
