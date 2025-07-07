import logging
from Utilities import configReader
from Utilities.LogUtil import Logger

log = Logger(__name__,logging.INFO)

class BasePage:
    def __init__(self,driver):
        self.driver = driver

        def click(self,locator):
            if str(locator).endswith("_XPATH"):
                self.driver.find_element_by_xpath(configReader.readConfig("locators",locator)).click()

            if str(locator).endswith("_ACCESSIBILITYID"):
                self.driver.find_element_by_xpath(configReader.readConfig("locators", locator)).click()
                if str(locator).endswith("_ID"):
                    self.driver.find_element_by_xpath(configReader.readConfig("locators", locator)).click()
                    log.logger.info("Clicking on an Element",str(locator))

        def clickIndex(self, locator,value):
            if str(locator).endswith("_XPATH"):
                self.driver.find_element_by_xpath(configReader.readConfig("locators", locator)).send_keys(value)

            if str(locator).endswith("_ACCESSIBILITYID"):
                self.driver.find_element_by_xpath(configReader.readConfig("locators", locator)).click()
            if str(locator).endswith("_ID"):
               self.driver.find_element_by_xpath(configReader.readConfig("locators", locator)).click()
               log.logger.info("Clicking on an Element", str(locator))

        def getText(self, locator, value):
           if str(locator).endswith("_XPATH"):
               self.driver.find_element_by_xpath(configReader.readConfig("locators", locator)).send_keys(value)

           if str(locator).endswith("_ACCESSIBILITYID"):
              self.driver.find_element_by_xpath(configReader.readConfig("locators", locator)).click()
           if str(locator).endswith("_ID"):
              self.driver.find_element_by_xpath(configReader.readConfig("locators", locator)).click()
              log.logger.info("Clicking on an Element", str(locator))
