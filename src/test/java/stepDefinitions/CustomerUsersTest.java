package stepDefinitions;

import org.testng.Assert;
import io.cucumber.java.en.*;
import pageObject.CustomerUsersPage;
import pageObject.DashboardPage;
import pageObject.SigninPage;
import testBase.BaseClass;

public class CustomerUsersTest extends BaseClass
{

	/*-------------------------------------Add customer users-----------------------------------*/
	
	
	@When("Clicks on the setting link")
	public void clicks_on_the_setting_link() 
	{
		customerUser=new CustomerUsersPage(driver);
	    signin=new SigninPage(driver);
	    dashboard=new DashboardPage(driver);
	    dashboard.profiledropdownOptions("Settings");
	  
	}

	@Then("Verify that the customer should be redirected to the setting page")
	public void verify_that_the_customer_should_be_redirected_to_the_setting_page() 
	{
	   Assert.assertEquals(dashboard.getPageHeader(), "Settings");
	}

	@When("Clicks on the user tab")
	public void clicks_on_the_user_tab() throws InterruptedException 
	{
		Thread.sleep(1000);
		customerUser.clickonSettingTabs("Users");
	}

	@Then("Verify the customer should be redirected into user home page")
	public void verify_the_customer_should_be_redirected_into_user_home_page() 
	{
       Assert.assertEquals(customerUser.addButtonisDisplayed(), true);
	}

	@When("Click on the Add new user button")
	public void click_on_the_add_new_user_button() 
	{
	    customerUser.clickOnAddButton();
	}

	@Then("Verify that the add user page should have a proper page header")
	public void verify_that_the_add_user_page_should_have_a_proper_page_header() 
	{
	   Assert.assertEquals(customerUser.getSettingPageHeader(), "Add User");
	}

	@When("Enter all the required fields")
	public void enter_all_the_required_fields() throws InterruptedException 
	{
        customerUser.setUserName(randomFullName());
        customerUser.setEmail(randomEmail());
        customerUser.selectOptionsOnDropdown("Select Permission Role","Verifier");
        customerUser.selectStatus("Active");
	}

	@When("Click on submit button")
	public void click_on_submit_button() 
	{
	    customerUser.clickOnSubmitButton();
	}

	@Then("Verify the user should be created with the confirmation message")
	public void verify_the_user_should_be_created_with_the_confirmation_message() 
	{
	   Assert.assertEquals(signin.properErrorAndConfirmationMessage(), "Congratulations! The User has been added to the system.");
	}

	@Then("Verify that the newly created user is displayed in the user list")
	public void verify_that_the_newly_created_user_is_displayed_in_the_user_list() 
	{
	    customerUser.findNameInList();
	}

	@When("Select a inactive status")
	public void select_a_inactive_status() 
	{
	    customerUser.selectStatus("InActive");
	}

	@Then("Veify that the newly created inactive user is displayed in the user list")
	public void veify_that_the_newly_created_inactive_user_is_displayed_in_the_user_list() 
	{
	   Assert.assertEquals(customerUser.findNameInList(), true);
	}

	@When("Keep all the required fields are empty")
	public void keep_all_the_required_fields_are_empty()
	{
	   customerUser.setUserName("");
	   customerUser.setEmail("");
	   customerUser.selectStatus("Active");
	}

	@Then("Make sure that all the mandatory fields should get highlighted with the proper error message")
	public void make_sure_that_all_the_mandatory_fields_should_get_highlighted_with_the_proper_error_message() 
	{
	    Assert.assertEquals(signin.properErrorAndConfirmationMessage(), "Please complete all the mandatory fields before submitting the form");
	}

	@When("Click on cancel button")
	public void click_on_cancel_button() 
	{
	    customerUser.clickOnCancelButton();
	}

	@Then("Verify that the customer should be redirected to the user home page")
	public void verify_that_the_customer_should_be_redirected_to_the_beneficiary_home_page() 
	{
	    Assert.assertEquals(customerUser.addButtonisDisplayed(), true);
	}
	
	
	/*-------------------------------------Update customer users-----------------------------------*/
	
	
	@When("Click on the kebab menu")
	public void click_on_the_kebab_menu() 
	{
	    customerUser.clickOnKebebMenuBasedOnName();
	}

	@When("Click on Edit option on the action popup")
	public void click_on_edit_option_on_the_action_popup() 
	{
	   customerUser.clickOnActionOption("Edit");
	}

	@Then("Verify that the edit user page should have a proper page header")
	public void verify_that_the_edit_user_page_should_have_a_proper_page_header() 
	{
	   Assert.assertEquals(customerUser.getSettingPageHeader(),"Update User");
	}

	@When("Modify all the required fields")
	public void modify_all_the_required_fields() throws InterruptedException 
	{
		Thread.sleep(1000);
	   customerUser.setUserName(randomFullName());
	   customerUser.setEmail(randomEmail());
	   customerUser.selectOptionsOnDropdown("Select Permission Role","Approver");
	   customerUser.selectStatus("Active");
	}

	@When("Click on update button")
	public void Click_on_update_button()
	{
		customerUser.clickOnUpdateBtn();
	}
	
	@Then("Verify the user should be updated with the confirmation message")
	public void verify_the_user_should_be_updated_with_the_confirmation_message()
	{
	    Assert.assertEquals(signin.properErrorAndConfirmationMessage(), "Congratulations! The changes have been saved.");
	}

	@Then("Verify that the updated user is displayed in the user list")
	public void verify_that_the_updated_user_is_displayed_in_the_user_list() 
	{
	   Assert.assertEquals(customerUser.findNameInList(), true);
	}
	
	
	/*-------------------------------------------------Customer user home page----------------------------------------*/
	
	@When("Click on the filter button")
	public void click_on_the_filter_button() 
	{
	   customerUser.clickOnFilter();
	}

	@When("Select the active status")
	public void select_the_active_status() 
	{
	    customerUser.selectOptionsOnDropdown("Select Status","Active");
	}

	@Then("Verify that Only active users should be displayed in the user list")
	public void verify_that_only_active_users_should_be_displayed_in_the_user_list() 
	{
	    Assert.assertEquals(customerUser.statusFilter("Active"), true);
	}

	@When("Select the inactive status")
	public void select_the_inactive_status() 
	{
	   customerUser.selectOptionsOnDropdown("Select Status","In Active");
	}

	@Then("Verify that Only inactive users should be displayed in the user list")
	public void verify_that_only_inactive_users_should_be_displayed_in_the_user_list() 
	{
	   Assert.assertEquals(customerUser.statusFilter("In Active"), true);
	}
	
	@When("Enter the customer user name into search field and click on enter key")
	public void When_Enter_the_customer_user_name_into_search_field_and_click_on_enter_key()
	{
		customerUser.searching("test");
	}
	
	@Then("Verify that the searched user name should be displayed in the user list")
	public void Then_Verify_that_the_searched_user_name_should_be_displayed_in_the_user_list()
	{
		
	}
	
	
	
	
}
