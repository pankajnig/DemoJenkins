package Runner;



import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import StepDef.StepDefination;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		features = "Features",
	    glue = {"StepDef"},
	    tags= {"@Test2"},
	    monochrome = true

		)


public class AppTest2 extends AbstractTestNGCucumberTests{
	public static WebDriver driver;
	AppTest2(){
		System.setProperty("webdriver.ie.driver", "C:\\Users\\JARVIS\\Desktop\\Driver\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
		  StepDefination.testdriver = driver;
		  StepDefination.testing="IE";
	}
}
