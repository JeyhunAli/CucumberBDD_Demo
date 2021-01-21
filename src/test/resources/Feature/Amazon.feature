Feature: Amazon search

Scenario: Search product
Given Im on search page in Amazon 
When I search for a product name "Apple MacBook" and price with 2500
Then Product with the Name "Apple MacBook" should be displayed

