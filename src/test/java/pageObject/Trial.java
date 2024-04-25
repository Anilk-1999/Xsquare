package pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import utilities.WaitHelper;

public class Trial
{
	WebDriver driver;
	
	public WaitHelper wait=new WaitHelper(driver);
	
	@Test(priority = 1)
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://xsquare-customer.tech-active.com/auth");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your registered email']")).sendKeys("anil@techactive.io");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Anil123@#");
		driver.findElement(By.xpath("//button[.='Sign In ']")).click();
		
		Thread.sleep(2000);

//		List<WebElement> sideMain_menues =driver.findElements(By.xpath("//app-sidebar//div/ul/li/a/span"));
//		
//		Thread.sleep(4000);
////		wait.waitElementHelper(sideMain_menues, Duration.ofSeconds(30));
//		
//		
//		int getsize=sideMain_menues.size();
//		System.out.println("size : "+getsize);
//		
//		for(int m=0;m<getsize;m++)
//		{
//			Thread.sleep(2000);
//			
//			WebElement sidemenuOptions=sideMain_menues.get(m);
//			Thread.sleep(5000);
//			String getsidemenueText=sidemenuOptions.getText();
//			System.out.println("options : "+getsidemenueText);
//		
//		}
//		
//		driver.findElement(By.className("profile-circle")).click();
//		
//		Thread.sleep(2000);
//		List<WebElement> elements=driver.findElements(By.xpath("//div[@data-bs-popper='static']/ul/li/a"));
//		for (WebElement elements1 : elements) {
//			String gettext=elements1.getText();
//			System.out.println(gettext);
//		}
		
	}
	
	
	
//	@Test(priority = 2,description = "customer user")
	 public void selectStatus() throws InterruptedException
	  {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='me-2']/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Settings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span/a[.='Users']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button/img[@alt='add-icon']")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("anil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("anilssasd@gmail.com");
		Thread.sleep(2000);
		WebElement permission=driver.findElement(By.xpath("//select[@formcontrolname='DropdownControl']"));

		String getdropdowntext=driver.findElement(By.xpath("(//select[@formcontrolname='DropdownControl']/option)[1]")).getText();
		System.out.println("dropdown placeholder : "+getdropdowntext);
		
		if(getdropdowntext.equalsIgnoreCase("Select Permission Role"))
		{
		Select sel=new Select(permission);
		sel.selectByVisibleText("Verifier");
		Thread.sleep(2000);
		}
	    			   Thread.sleep(2000);
	    			   driver.findElement(By.id("0Status*radio")).click();
	    		
	    	   
	    		   driver.findElement(By.xpath("//button[.='Submit']")).click();
	    		   System.out.println("----test1---");
	    		   Thread.sleep(2000);
	    		   String confirmation=driver.findElement(By.xpath("//div[@id='swal2-html-container']")).getText();
	    		   System.out.println("----test2---");
	    		   System.out.println(confirmation);
	    		  Assert.assertEquals(confirmation, "Congratulations! The User has been added to the system.");
	    	   
	     
	  }
	 
	 @Test(priority = 3,description = "beneficairy")
	 public void beneficiary() throws AWTException, InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[.=' Beneficiaries']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//div[.=' Beneficiaries'])[2]")).click();
		 Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@id='basic-addon1 ']/img")).click();
			Thread.sleep(2000);
			Robot rob=new Robot();
	    	rob.delay(2000);
	    	
	    	StringSelection copyPath=new StringSelection("/home/active30/Downloads/zap/advertiserActions response chart during ST.png");
	    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copyPath, null);
	    	
	    	rob.keyPress(KeyEvent.VK_CONTROL);
	    	rob.keyPress(KeyEvent.VK_V);
	    	rob.keyRelease(KeyEvent.VK_CONTROL);
	    	rob.keyRelease(KeyEvent.VK_V);
	    	
	    	rob.keyPress(KeyEvent.VK_ENTER);
	    	rob.keyRelease(KeyEvent.VK_ENTER);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
