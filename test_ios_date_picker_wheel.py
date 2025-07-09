import time

from appium import webdriver

desired_caps = {}
desired_caps['platformName'] = 'iOS'
desired_caps['platformVersion'] = '14.3'
desired_caps['deviceName'] = 'iPhone 12 Pro Max'
desired_caps['udid'] = '40545022-FD58-4311-B28A-B4EADB417E17'
# desired_caps['platformVersion'] = '14.4.2'
# desired_caps['deviceName'] = 'iPhone X'
# desired_caps['udid'] = '234242fwerwer'
desired_caps['bundleId'] = 'com.rahul.IntegrationApp'

driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)

driver.implicitly_wait(10)

driver.find_element_by_accessibility_id('Attributes').click()

wheel = driver.find_elements_by_class_name('XCUIElementTypePickerWheel')[0]
driver.execute_script("mobile: selectPickerWheelValue", {'order': 'next', 'offset': 0.15, 'element': wheel})
# driver.find_elements_by_class_name('XCUIElementTypePickerWheel')[0].send_keys('Fri, Jun 4')
driver.find_elements_by_class_name('XCUIElementTypePickerWheel')[1].send_keys('10')
driver.find_elements_by_class_name('XCUIElementTypePickerWheel')[2].send_keys('20')
driver.find_elements_by_class_name('XCUIElementTypePickerWheel')[3].send_keys('AM')

time.sleep(2)
