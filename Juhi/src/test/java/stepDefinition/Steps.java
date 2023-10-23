package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;


public class Steps {
  
	WebDriver driver;
	@Given("I hit the url {string}")
	public void i_hit_the_url(String url) {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get(url);	   
	}
	
	@When("click on login")
	public void click_on_login() {
	Login log=new Login(driver);
		log.login();
	}
	
	
	@When("enter credentials")
	public void enter_credentials() {
		
	}
	
	@Then("click on login button")
	public void click_on_login_button() {
	    
	}
}
