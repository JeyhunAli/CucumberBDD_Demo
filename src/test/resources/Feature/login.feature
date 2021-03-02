Feature: Login Feature

  Scenario Outline: login fail correct incorrect credentials combinations
    Given user on application login page
    When user clicks on sign in button
    Then login screen is displayed
    When User enters "<username>" to the username field
    And User enters "<password>" to the password field
    And User Clicking on sign in button
    Then User gets login failed error message

    Examples: 
      | Username           | Password           |
      | incorrect_username |           62882789 |
      | JeyhunAliyev       | incorrect_password |
      | incorrect_username | incorrect_password |
