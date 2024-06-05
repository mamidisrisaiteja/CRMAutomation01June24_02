package stepDefinitions;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	
	@Before(order=0)
	public void launchBrowser() {
		
		driverFactory=new DriverFactory();
		driver=driverFactory.int_driver();
		
		
	}


	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
}
