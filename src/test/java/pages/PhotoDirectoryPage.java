package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhotoDirectoryPage {

	WebDriver driver;
	
	By searchBox = By.xpath("//input[@id='wp-block-search__input-8']");
	By resultsGrid = By.cssSelector(".photo-grid");
	By images = By.cssSelector(".photo-grid figure");
	
	public PhotoDirectoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchPhoto(String name) {
		driver.findElement(searchBox).sendKeys(name);
	}
	
	public boolean isPhotoDisplayed() {
		//After search, URL must contain /Photos/
		return driver.getCurrentUrl().contains("/photos/");
	}
}
