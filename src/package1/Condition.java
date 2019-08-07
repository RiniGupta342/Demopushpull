package package1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Condition 
{
	WebDriver driver;
	@BeforeClass
	public void preCondition()
	{
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);
		options.setCapability("PLATFORM_NAME", "Windows");
		driver = new RemoteWebDriver(options);
//		driver.get("http://laptop-21f1lvaq/login.do");
	}
	
	@AfterClass
	public void postCondition()
	{
		driver.close();
	}
}
