Feature: Calculate billing amount

  Scenario Outline: billing amount
    Given userr is on billing page
    When user enters billing amount <billingamount>
    When user enters tax amount <taxamount>
    And user clickss on calculate button
    Then it gives the final amount <finalamount>

    Examples: 
      | billingamount | taxamount | finalamount |
      |          1000 |        10 |        1010 |
      |           500 |        20 |         520 |
      |           100 |       5.5 |       105.5 |
      
      
      
      
      #here -------->>>>
      
 #When user enters billing amount <billingamount>
 #When user enters tax amount <taxamount>
 #Then it gives the final amount <finalamount>
 #this 3 lines without double quotes they will act like int and double if they are within the double quotes they 
 #will behave like string 
 #interesting point is 
 #taxamount and final amount will act like double and int because 
 #there numbers as int nd as double thats why in the step def file it will create overloaded method for both 
 #in int and in double 

 
       #cucumber version 6 this exception
       #but in cuucmber version 4 it works perfectly fine
 
       #io.cucumber.core.runner.AmbiguousStepDefinitionsException: 
       #"user enters tax amount 10" matches more than one step definition:
       #we will get this exception if we use this format in feature file 