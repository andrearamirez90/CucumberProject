package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * This is Andrea Login Step Class ---dynamic tests
 * 
 * @author AndreaRamirez
 *
 */
public class LoginSteps {
	
	public static WebDriver driver;
	

	
	

	/**
	 * 
	 * @param usrname
	 * @param passord
	 */
	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_valid_username_and_password(String usrname, String passord )  {
	   
	   driver.findElement(By.name("username")).sendKeys(usrname);
	   
	   driver.findElement(By.name("password")).sendKeys(passord);
	   
		
	}
//
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
//	
//	@When("^I provide invalid \"(.*)\" and \"(.*)\"$")
//	public void i_enter_invalid_username_and_password(String username, String password)  {
//		
//		driver.findElement(By.name("username")).sendKeys(username);
//		   driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^I see error message$")
//	public void i_see_error_message() throws Throwable {
//		String title = "FreeCRM";
//		driver.getTitle();
//		assertEquals("FreeCRM", title);
//		
//		driver.quit();
//		
//
//	}

//	
//	
//	@Then("^User is on home page$")
//	public void user_is_on_home_page()  {
//		
//	    
//	}
//
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page()  {
//		driver.switchTo().frame("mainpanel");
//		Actions act= new Actions (driver);
//		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//	}

	


	@Given("^open browser$")
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Given("^I navigate to the FreeCRM$")
	public void i_navigate_to_the_FreeCRM()  {
		driver.get("https://www.freecrm.com/index.html");
	}

	@Given("^User clicks on Sign Up button$")
	public void user_clicks_on_Sign_Up_button() throws InterruptedException {
		Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement signUpLink = driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(signUpLink));
        signUpLink.click();
	}

	@When("^I provide \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_provide_and_and_and_and_and_and(String fName, String lName, String Email, String cEmail, String UName, String pwd, String cPwd) {
		WebElement dropD =driver.findElement(By.id("payment_plan_id"));
		
		Select obj= new Select (dropD);
		obj.selectByVisibleText("Free Edition");
	    
		driver.findElement(By.name("first_name")).sendKeys(fName);
		driver.findElement(By.name("surname")).sendKeys(lName);
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("email_confirm")).sendKeys(cEmail);
		driver.findElement(By.name("username")).sendKeys(UName);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("passwordconfirm")).sendKeys(cPwd);
	
	
	}

	@When("^I click on agree terms and conditions$")
	public void i_click_on_agree_terms_and_conditions()  {
		driver.findElement(By.name("agreeTerms")).click();
	}

	@Then("^User click on Submit button$")
	public void user_click_on_Submit_button(){
		driver.findElement(By.xpath("//div[@class='myButton']")).click();
	}

	@Then("^I have to provide \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_have_to_provide_and_and(String company, String phone, String email) {
		driver.findElement(By.name("company_name")).sendKeys(company);
	    driver.findElement(By.id("phone")).sendKeys(phone);
	    driver.findElement(By.id("company_email")).sendKeys(email);
	    
	}

	@Then("^I have to click Continue$")
	public void i_have_to_click_Continue()  {
		driver.findElement(By.name("btnSubmit")).click();
	    driver.findElement(By.name("finish")).click();
	}

	@Then("^I succesfully register my account$")
	public void i_succesfully_register_my_account() {
		WebElement registerCo =driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]"));
		boolean rComment = registerCo.isDisplayed();
		AssertJUnit.assertTrue(rComment);
	}
	
	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
	    driver.close();
	}
	
	
	@When("^I will provide the following details$")
	public void i_will_provide_the_following_details(DataTable signDetails) throws Throwable {
	    
	   for (Map<String,String> map : signDetails.asMaps(String.class, String.class)){
	      
	      
	    	  
	    	  
	    	WebElement dropD =driver.findElement(By.id("payment_plan_id"));
	    	Select obj= new Select (dropD);
	  		obj.selectByVisibleText(map.get("EDITION"));
	  	   
	  		
	  		driver.findElement(By.name("first_name")).sendKeys(map.get("FNAME"));
	  		driver.findElement(By.name("surname")).sendKeys(map.get("LNAME"));
	  		driver.findElement(By.name("email")).sendKeys(map.get("EMAIL"));
	  		driver.findElement(By.name("email_confirm")).sendKeys(map.get("CONF.EMAIL"));
	  		driver.findElement(By.name("username")).sendKeys(map.get("USERNAME"));
	  		driver.findElement(By.name("password")).sendKeys(map.get("PASS"));
	  		driver.findElement(By.name("passwordconfirm")).sendKeys(map.get("CPASS"));
	  		
	  		driver.findElement(By.name("agreeTerms")).click();
	  		 
	  		Thread.sleep(2000);
	  		driver.findElement(By.name("submitButton")).click();
		   
	  		
	  		driver.findElement(By.name("company_name")).sendKeys(map.get("CName"));
		    driver.findElement(By.id("phone")).sendKeys(map.get("Phone"));
		    driver.findElement(By.id("company_email")).sendKeys(map.get("CEmail"));
		    
		    driver.findElement(By.name("btnSubmit")).click();
		    
		    driver.findElement(By.name("finish")).click();
	  		
	  		 WebDriverWait wait = new WebDriverWait(driver, 10);
	         WebElement signUpLink = driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[2]/a"));
	         wait.until(ExpectedConditions.elementToBeClickable(signUpLink));
	         signUpLink.click();
			
		}
	    
	   
	    
	}

}
