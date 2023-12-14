Feature : Login Feature
          In order to perform successful login
          As a user 
          I have to enter correct username and password
          
          
                Background : Login to the Facebook website
              Given user navigates to the facebook website
              When user validates the homepage title
              Then user enters "<username>" username
              And user enters "<password>" password
              And user clicks on the signin button
          
          Scenario Outline : Login to the Facebook website
              Given user navigates to the facebook website
              When user validates the homepage title
              Then user enters "<username>" username
              And user enters "<password>" password
              And user clicks on the signin button
              
               Scenario Outline : Login to the Facebook website
              Given user navigates to the facebook website
              When user validates the homepage title
              Then user enters "<username>" username
              And user enters "<password>" password
              And user clicks on the signin button
              
              
              
              Examples
              | username | password
              | valid    | valid
              | invalid  | invalid