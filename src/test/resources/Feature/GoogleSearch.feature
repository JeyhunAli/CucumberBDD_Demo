Feature: Google Search

Scenario: Google main searching Page 
Given user on google search page 
When user search a country with the name "Italy" and population "60m"
Then Country with the name should be displayed 