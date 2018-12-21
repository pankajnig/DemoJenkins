package Runner;



import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import StepDef.StepDefination;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		features = "Features",
	    glue = {"StepDef"},
	    tags= {"@Test1"},
	    monochrome = true

		)


public class AppTest extends AbstractTestNGCucumberTests{
	public static WebDriver driver;
	AppTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JARVIS\\Desktop\\Driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  StepDefination.testdriver = driver;
		  StepDefination.testing="Chrome";
	}
}
