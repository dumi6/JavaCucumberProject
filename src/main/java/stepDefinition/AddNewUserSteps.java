package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddNewUserSteps {
WebDriver driver;
Select  drpDwn;
@Given("^User is already on home page$")
public void user_is_already_on_home_page()  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dumi.sibanda\\eclipse-workspace\\SundayCucumberProject\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	 driver.get("http://automationpractice.com/index.php");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	 
	 driver.findElement(By.xpath("//a[@class='login']")).click();
	 driver.findElement(By.id("email")).sendKeys("dsauto1@email.com");
	 
		driver.findElement(By.name("passwd")).sendKeys("QWEasd123!");
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
}

@When("^User click on Admin$")
public void user_click_on_Admin()  {
	driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
    
}
@When("^User clicks Add button$")
public void user_clicks_Add_button() throws Throwable {
  driver.findElement(By.name("btnAdd")).click();
  WebElement element = driver.findElement(By.id("systemUser_userType")); //dropdown
  Select drpDwn = new Select(element);
  drpDwn.selectByValue("1");
}


@When("^User Adds \"([^\"]*)\" , \"([^\"]*)\"$")
public void User_Adds_Employee_Name_Username(String EmployeeName, String Username) {
   //Adding user details
	driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(EmployeeName);
	driver.findElement(By.id("systemUser_userName")).sendKeys(Username);
	driver.findElement(By.id("systemUser_status"));  //to double check this!
	drpDwn.selectByValue("1");
}

@When("^User enters new \"([^\"]*)\" and \"([^\"]*)\"$")
public void User_enters_new_password_and_Confirms_Password(String Password, String ConfirmPassword)  {
   
}

@Then("^User click on save to update new user's details$")
public void user_click_on_save_to_update_new_user_s_details()  {
	//driver.findElement(By.id("btnSave")).click();

}
}
