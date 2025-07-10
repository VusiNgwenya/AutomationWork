import time

from appium import webdriver
from appium.webdriver.common.touch_action import TouchAction

desired_caps = {}
desired_caps['platformName'] = 'iOS'
desired_caps['platformVersion'] = '14.3'
desired_caps['deviceName'] = 'iPhone 12 Pro Max'
desired_caps['udid'] = '40545022-FD58-4311-B28A-B4EADB417E17'
# desired_caps['platformVersion'] = '14.4.2'
# desired_caps['deviceName'] = 'iPhone X'
# desired_caps['udid'] = '494372ac98efddd1fbae999653d3834187802c0f'
desired_caps['bundleId'] = 'com.rahul.IntegrationApp'

driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)

driver.implicitly_wait(10)

driver.find_element_by_accessibility_id('Scrolling').click()
driver.find_element_by_accessibility_id('TableView').click()

action = TouchAction(driver)

i = 0

while not driver.find_element_by_accessibility_id('35').is_displayed():
    action.press(x=20, y=751).wait(2000).move_to(x=20, y=267).perform()
    i += 1
    print("Swipe count : ", i)
