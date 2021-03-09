@All
Feature: Yellow cab booking Feature


@Regression
Scenario: booking cab sedan 
Given User selecting car type "Sedan" from Yellow cab application
When User choose car type "Sedan" pick up point "JFK airport" and drop off location "NJ"
Then driver starts the journey
And driver ends the Jorney
Then user pays 80 usd dollar


@Smoke @qa-ready @user-story-9090 @Epic-10
Scenario: booking cab suv 
Given User selecting car type "suv" from Yellow cab application
When User choose car type "suv" pick up point "JFK airport" and drop off location "Vermont"
Then driver starts the journey
And driver ends the Jorney
Then user pays 200 usd dollar


@Sanity
Scenario: booking cab
Given User selecting car type "Black car" from Yellow cab application
When User choose car type "Sedan" pick up point "JFK airport" and drop off location "Tampa"
Then driver starts the journey
And driver ends the Jorney
Then user pays 250 usd dollar
