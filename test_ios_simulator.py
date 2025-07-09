from appium import webdriver
import time

desired_caps = {}
desired_caps['platformName'] = 'iOS'
desired_caps['platformVersion'] ='14.3'
desired_caps['deviceName']='iPhone 12 Pro Max'
desired_caps['udid'] = '4943234sfdfw653d3834187802c0f'
desired_caps['bundleId'] = 'com.rahul.IntegrationApp'

driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)

driver.implicitly_wait(10)

time.sleep(2)

driver.quit()
