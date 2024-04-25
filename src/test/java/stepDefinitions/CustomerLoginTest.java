package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObject.DashboardPage;
import pageObject.SigninPage;
import testBase.BaseClass;

public class CustomerLoginTest extends BaseClass
{
	
	@Given("Customer launch the browser")
	public void customer_launch_the_browser() 
	{
		browserSetup();
		
		signin=new SigninPage(driver);
	    dashboard=new DashboardPage(driver);
		
	}

	@When("Enter a url as {string}")
	public void enter_the_url_as(String url) 
	{
	  driver.get(url);
	}

	@When("Enter valid email as {string} and password as {string}")
	public void enter_valid_email_as_and_password_as(String email, String password) 
	{
		signin.setEmail(email);
	    signin.setPassword(password);
	}

	@When("Click on a signin button")
	public void click_on_the_signin_button() 
	{
	    signin.clickSigninButton();
	}

	@Then("Verfy the customer should be redirected to the customer dashboard with the confirmation Message")
	public void verfy_the_customer_should_be_redirected_to_the_customer_dashboard_with_the_confirmation_Message() 
	{
       Assert.assertEquals(signin.properErrorAndConfirmationMessage(), "Welcome! You have successfully logged into your account.");
	}

	@When("Click on the MyProfile icon")
	public void click_on_the_my_profile_icon() 
	{
	   dashboard.ClickOnProfileIcon();
	}

	@When("Click on the logout")
	public void click_on_the_logout() 
	{
	    dashboard.profiledropdownOptions("Log Out");
	}

	@Then("Make sure the customer should successfully logout from the customer portal with the confirmation")
	public void make_sure_the_customer_should_successfully_logout_from_the_customer_portal_with_the_confirmation() 
	{
//	   Assert.assertEquals(signin.properErrorAndConfirmationMessage(), "");
	}

	@Then("Close the browser")
	public void close_the_browser() 
	{
	   quitBrowser();
	}

	@When("Enter invalid email as {string} and invalid password as {string}")
	public void enter_invalid_email_as_and_invalid_password_as(String email, String password) 
	{
	   signin.setEmail(email);
	   signin.setPassword(password);
	}

	@Then("Verify the proper error message should be displayed")
	public void verify_the_proper_error_message_should_be_displayed() 
	{
	   Assert.assertEquals(signin.properErrorAndConfirmationMessage(), "Invalid login credentials. Please check email address & password");
	}

	@When("Keep email and password fields as empty")
	public void keep_email_and_password_fields_as_empty()
	{
	    signin.setEmail("");
	    signin.setPassword("");
	}

	@When("Enter valid email as {string} and invalid password as {string}")
	public void enter_valid_email_as_and_invalid_password_as(String email, String password)
	{
	    signin.setEmail(email);
	    signin.setPassword(password);
	}

	@When("Enter invalid email as {string} and valid password as {string}")
	public void enter_invalid_email_as_and_valid_password_as(String email, String password) 
	{
	   signin.setEmail(email);
	   signin.setPassword(password);
	}

	@When("Keep email field as empty")
	public void keep_email_field_as_empty() 
	{
	    signin.setEmail("");
	}

	@When("Enter password as {string}")
	public void enter_password_as(String password) 
	{
	    signin.setPassword(password);
	}

	@When("Enter email as {string}")
	public void enter_email_as(String email) 
	{
	    signin.setEmail(email);
	}

	@When("Keep password field as empty")
	public void keep_password_field_as_empty() 
	{
	    signin.setPassword("");
	}
	@When("Enter unregistered email as {string} and password as {string}")
	public void enter_unregistered_email_as_and_password_as(String email, String password) 
	{
	   signin.setEmail(email);
	   signin.setPassword(password);
	}

	@Then("Make sure that the proper error message should be displayed")
	public void make_sure_that_the_proper_error_message_should_be_displayed() 
	{
	   Assert.assertEquals(signin.properErrorAndConfirmationMessage(), "Not an existing user.");
	}
	
}
