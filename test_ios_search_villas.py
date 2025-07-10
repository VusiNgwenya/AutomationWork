

class Test_SearchVilla(BaseTest):
    @pytest.mark.parameterize("city",dataProvider.get_data("SearchTeet"))
    def test_searchVilla(self,city):
        home = HomeScreen(self.driver)
        home.gotoVillas().searchVilla(city)
        ScrollUtil.scrollToTextByAndroidUIAutomator("",driver)
