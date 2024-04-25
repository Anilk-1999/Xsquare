package pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitHelper;

public class CustomerUsersPage extends BasePage
{
  public CustomerUsersPage(WebDriver driver)
  {
	  super(driver);
  }
  
  WaitHelper wait=new WaitHelper(driver);
  
  private @FindBy(xpath = "//span/a")
  List<WebElement> setting_tabs;
  
  private @FindBy(xpath = "//input[@placeholder='Search']")
  WebElement search_textfield;
  
  private @FindBy(xpath = "//button/img[@alt='add-icon']")
  WebElement Add_btn;
  
  private @FindBy(xpath = "//button[.=' Filter']")
  WebElement filter_button;
  
  private @FindBy(xpath = "//div/img[@alt='cancel_icon']")
  WebElement cancel_icon;
  
  private @FindBy(xpath = "//select[@formcontrolname='DropdownControl']")
  WebElement dropdowns;
  
  private @FindBy(xpath = "//button[.='Submit']")
  WebElement submit_btn;
  
  private @FindBy(xpath = "//div/b")
  List<WebElement> userName_inList;
  
  private @FindBy(xpath = "//section//div/p[@class='text-color-gray10 fs-14 fw-normal text-break']")
  List<WebElement> useremail_inList;
  
  private @FindBy(xpath = "//section//div/p[@class='text-color-black2 fs-14 fw-normal']")
  List<WebElement> status_inList;
  
  private @FindBy(xpath = "(//div/a[@id='dropdown'])[1]")
  WebElement kebabmenu_icon;
  
  private @FindBy(xpath = "//div[@class='menuDropdown dropdown-menu show']/div")
  List<WebElement> action_optns;  
  
  private @FindBy(xpath = "//div/h5")
  WebElement settingPage_header;
  
  private @FindBy(xpath = "//button[.=' Cancel']")
  WebElement cancel_btn;
  
  private @FindBy(xpath = "//input[@placeholder='Full Name']")
  WebElement name_textfield;
  
  private @FindBy(xpath = "//input[@placeholder='Email']")
  WebElement email_textfield;
  
  private @FindBy(id = "0Status*radio")
  WebElement activeStatus_radioBtn;
  
  private @FindBy(id = "1Status*radio")
  WebElement inActiveStatus_radioBtn;
  
  private @FindBy(xpath = "//label[.=' Active ']")
  WebElement activestatus_label;
  
  private @FindBy(xpath = "//label/img")
  WebElement role_tooltip;
  
  private @FindBy()
  WebElement loadMore_btn;
  
  private @FindBy(xpath = "//button[.='Update']")
  WebElement update_btn;
  
  private @FindBy(xpath = "(//select[@formcontrolname='DropdownControl']/option)[1]")
  WebElement dropdown_placeholder;
  
   
  
  public void clickonSettingTabs(String settingTab)
  {
	 try 
	 {
	  for(WebElement tabs:setting_tabs)
	  {
		  wait.waitElementHelper(tabs, Duration.ofSeconds(30));
		  String gettabText=tabs.getText();
		  if(gettabText.equalsIgnoreCase(settingTab))
		  {
			  wait.waitElementHelper(tabs, Duration.ofSeconds(30));
			  tabs.click();
		  }
	  }
	 }catch(Exception e)
	 {
		System.out.println(e); 
	 }
  }
  
  public void searching(String name)
  {
	  wait.waitElementHelper(search_textfield, Duration.ofSeconds(30));
	  search_textfield.clear();
	  search_textfield.sendKeys(name);
  }
  
  public void clickOnAddButton()
  {
	  wait.waitElementHelper(Add_btn, Duration.ofSeconds(30));
	  Add_btn.click();
  }
  
  public void clickOnCancelButton()
  {
	  wait.waitElementHelper(cancel_btn, Duration.ofSeconds(30));
	  cancel_btn.click();
  }
  
  public void clickOnSubmitButton()
  {
	  wait.waitElementHelper(submit_btn, Duration.ofSeconds(30));
	  submit_btn.click();
  }
  
  public void clickOncancelIcon()
  {
	  wait.waitElementHelper(cancel_icon, Duration.ofSeconds(30));
	  cancel_icon.click();
  }
  
