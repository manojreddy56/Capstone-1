package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class HomePage {
	
	WebDriver driver;
	

	By Extend = By.xpath("//span[normalize-space()='Extend']");
	By getWordPress = By.xpath("//a[@class='global-header__desktop-get-wordpress global-header__get-wordpress']");
	By community = By.xpath("//span[normalize-space()='Community']");
	By photoDirectory = By.xpath("//span[normalize-space()='Photo Directory']");


	public HomePage(WebDriver driver) {
		this.driver = driver;
	}


	public void launchSite() {
		driver.get("https://wordpress.org/");
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void clickGetWordPress() {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(Extend)).perform();
		driver.findElement(getWordPress).click();
	}
	
	public void openPhotoDirectory() {
		driver.findElement(community).click();
		driver.findElement(photoDirectory).click();

	}
}