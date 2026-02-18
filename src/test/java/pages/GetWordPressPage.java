package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetWordPressPage {

	WebDriver driver;
	
	By pageText = By.xpath("//h1");
	
	public GetWordPressPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageText() {
		return driver.findElement(pageText).getText();
	}
}
