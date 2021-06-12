package RegisterStepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectModels.RegisterPageObjectModel;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterFeatureSteps 
{
	WebDriver driver;
	
	RegisterPageObjectModel register;
	
	@Given("Launch the browser \\(register page)")
	public void launch_the_browser() 
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		register = new RegisterPageObjectModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@Given("Open the register url {string}")
	public void open_the_register_url(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Then("Enter valid email address as {string} \\(register page)")
	public void enter_valid_email_address_as_register_page(String email) 
	{
		register.setUsername(email);
	}

	@Then("Click on continue button \\(register page)")
	public void click_on_continue_button() 
	{
		register.clickContinueButton();
	}

	@Then("Enter valid password as {string} \\(register page)")
	public void enter_valid_password_as_register_page(String password)
	{
		register.setPassword(password);
	}

	@Then("Confirm same password as {string}")
	public void confirm_same_password_as(String password)
	{
		register.setConfirmPassword(password);	
	}

	@Then("Click on create account button")
	public void click_on_create_account_button() 
	{
		register.clickCreateAccountButton();
	}

	@Then("Enter invalid email address as {string} \\(register page)")
	public void enter_invalid_email_address_as_register_page(String email) 
	{
		register.setUsername(email);
	}

	@Then("Enter invalid password as {string} \\(register page)")
	public void enter_invalid_password_as_register_page(String password)
	{
		register.setPassword(password);
	}

	@Then("Enter blank email address as {string} \\(register page)")
	public void enter_blank_email_address_as_register_page(String email)
	{
		register.setUsername(email);
	}

	@Then("Click on Terms & conditions link \\(register page)")
	public void click_on_terms_conditions_link() 
	{
		register.clickTermsAndConditions();
	}

	@Then("Click on Click on Privacy statement link \\(register page)")
	public void click_on_click_on_privacy_statement_link() 
	{
		register.clickPrivacyStatement();
	}
}
