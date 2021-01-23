Feature: Amazon home page as registered
  user i want to see my order
  details after landing orders Page

  Background: 
    Given registered amazon account owner exists
    Given User is on amazon login page
    When User enters username
    And User enters password
    And user clicks on login button
    Then User navigate to the order page

  Scenario: Check previous Digital Orders details
    When User clicks on Digital Orders link
    Then User checks previous Digital Orders details

  Scenario: Check Cancelled Orders  details
    When User clicks on Cancelled Orders link
    Then User checks Cancelled Orders  details

  Scenario: Check Open Orders details
    When User clicks on Open Orders link
    Then User checks Open Orders details
    
    
    
    
    
   #this is the example of Background keyword so if we dont use Background keyword this how it will look like each and every time we have to define 
   #steps of the do login enter usrname pssword click login button then navigate order page 
   #instead of repeating again again we are writing once under Background keyword thats it 

  #Scenario: Check previous Digital Orders details
    #Given registered amazon account owner exists
    #Given User is on amazon login page
    #When User enters username
    #And User enters password
    #And user clicks on login button
    #Then User navigate to the order page
    #Then User clicks on Digital Orders link
    #Then User checks previous Digital Orders details
#
  #Scenario: Check Cancelled Orders  details
    #Given registered amazon account owner exists
    #Given User is on amazon login page
    #When User enters username
    #And User enters password
    #And user clicks on login button
    #Then User navigate to the order page
    #Then User clicks on Cancelled Orders link
    #Then User checks Cancelled Orders  details
#
  #Scenario: Check Open Orders details
    #Given registered amazon account owner exists
    #Given User is on amazon login page
    #When User enters username
    #And User enters password
    #And user clicks on login button
    #Then User navigate to the order page
    #Then User clicks on Open Orders link
    #Then User checks Open Orders details
