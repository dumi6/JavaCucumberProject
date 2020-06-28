package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
WebDriver driver;

	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dumi.sibanda\\eclipse-workspace\\SundayCucumberProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}

@When("^User enters username and password$")
public void user_enters_username_and_password()  {
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");

}

@Then("^User clicks the submit button$")
public void user_clicks_the_submit_button() {
	driver.findElement(By.id("btnLogin")).click();
}

@Then("^User is on home page$")
public void user_is_on_home_page() {
    
	boolean status = driver.findElement(By.id("welcome")).isDisplayed(); 
	Assert.assertEquals(true, status);
}
@And("^User closes the UrlPage$")
public void user_closes_the_UrlPage() {
	driver.quit();
}


}


  