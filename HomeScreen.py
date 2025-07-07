
from Pages.BasePage import BasePage

class HomeScreen(BasePage):
     def __init__(self,driver):
         super().__init__(driver)


     def gotoHotels(self):
         self.click("hotel_ID")
         return HotelScreen(self.driver)



     def gotoVillas(self):
         self.click("villas_XPATH")

     def gotoFlights(self):
         pass

     def gotoTrains(self):
         pass
