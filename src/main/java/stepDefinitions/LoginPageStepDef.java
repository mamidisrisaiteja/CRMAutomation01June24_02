package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginPageStepDef {
	WebDriver driver;
	
	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());//0. Fully loaded driver will come from driver factgory
	//this driver is being passed to LoginPageClass, this willbe initialized by the login page consturctor
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		DriverFactory.getDriver().get("https://ui.cogmento.com/");
		
	}
	
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		loginPage.userEntersUSerNameAndPassword();
	
	}
	@When("user clicks submit button")
	public void user_clicks_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.userClicksSubmitButton();
		 //
	}
	@Then("user is able to move to loginpage")
	public void user_is_able_to_move_to_loginpage() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("in login page");
	}






}
