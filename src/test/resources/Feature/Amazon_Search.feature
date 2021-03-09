Feature: Amazon search

@smoke
Scenario: Search product AppleMacBook
Given Im on search page in Amazon 
When I search for a product name "Apple MacBook" and price with 2500
Then Product with the Name "Apple MacBook" should be displayed
Then order id 01 and username is "Jeyhun"

@sanity
Scenario: Search product Apple AirPod
Given I have search field on Amazon Page
When I search for a product with name "Apple AirPod" and price with 300
Then Product Name "Apple AirPod" should be displayed
Then order with the id 02 and username is "Jeyhun"

