import pytest

from Pages.HotelScreen import HotelScreen

from TestCases.BaseTest import BaseTest
from Pages.HomeScreen import HomeScreen
from Utilities import dataProvider


@pytest.markusefixtures("log_on_failures","appium_server")

class Test_SearchHotel(BaseTest):
    @pytest.mark.parameterize("city",dataProvider.get_data("SearchTest"))
    def test_searchHotel(self,city):
        home = HomeScreen(self,city)
        home.gotoHotels().searchHotels(city)
        hotel = HotelScreen(self.driver)
