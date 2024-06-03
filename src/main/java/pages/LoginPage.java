package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name = "name")
	WebElement userName;
	
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath ="//div[@class='ui fluid large blue submit button']")
	WebElement loginButton;


}
