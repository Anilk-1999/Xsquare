package pageObject;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.WaitHelper;


public class BeneficiariesPage extends BasePage
{

	public BeneficiariesPage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Company Name']")
	WebElement cmpnyName_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Contact Name']")
	WebElement contactName_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='IBAN']")
	WebElement iban_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Mobile Number']")
	WebElement mobile_textfield;
	
	private @FindBy(xpath = "//label[@for='Update KYC']")
	WebElement kycUpload_field;
	
	
	WaitHelper wait=new WaitHelper(driver);

	
	public void enterEmail(String email)
	{
		wait.waitElementHelper(email_textfield, Duration.ofSeconds(30));
		email_textfield.clear();
		email_textfield.sendKeys(email);
	}
	
	public void enterCompaanyName(String cmnyName)
	{
		wait.waitElementHelper(cmpnyName_textfield, Duration.ofSeconds(30));
		cmpnyName_textfield.clear();
		cmpnyName_textfield.sendKeys(cmnyName);
	}
	
	public void enterContactName(String contactName)
	{
		wait.waitElementHelper(contactName_textfield, Duration.ofSeconds(30));
		contactName_textfield.clear();
		contactName_textfield.sendKeys(contactName);
	}
	
	public void enterIban(String ibanNumber)
	{
		wait.waitElementHelper(iban_textfield, Duration.ofSeconds(30));
		iban_textfield.clear();
	    iban_textfield.sendKeys(ibanNumber);
	}
	
	public void enterMobileNumber(String number)
	{
		wait.waitElementHelper(mobile_textfield, Duration.ofSeconds(30));
		mobile_textfield.clear();
		mobile_textfield.sendKeys(number);
	}
	
	public void uploadKYCfile(String imagePath) throws AWTException
	{
		wait.waitElementHelper(kycUpload_field, Duration.ofSeconds(30));
		kycUpload_field.click();
		
		Robot rob=new Robot();
    	rob.delay(2000);
    	
    	StringSelection copyPath=new StringSelection(imagePath);
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copyPath, null);
    	
    	rob.keyPress(KeyEvent.VK_CONTROL);
    	rob.keyPress(KeyEvent.VK_V);
    	rob.keyRelease(KeyEvent.VK_CONTROL);
    	rob.keyRelease(KeyEvent.VK_V);
    	
    	rob.keyPress(KeyEvent.VK_ENTER);
    	rob.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
