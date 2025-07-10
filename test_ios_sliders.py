import time

from appium import webdriver

desired_caps = {}
desired_caps['platformName'] = 'iOS'
desired_caps['platformVersion'] = '14.3'
desired_caps['deviceName'] = 'iPhone 12 Pro Max'
desired_caps['udid'] = '40545022-FD58-4311-B28A-B4EADB417E17'
# desired_caps['platformVersion'] = '14.4.2'
# desired_caps['deviceName'] = 'iPhone X'
# desired_caps['udid'] = '3w4234234'
desired_caps['bundleId'] = 'com.example.apple-samplecode.UICatalogHello'

driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)
driver.implicitly_wait(10)

driver.find_element_by_accessibility_id('Sliders').click()

driver.find_elements_by_class_name('XCUIElementTypeSlider')[0].send_keys('0.6')
print(driver.find_elements_by_class_name('XCUIElementTypeSlider')[0].get_attribute('value'))

driver.find_elements_by_class_name('XCUIElementTypeSlider')[1].send_keys('0.8')
print(driver.find_elements_by_class_name('XCUIElementTypeSlider')[1].get_attribute('value'))

driver.find_elements_by_class_name('XCUIElementTypeSlider')[2].send_keys('0.2')
print(driver.find_elements_by_class_name('XCUIElementTypeSlider')[2].get_attribute('value'))

time.sleep(2)
