package testBase;

import java.time.Duration;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.CustomerUsersPage;
import pageObject.DashboardPage;
import pageObject.SigninPage;



public class BaseClass 
{
	public static WebDriver driver;
	public SigninPage signin;
	public DashboardPage dashboard;
	public CustomerUsersPage customerUser;
	
	@BeforeMethod
	public void browserSetup()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void quitBrowser()
	{
		driver.quit();
	}
	
	
	
	public String randomFullName()
	{
		String randomName=RandomStringUtils.random(4,"abcdefghijklmnopqrstuvwxyz");
		return "Test "+randomName;
	}
	
	public String randomEmail()
	{
		String randomMail=RandomStringUtils.random(3, "abcdefghijklmnopqrstuvwxyz");
		return "test"+randomMail+"@gmail.com";
	}
	
	public String randomName()
	{
		String randomName=RandomStringUtils.random(2, "abcdefghijklmnopqrstuvwxyz");
		return "Test"+randomName;
	}
	
	public String randomMobileNumber()
	{
		String randomNumber=RandomStringUtils.randomNumeric(6);
		return "9635"+randomNumber;
	}
	

}
