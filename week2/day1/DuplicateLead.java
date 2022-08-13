package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//UserName
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		//Password
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");
		//Login Button Click
		WebElement elementSubmit = driver.findElement(By.className("decorativeSubmit"));
		elementSubmit.click();
		
		//get Welcome message
		
		WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
		String WelcomeText = elementWelcomeMessage.getText();
		System.out.println(WelcomeText);
		
		if(WelcomeText.contains("Welcome"))
		{
			System.out.println("Login Successfull");
			
		}
		else
		{
			System.out.println("Login Unsuccessfull");
		}
		
		// CRM link
		WebElement elementCRMlink = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMlink.click();
		
		//Click on the leads Tab
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		//Create Leads link
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		//Company name
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName")); 
		elementCompanyName.sendKeys("Test Leaf");
		
		//First Name
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Test");
		
		//Last name
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Leaf1");
		
		//First name (local)
		
		WebElement elementFirstNameLocal = driver.findElement(By.name("firstNameLocal"));
		elementFirstNameLocal.sendKeys("Test");
		
		//Description
		
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("This is to set the description for testing purpose");
		
		//Source drop down
		WebElement elementSourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		elementSourceDropDown.sendKeys("Website");
		
		// Industry drop Down by index
		WebElement elementIndustryDropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd = new Select(elementIndustryDropDown);
		
		dd.selectByIndex(3);
		
		// Ownership Drop down by visible text
		
		WebElement elementOwnershipDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd1 = new Select(elementOwnershipDropDown);
		dd1.selectByVisibleText("Corporation");
		
		// Marketing Campaign Drop down
		
		WebElement elementCampaignDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 = new Select(elementCampaignDropDown);
		dd2.selectByValue("9002");
		
		//Email
		
		WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("test@test.com");
		
		//Stateprovince
		
		WebElement elementStateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd3 = new Select(elementStateDropdown);
		dd3.selectByValue("NY");
		
		
		
		
		// Create Lead button
		
		WebElement elementCreateLeadButton = driver.findElement(By.className("smallSubmit"));
		elementCreateLeadButton.click();
		
		
		//Title
		
		String title = driver.getTitle();
		System.out.println("The Title of this page is:" + title);
		
		// Duplicate Lead
		
		WebElement elementDuplicate = driver.findElement(By.linkText("Duplicate Lead"));
	    elementDuplicate.click();
	    
	    // Clear Companyname
	    WebElement elementCompanyNameClear = driver.findElement(By.id("createLeadForm_companyName"));
	    elementCompanyNameClear.clear();
	    elementCompanyNameClear.sendKeys("Test Leaf ltd");
	    
	    // Clear FirstName
	    
	    WebElement elementFirstNameclear = driver.findElement(By.id("createLeadForm_firstName"));
	    elementFirstNameclear.clear();
	    elementFirstNameclear.sendKeys("First Test Name");
	    
	    WebElement elementCreateDuplicateLeadButton = driver.findElement(By.name("submitButton"));
	    elementCreateDuplicateLeadButton.click();
	    
	    String title1 = driver.getTitle();
	    System.out.println("The Title of this page is:" + title1);
	}
		
}
