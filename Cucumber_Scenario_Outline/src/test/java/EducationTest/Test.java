package EducationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import step_definitions.BeforeAfter_Scenario;

public class Test {
	
	public WebDriver driver;
	
	String TestURL,Username,Password;
	
	
	@Given("^I Open OrangeHRM Details$") 
	public void I_Open_OrangeHRM_Details()   {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().deleteAllCookies();
    	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
     @When("^I Enter Valid \"(.*?)\" and Valid \"(.*?)\"$")
     public void I_sign_In(String Username,String Password) throws Throwable  {
    	 
    	 findElement(By.name("txtUsername")).sendKeys(Username);
 		findElement(By.name("txtPassword")).sendKeys(Password);
 		findElement(By.id("btnLogin")).click(); 
    	 
     }
     
     @Then("^I Created Education Record \"(.*?)\"$")
     
     public void I_Created_Education_Record(String EducationName) throws Throwable  {
     
		  
     findElement(By.id("menu_admin_viewAdminModule")).click();
     findElement(By.id("menu_admin_Qualifications")).click();
			
     findElement(By.id("menu_admin_viewEducation")).click();
			
	 findElement(By.id("btnAdd")).click();
			
			
	 findElement(By.id("education_name")).sendKeys(EducationName);
	 
     }
     
     @Then  ("^I Sign Out$") 
     
     public void  I_Sign_Out()  {
    	 
    	 BeforeAfter_Scenario.driver=driver;
     	driver.quit();
     }
     
     
     public   WebElement findElement(By by) throws Exception 
 	{
 				
 		 WebElement elem = driver.findElement(by);    	    
 		
 		 
 		if (driver instanceof JavascriptExecutor) 
 		{
 		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 	 
 		}
 		
 		return elem;
 	}
     
}
     
     
