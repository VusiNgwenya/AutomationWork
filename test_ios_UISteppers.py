import time

from appium import webdriver

desired_caps = {}
desired_caps['platformName'] = 'iOS'
desired_caps['platformVersion'] = '14.3'
desired_caps['deviceName'] = 'iPhone 12 Pro Max'
desired_caps['udid'] = '40545022-FD58-4311-B28A-B4EADB417E17'

desired_caps['bundleId'] = 'com.example.apple-samplecode.UICatalogHello'

driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)
driver.implicitly_wait(10)

driver.find_element_by_accessibility_id('Steppers').click()

element = driver.find_element_by_xpath('(//XCUIElementTypeStaticText[@name="0"])[1]')
increment = driver.find_element_by_xpath('(//XCUIElementTypeButton[@name="Increment"])[1]')

i = 1
while element.get_attribute('value') != '5':
    print('Value is : ', element.get_attribute('value'))
    increment.click()
    i += 1
print("Final value is : ", element.get_attribute('value'))

time.sleep(2)
