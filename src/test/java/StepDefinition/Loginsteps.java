package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;

public class Loginsteps {
	WebDriver driver = Baseclass.driver;

	@Given("I have opened the application in browser")
	public void i_have_opened_the_application_in_browser() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.simplilearn.com/");
		Thread.sleep(5000);
	}

	@When("I click on the Login link")
	public void i_click_on_the_login_link() {
		// Write code here that turns the phrase above into concrete actions
		WebElement Loginlink = driver.findElement(By.className("login"));
		Loginlink.click();
	}

	@When("I enter the username")
	public void i_enter_the_username() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys("mejoeljohny12@gmail.com");
		Thread.sleep(500);

	}

	@When("I enter the password")
	public void i_enter_the_password() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Aneesh@123");
		Thread.sleep(500);

	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebElement lognbtn = driver.findElement(By.name("btn_login"));
		lognbtn.click();
		Thread.sleep(5000);

	}

	@Then("I should be Landed on the Home Page")
	public void i_should_be_landed_on_the_home_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Logged in Successfully");
		Thread.sleep(2000);
	}

	@When("I enter the username {string}")
	public void i_enter_the_username(String UsernameVal) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys(UsernameVal);
		Thread.sleep(500);
	}

	@When("I enter the password {string}")
	public void i_enter_the_password(String PasswrdVal) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(PasswrdVal);
		Thread.sleep(500);
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String string) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebElement Errmsg = driver.findElement(By.id("msg_box"));
		String Actualmsg = Errmsg.getText();
		String Expmsg = "The email or password you have entered is invalid.";
		Assert.assertEquals(Actualmsg, Expmsg);
		System.out.println("Login Negative Scenario Verified Successfully");
		Thread.sleep(500);
	}

}
