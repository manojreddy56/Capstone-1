from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.action_chains import ActionChains


class HomePage:

    # LOCATORS MUST BE INSIDE THE CLASS
    EXTEND_MENU = (By.XPATH, "//span[normalize-space()='Extend']")
    THEMES_LINK = (By.XPATH, "//span[normalize-space()='Themes']")

    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 10)

    def launch_site(self):
        self.driver.get("https://wordpress.org/")

    def get_title(self):
        return self.driver.title

    def open_themes(self):
        extend = self.wait.until(
            EC.visibility_of_element_located(self.EXTEND_MENU)
        )

        ActionChains(self.driver).move_to_element(extend).perform()

        themes = self.wait.until(
            EC.element_to_be_clickable(self.THEMES_LINK)
        )
        themes.click()
