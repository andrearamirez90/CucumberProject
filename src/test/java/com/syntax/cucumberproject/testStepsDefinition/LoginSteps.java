package com.syntax.cucumberproject.testStepsDefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	public static WebDriver driver;
	
	@Given("^I open browser$")
	public void i_open_browser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	   
	}

	@Given("^I navigate to the FreeCRM$")
	public void i_navigate_to_the_FreeCRM() throws Throwable {
	    driver.get("https://www.freecrm.com/index.html");
	    }

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
	   driver.findElement(By.name("username")).clear();
	   driver.findElement(By.name("username")).sendKeys("airmore15");
	   driver.findElement(By.name("password")).clear();
	   driver.findElement(By.name("password")).sendKeys("Cecan1991");
	   
		
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		WebElement loginButton =driver.findElement(By.xpath("//input[@value='Login']"));
		
		Actions act =new Actions (driver);
		
		act.moveToElement(loginButton).click();
	 
	}

	@Then("^I succesfully logged in$")
	public void i_succesfully_logged_in() throws Throwable {
		
		String title = "CRMPRO";
		driver.getTitle();
		assertEquals("CRMPRO", title);
		driver.quit();
	    
	}
	
	@When("^I enter invalid username and password$")
	public void i_enter_invalid_username_and_password() throws Throwable {
		
		driver.findElement(By.name("username")).sendKeys("airmore15");
		   driver.findElement(By.name("password")).sendKeys("Cecan");
	}

	@Then("^I see error message$")
	public void i_see_error_message() throws Throwable {
		String title = "FreeCRM";
		driver.getTitle();
		assertEquals("FreeCRM", title);
		
		driver.quit();
	}

}
