package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.testng.Assert;

import pages.HomePage;
import pages.GetWordPressPage;
import pages.PhotoDirectoryPage;
import hooks.Hooks;


public class WordPressSteps {

	HomePage home;
	GetWordPressPage getWP;
	PhotoDirectoryPage photoPage;
	
	@Given("the user is on the WordPress home page")
	public void user_on_home_page() {
		home = new HomePage(Hooks.driver);
		home.launchSite();
		Assert.assertTrue(home.getTitle().contains("WordPress"));
	}
	

	@When("the user opens the Get WordPress page")
	public void open_get_wordpress() {
		home.clickGetWordPress();
		getWP = new GetWordPressPage(Hooks.driver);
	}
	
	@Then("the Get WordPress page title should be displayed")
	public void verify_get_wordpress_page() { 
		Assert.assertEquals(getWP.getPageText(), "Get WordPress");
	}
	
	@When("the user searches for a photo in the Photo Directory")
	public void search_photo_directory() {
		home.openPhotoDirectory();
		photoPage = new PhotoDirectoryPage(Hooks.driver);
		photoPage.searchPhoto("nature");
	}
	
	@Then("the photo search results should be displayed")
	public void verify_photo_results() {
		Assert.assertTrue(photoPage.isPhotoDisplayed());
	}

}