  public void clickOnMainFilter()
  {
	  wait.waitElementHelper(filter_button, Duration.ofSeconds(30));
	  filter_button.click();
  }
  
  public void selectOptionsOnDropdown(String dropdownName,String option)
  {
	  String placeholder=dropdown_placeholder.getText();
	  
	  if(placeholder.equalsIgnoreCase(dropdownName))
	  {
	  wait.waitElementHelper(dropdowns, Duration.ofSeconds(30));
	  Select selectoption=new Select(dropdowns);
	  selectoption.selectByVisibleText(option);
	  }
  }
  
  public void clickOnKebebMenuBasedOnName()
  {
	  wait.waitElementHelper(kebabmenu_icon, Duration.ofSeconds(30));
	  kebabmenu_icon.click();
	  
  }
  
  public void clickOnActionOption(String action)
  {
	  try
	  {
	  for(WebElement actionOptions:action_optns)
	  {
		  wait.waitElementHelper(actionOptions, Duration.ofSeconds(30));
		  String getactionText=actionOptions.getText();
		  if(getactionText.equalsIgnoreCase(action))
		  {
			  wait.waitElementHelper(actionOptions, Duration.ofSeconds(30));
			  actionOptions.click();
		  }
	  }
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
  	
  public String getSettingPageHeader()
  {
	  wait.waitElementHelper(settingPage_header, Duration.ofSeconds(30));
	  return settingPage_header.getText();
  }
  
  String getName;
  
  public void setUserName(String name)
  {
	  wait.waitElementHelper(name_textfield, Duration.ofSeconds(30));
	  name_textfield.clear();
	  name_textfield.sendKeys(name);
	  
	  getName=name;
	  System.out.println("user name parameter :"+getName);
  }
  
  public void setEmail(String email)
  {
	  wait.waitElementHelper(email_textfield, Duration.ofSeconds(30));
	  email_textfield.clear();
	  email_textfield.sendKeys(email);
	  
  }
  
  public void selectStatus(String setstatus)
  {
	  wait.waitElementHelper(activestatus_label, Duration.ofSeconds(30));
	  String getStatusText=activestatus_label.getText();
	  
	   if(getStatusText.equalsIgnoreCase(setstatus))
	   {
		   wait.waitElementHelper(activeStatus_radioBtn, Duration.ofSeconds(30));
		   activeStatus_radioBtn.click();
	   }
	   else
	   {
		   wait.waitElementHelper(inActiveStatus_radioBtn, Duration.ofSeconds(30));
		   inActiveStatus_radioBtn.click();
	   }
  }
  
  public void clickOnRoleTooltip()
  {
	  wait.waitElementHelper(role_tooltip, Duration.ofSeconds(30));
	  role_tooltip.click();
  }
  
  public void clickOnLoadMoreBtn()
  {
	  wait.waitElementHelper(loadMore_btn, Duration.ofSeconds(30));
	  loadMore_btn.click();
  }
  
  public boolean addButtonisDisplayed()
  {
	  return Add_btn.isDisplayed();
  }
  
  public void clickOnUpdateBtn()
  {
	  wait.waitElementHelper(update_btn, Duration.ofSeconds(30));
	  update_btn.click();
  }
  
  public boolean findNameInList()
  {
	  boolean status=true;
	  for(WebElement names:userName_inList)
	  {
		  String getNameinList=names.getText();
		  System.out.println("list name: "+getNameinList);
		  
		  if(getNameinList.equalsIgnoreCase(getName))
		  {
			 System.out.println("The user name is present!");
			 break;
		  }
		  else
		  {
			  System.out.println("The user name is not present!");
		  }
	  }
	return status;
  }
  
  public void clickOnFilter()
  {
	  wait.waitElementHelper(filter_button, Duration.ofSeconds(30));
	  filter_button.click();
  }
  
  public boolean statusFilter(String statusName)
  {
	  boolean statuslist = true;
	  for(WebElement status:status_inList)
	  {
		  String getStatus=status.getText();
		  if(getStatus.equalsIgnoreCase(statusName))
		  {
			 statuslist=true;
		  }
	  }
	  return statuslist;
  }
  
}
