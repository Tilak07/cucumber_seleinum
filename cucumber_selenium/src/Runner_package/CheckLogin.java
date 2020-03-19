package Runner_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckLogin
{
	WebDriver driver;
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\jar files\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.get("http://demowebshop.tricentis.com/login");
	}

	@When("^I provide valid username and password$")
	public void i_provide_valid_username_and_password() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("tilakseegu12@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vishal@12");
		
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();    
	}


}
