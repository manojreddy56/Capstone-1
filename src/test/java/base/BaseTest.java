package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.DriverFactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.initDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
