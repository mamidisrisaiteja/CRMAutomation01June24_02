package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
glue = {"stepDefinitions","ApplicationHooks.java"},
plugin= {"pretty","json:target/report2.json"},
monochrome = true,
publish=true)

public class TestRunner {
	

}
