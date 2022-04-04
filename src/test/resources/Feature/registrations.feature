Feature: user resgitration for getting education

  #DataTable in Cucumber BDD framework and how to implement
  #it
  #with list
  #in feature file and step definition file.
  #How to create a scenario with data table values in feature file
  #How to implement data table in step definition file
  #What is DataTable Object
  #DataTable (asLists) in Cucumber BDD
  @smoke
  Scenario: 
    Given User on registartion Page
    When User enters following regsitartion details
      | Jeyhun  | Aliyev  | Ali-ceyhun@list.ru | NewYork    |
      | John    | jerry   | john@gmail.com     | California |
      | Emiliya | Aliyeva | Emiliya@list.ru    | Brooklyn   |
    Then user successfully registered

  #with List of Map
  @sanity
  Scenario: 
    Given User on registartion Page
    When User enters following regsitartion details to the specific coulumns
      | FirstName | LastName | Email              | City       |
      | Jeyhun    | Aliyev   | Ali-ceyhun@list.ru | NewYork    |
      | John      | jerry    | john@gmail.com     | California |
      | Emiliya   | Aliyeva  | Emiliya@list.ru    | Brooklyn   |
    Then user successfully registered
