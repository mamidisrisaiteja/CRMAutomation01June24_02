package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	private WebDriver driver;// this is the local iv of LoginPage
	

	
	private By emailId=By.xpath("//input[@name='email']");
	
	private By password=By.cssSelector("input[name='password']");
	
	private By submitButton=By.cssSelector("div.ui.fluid.large.blue.submit.button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void userEntersUSerNameAndPassword() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(emailId).sendKeys("mamidisrisaiteja@gmail.com");
		driver.findElement(password).sendKeys("Srisai@90"); 
		
		 //
	}
	public HomePage userClicksSubmitButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(submitButton).click(); 
		return new HomePage();
		 
	}

}
