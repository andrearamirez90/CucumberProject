package com.syntax.cucumberproject.testStepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps {
	
	public static WebDriver driver;
	
	@Given("^open browser$")
	public void i_open_browser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Given("^navigate to the FreeCRM$")
	public void i_navigate_to_the_FreeCRM() throws Throwable {
	    driver.get("https://www.freecrm.com/index.html");
	    }
	
	@Then("^I click on Sign Up button$")
	public void i_click_on_Sign_Up_button() throws InterruptedException  {
		Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement signUpLink = driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(signUpLink));
        signUpLink.click();
//	    Actions act = new Actions (driver);
//	    act.moveToElement(SignUp).click().perform();
	    
	    
	    
	}

	@When("^I provide firstname and lastname and email and confEmail and Username and Password and ConfirmPass$")
	public void i_provide_fname_and_lName_and_email_and_confEmail_and_uName_and_Pswd_and_cPswd() {
		
		WebElement dropD =driver.findElement(By.id("payment_plan_id"));
		
		Select obj= new Select (dropD);
		obj.selectByVisibleText("Free Edition");
	    
		driver.findElement(By.name("first_name")).sendKeys("Andrea");
		driver.findElement(By.name("surname")).sendKeys("Ramirez");
		driver.findElement(By.name("email")).sendKeys("andy4@email.com");
		driver.findElement(By.name("email_confirm")).sendKeys("andy4@email.com");
		driver.findElement(By.name("username")).sendKeys("andrea240");
		driver.findElement(By.name("password")).sendKeys("andrea240");
		driver.findElement(By.name("passwordconfirm")).sendKeys("andrea240");
		
		
	}

	@When("^I click on agree terms and conditions$")
	public void i_click_on_agree_terms_and_conditions()  {
		driver.findElement(By.name("agreeTerms")).click();
	}

	@Then("^User click on Submit button$")
	public void i_click_on_Submit_button()  {
		driver.findElement(By.xpath("//div[@class='myButton']")).click();
	}

	@Then("^I succesfully register my account$")
	public void i_succesfully_register_my_account(){
		WebElement registerCo =driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]"));
		boolean rComment = registerCo.isDisplayed();
		AssertJUnit.assertTrue(rComment);
	    
	}
	
	@Then("^I have to provide companyinfo and PhoneNumber and Email$")
	public void i_have_to_provide_companyinfo_and_PhoneNumber_and_Email()  {
	    driver.findElement(By.name("company_name")).sendKeys("Star12");
	    driver.findElement(By.id("phone")).sendKeys("1234567890");
	    driver.findElement(By.id("company_email")).sendKeys("admin1234@email.com");
	}

	@Then("^I have to click Continue$")
	public void i_have_to_click_Continue()  {
	    driver.findElement(By.name("btnSubmit")).click();
	    driver.findElement(By.name("finish")).click();
	}
}
