import time

from appium import webdriver

desired_caps = {}
desired_caps['platformName'] = 'iOS'
# desired_caps['platformVersion'] = '14.3'
# desired_caps['deviceName'] = 'iPhone 12 Pro Max'
# desired_caps['udid'] = '40545022-FD58-4311-B28A-B4EADB417E17'
desired_caps['platformVersion'] = '14.4.2'
desired_caps['deviceName'] = 'iPhone X'
desired_caps['udid'] = '494372ac98efddd1fbae999653d3834187802c0f'
desired_caps['browserName'] = 'safari'

driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)

driver.implicitly_wait(10)
driver.get('http://google.com')
driver.find_element_by_xpath("//*[@name='q']").send_keys("Hello Appium !!!")

time.sleep(2)

driver.quit()
