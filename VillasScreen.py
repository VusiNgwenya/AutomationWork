

class VillasScreen(BasePage):
    def __init__(self,driver):
        super().__init__(driver)

    def searchVilla(self,city):
        self.click("area_XPATH")
        self.type("searchtext_ID",city)
        self.clickIndex("selectlocation_ID",0)
        self.click("fromDate_XPATH")
        self.click("toDate_XPATH")
        self.click("continue_XPATH")
        self.click("viewstays_XPATH")

def test_searchVillas(appium_driver):
    driver = appium_driver
    driver.find_element_by_xpath("//android.widget.TextView[@text='Villas & Apts']").click()
    driver.find_element_by_xpath("//android.widget.TextView[@text='Area, Landmark or Property']").click()
    driver.find_element_by_id("com.goibibo:id/edtSearch").click()
    driver.find_element_by_id("com.goibibo:id/lytLocationItem").click()
    driver.find_element_by_xpath("//android.widget.TextView[@text='6']").click()
    driver.find_element_by_xpath("//android.widget.TextView[@text='11']").click()
    driver.find_element_by_xpath("//android.widget.TextView[contains(@text,'Continue']").click()
    driver.find_element_by_xpath("//android.widget.TextView[contains(@text,'View Stays']").click()
    ScrollUtil.scrollToTextByAndroidUIAutomator("Shubam Villas",driver)
