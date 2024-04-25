package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.WaitHelper;

public class SigninPage extends BasePage
{

	public SigninPage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(xpath = "//input[@placeholder='Enter your registered email']")
    WebElement email_field;
	
	private @FindBy(xpath = "//input[@placeholder='Enter your password']")
	WebElement password_field;
	
	private @FindBy(xpath = "//button[.='Sign In ']")
	WebElement signin_button;
	
	private @FindBy(xpath = "//h2[.='Sign in to your account']")
	WebElement signinpage_header;
	
	private @FindBy(xpath = "//a[.='Forgot Password?']")
	WebElement forgot_link;
	
	private @FindBy(xpath = "//span[.='Continue']")
	WebElement continue_button;
	
//	private @FindBy(xpath = "//div[@id='swal2-html-container']")
//	WebElement errorANDcfm_msg;
	
	
	@FindBy(className = "swal2-html-container")
	private WebElement errorANDcnfmMessage;
	
	
	

	WaitHelper wait=new WaitHelper(driver);
	
	public void setEmail(String email)
	{
		wait.waitElementHelper(email_field,Duration.ofSeconds(30));
		email_field.clear();
		email_field.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		wait.waitElementHelper(password_field, Duration.ofSeconds(30));
		password_field.clear();
		password_field.sendKeys(pwd);
	}
	
	public void clickSigninButton()
	{
		wait.waitElementHelper(signin_button, Duration.ofSeconds(30));
		signin_button.click();
	}
	
	public void clickContinueButton()
	{
		wait.waitElementHelper(continue_button, Duration.ofSeconds(30));
		continue_button.click();
	}
	
	public void clickForgotLink()
	{
		wait.waitElementHelper(forgot_link, Duration.ofSeconds(30));
		forgot_link.click();
	}
	
	public String properErrorAndConfirmationMessage()
	{
		wait.waitElementHelper(errorANDcnfmMessage, Duration.ofSeconds(30));
		return errorANDcnfmMessage.getText();
	}

	
	
}
