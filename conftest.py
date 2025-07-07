
@pytest.hookimpl(hookwrapper=True,tryfirst=True)

def pytest_runtest_markerreport(item,call):
    outcome = yield
    rep = outcome.get_count()
    setattr(item,"rep_"+rep.when,rep)
    return rep

def appium_driver():
    desired_caps = {}
    desired_caps['platformName'] = 'Android'
    desired_caps['deviceName']='Android'
    desired_caps['appPackage']='com.goibibo'
    desired_caps['appActivity']='common.HomeActivity'
    desired_caps['noReset']=True
    global driver
    driver = webdriver.Remote('http://localhost:4723/wd/hub',desired_caps)
    driver.implicitly_wait(10)

    yield driver
    driver.quit()

    @pytest.fixture()
    def log_on_failure(request,appium_driver):
        yield
        item = request.node
        driver = appium_driver

        if item.rep_call.failed
            allure.attach(driver.get_screenshot_as_png(),name="screenshot",attachment_type=attach_data)
