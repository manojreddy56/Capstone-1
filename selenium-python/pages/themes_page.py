from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


class ThemesPage:

    SEARCH_BOX = (By.XPATH, "//input[@id='wp-block-search__input-8']")

    THEME_RESULTS = (
        By.XPATH,
        '//ul[contains(@class,"wp-block-post-template")]//li'
    )

    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 10)

    def search_theme(self, theme_name):
        search = self.wait.until(
            EC.visibility_of_element_located(self.SEARCH_BOX)
        )
        search.clear()
        search.send_keys(theme_name)
        search.submit()

    def are_themes_displayed(self):
        themes = self.wait.until(
            EC.presence_of_all_elements_located(self.THEME_RESULTS)
        )
        return len(themes) > 0
