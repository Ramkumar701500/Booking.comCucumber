package LoginStepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectModels.LoginPageObjectModel;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFeatureSteps 
{
	WebDriver driver;
	
	LoginPageObjectModel login;
	
	@Given("Launch the browser")
	public void launch_the_browser() 
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		login = new LoginPageObjectModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@Given("Open the login url {string}")
	public void open_the_login_url(String url) 
	{
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Then("Enter valid email address as {string}")
	public void enter_valid_email_address_as(String email)
	{
		login.setUsername(email);
	}

	@Then("Click on continue button")
	public void click_on_continue_button() 
	{
		login.clickContinueButton();
	}

	@Then("Enter valid password as {string}")
	public void enter_valid_password_as(String password) 
	{
		login.setPassword(password);
	}

	@Then("Click on sign in button")
	public void click_on_sign_in_button() 
	{
		login.clickSignInButton();
	}

	@Then("Enter invalid email address as {string}")
	public void enter_invalid_email_address_as(String email)
	{
		login.setUsername(email);
	}

	@Then("Enter invalid password as {string}")
	public void enter_invalid_password_as(String password) 
	{
		login.setPassword(password);
	}

	@Then("Enter blank password as {string}")
	public void enter_blank_password_as(String password) 
	{
		login.setPassword(password);
	}

	@Then("Enter blank email address as {string}")
	public void enter_blank_email_address_as(String email)
	{
		login.setUsername(email);
	}
	
	@Then("Click on Terms & conditions link")
	public void click_on_terms_conditions_link() 
	{
		login.clickTermsAndConditions();
	}

	@Then("Click on Click on Privacy statement link")
	public void click_on_click_on_privacy_statement_link_link() 
	{
		login.clickPrivacyStatement();
	}
}
