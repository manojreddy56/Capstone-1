from pages.home_page import HomePage
from pages.themes_page import ThemesPage
import time

def test_verify_wordpress_themes(driver):
    print("Launching WordPress")
    home = HomePage(driver)
    themes = ThemesPage(driver)
    
    home.launch_site()
    time.sleep(2)
    
    print("Title:", home.get_title())
    assert "WordPress" in home.get_title()
    
    print("Opening Themes")
    home.open_themes()
    time.sleep(3)
    
    print("Searching theme")
    themes.search_theme("astra")
    time.sleep(3)
    
    print("Verifying results")
    assert themes.are_themes_displayed()
    
    print("TEST COMPLETED")