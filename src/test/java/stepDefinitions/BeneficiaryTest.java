package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObject.CustomerUsersPage;
import pageObject.DashboardPage;
import testBase.BaseClass;

public class BeneficiaryTest extends BaseClass
{

	@When("The customer clicks on the Beneficiaries option in the side menu")
	public void the_customer_clicks_on_the_beneficiaries_option_in_the_side_menu() 
	{
	   customerUser=new CustomerUsersPage(driver);
	   dashboard=new DashboardPage(driver);
	   dashboard.cliskOnsideMainMenus("Beneficiaries");
	}

	@Then("Verify the customer should be redirected into beneficiaries home page")
	public void verify_the_customer_should_be_redirected_into_beneficiaries_home_page() 
	{
	    Assert.assertEquals(dashboard.getPageHeader(), "Beneficiaries");
	}

	@When("Click on Add Beneficiary button")
	public void click_on_add_beneficiary_button() 
	{
	    dashboard.clickOnAddButtons("Beneficiaries");
	}

	@Then("Verify that the add beneficiary page should have a proper page header")
	public void verify_that_the_add_beneficiary_page_should_have_a_proper_page_header() 
	{
	    
	}

	@When("Enter all the required data")
	public void enter_all_the_required_data() 
	{
	    
	}

	@Then("Verify the beneficiary should be created with the confirmation message")
	public void verify_the_beneficiary_should_be_created_with_the_confirmation_message() 
	{
	  
	}

	@Then("Verify that the customer should be redirected into customer home page")
	public void verify_that_the_customer_should_be_redirected_into_customer_home_page()
	{
	    
	}

	@Then("Verify that the newly created beneficiary is displayed in the list")
	public void verify_that_the_newly_created_beneficiary_is_displayed_in_the_list() 
	{
	   
	}
	
}
