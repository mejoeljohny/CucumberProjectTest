package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.*;

public class Baseclass {
	public static WebDriver driver;

	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe"); // Firefox webdriver

		driver = new ChromeDriver();
		driver.manage().window().maximize(); // Window Maximize
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@After
	public void TearDown() {
		driver.quit();
	}

}
