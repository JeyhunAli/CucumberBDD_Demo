Feature: Google Search

@regression
Scenario: Google main searching Page 
Given user on google search page 
When user search a country with the name "Italy" and population "60m"
Then Country with the name should be displayed 

@smoke
Scenario: Google main searching Page ui
Given user on google page 
When particular user search a country with the name "USA" and population "331M"
Then Country with the name should be displayed ON google