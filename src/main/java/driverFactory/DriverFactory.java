package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private WebDriver driver;
	
	private static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();
	
	// it helps in creating threads for each browser, we can acheive multi browser teszting using thread local
	
	public WebDriver int_driver() {
		WebDriverManager.chromedriver().setup();
		tlDriver.set(new ChromeDriver());
		//using multi threading if we want to set driver object we will use this tlDriver.setMethod
		
		return getDriver();
	}
public static synchronized WebDriver getDriver() {
	return tlDriver.get();
// using multi threading if we want a driver object we will use this	tlDriver.getMethod	
	}
	

}
