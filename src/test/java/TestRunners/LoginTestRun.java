package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features = ".//Features/Login.feature",
	glue = "LoginStepDefinitions",
	plugin = {"pretty", "html:Test Reports/Login Test Report"},
	monochrome = true,
	dryRun = false
)
public class LoginTestRun 
{
	
}
