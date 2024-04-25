package pageObject;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.WaitHelper;

public class DashboardPage extends BasePage
{
	
	public DashboardPage(WebDriver driver)
	{
		super(driver);
	}
	
	WaitHelper wait=new WaitHelper(driver);
	
	private @FindBy(xpath = "//div[@class='profile-circle']/../..")
	WebElement Profile_icon;
	
	private @FindBy(xpath = "//span/img[@alt='notification']")
	WebElement notification_icon;
	
	private @FindBy(xpath = "//div[@data-bs-popper='static']/ul/li/a")
	List<WebElement> profile_dropdownOptns;
	
	private @FindBy(xpath = "//add-button")
	List<WebElement> add_buttons;
	
	private @FindBy(xpath = "//div[.=' See all ']")
	List<WebElement> seeAll_links;
	
	private @FindBy(xpath = "//div[@class='text-lato-semibold fs-5']")
	List<WebElement> activities_texts;
	
	private @FindBy(xpath = "//div[@class='sidebar-brand nobleui-logo']/img")
	WebElement xsquare_icon;
	
	private @FindBy(xpath = "//app-sidebar//div/ul/li/a/span")	
	List<WebElement> sideMain_menues;
	
	private @FindBy(xpath = "//div/h3")
	WebElement page_header;
	
	
	public void clickOnAddButtons(String addBtns)
	{
		try
		{
		wait.waitElementHelper(add_buttons, Duration.ofSeconds(30));
		int getsize=add_buttons.size();
		
		for(int b=0;b<getsize;b++)
		{
			wait.waitElementHelper(add_buttons, Duration.ofSeconds(30));
			 WebElement buttons = add_buttons.get(b);
			 
			 String getbuttonText=buttons.getText();
			 
			 if(getbuttonText.equalsIgnoreCase(addBtns))
			 {
				 wait.waitElementHelper(buttons, Duration.ofSeconds(30));
				 buttons.click();
			 }
		}
		}
		catch(Exception e)
		{
			System.out.println("The exception : "+e);
		}
	}
	
	public void cliskOnsideMainMenus(String mainMenus)
	{
		try
		{
		wait.waitElementHelper(sideMain_menues, Duration.ofSeconds(30));
		int getsize=sideMain_menues.size();
		System.out.println("size : "+getsize);
		
		for(int m=0;m<getsize;m++)
		{
			wait.waitElementHelper(sideMain_menues, Duration.ofSeconds(30));
			WebElement sidemenuOptions=sideMain_menues.get(m);
			wait.waitElementHelper(sidemenuOptions, Duration.ofSeconds(30));
			String getsidemenueText=sidemenuOptions.getText();
			System.out.println("main menu options : "+getsidemenueText);
			
			if(getsidemenueText.equalsIgnoreCase(mainMenus))
			{
				wait.waitElementHelper(sidemenuOptions, Duration.ofSeconds(30));
				sidemenuOptions.click();
				break;
			}
		}
		}
		catch(Exception e)
		{
		  System.out.println(e);	
		}
		
	}
	
	public void profiledropdownOptions(String profileOptn)
	{
		try
		{
		for (WebElement profileOptions : profile_dropdownOptns) 
		{
			System.out.println("issue check");
			wait.waitElementHelper(profileOptions, Duration.ofSeconds(30));
			String getPrfOptionstext=profileOptions.getText();
			System.out.println(getPrfOptionstext);
			
			if(getPrfOptionstext.equalsIgnoreCase(profileOptn))
			{
				wait.waitElementHelper(profileOptions, Duration.ofSeconds(30));
				profileOptions.click();
				break;
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void ClickOnProfileIcon()
	{
		wait.waitElementHelper(Profile_icon, Duration.ofSeconds(30));
		Profile_icon.click();
	}
	
	public void clickOnNotificationIcon()
	{
		wait.waitElementHelper(notification_icon, Duration.ofSeconds(30));
		notification_icon.click();
	}
	
	public void clickXSquareIcon()
	{
		wait.waitElementHelper(xsquare_icon, Duration.ofSeconds(30));
		xsquare_icon.click();
	}
	
	public void clickOnSeeAllLink(String activitiesText)
	{
		for(WebElement activities: activities_texts)
		{
			wait.waitElementHelper(activities, Duration.ofSeconds(30));
			String getactivitiesText=activities.getText();
			for(WebElement seeAllLink: seeAll_links)
			{
			  if(getactivitiesText.equalsIgnoreCase(activitiesText))
			  {
				wait.waitElementHelper(seeAllLink, Duration.ofSeconds(30));
				seeAllLink.click();
			  }
			}
		}
	}
	
	public String getPageHeader()
	{
		wait.waitElementHelper(page_header, Duration.ofSeconds(30));
		return page_header.getText();
	}
	
	
	
}
