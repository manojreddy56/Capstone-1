package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

	public static WebDriver driver;
	
	@Before
	public void setUp() {
		driver = DriverFactory.initDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
