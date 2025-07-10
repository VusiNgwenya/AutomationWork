import time

from appium import webdriver

desired_caps = {}
desired_caps['platformName'] = 'iOS'
desired_caps['platformVersion'] = '14.3'
desired_caps['deviceName'] = 'iPhone 12 Pro Max'
desired_caps['udid'] = '40545022-FD58-4311-B28A-B4EADB417E17'
# desired_caps['platformVersion'] = '14.4.2'
# desired_caps['deviceName'] = 'iPhone X'
# desired_caps['udid'] = '23423rwsr23424'
desired_caps['bundleId'] = 'com.example.apple-samplecode.UICatalogHello'

driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)

driver.find_element_by_accessibility_id('Switches').click()

element = driver.find_element_by_class_name('XCUIElementTypeSwitch')

print(element.get_attribute('value'))

if element.get_attribute('value') == '1':
    element.click()

print(element.get_attribute('value'))

driver.implicitly_wait(10)

time.sleep(2)
