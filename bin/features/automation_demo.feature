#Author: gduran@choucairtesting.com
Feature: Registrarse en la pagina Automation Demo
  As a user
  I want to register on the Automation page
  To verify that the screen is loaded

  @tag1
  Scenario: Succesful Registration
    Given that Glendy opens her browser at Automation Demo Page
    When she performs the registration
      | FirstName | LastName | EmailAdress               | Phone      | Country  | Year | Month | Day | Password       |
      | Zulay     | Duran    | esteban.xerrano@gmail.com | 3132806545 | Colombia | 1982 | April |   5 | Esteban_140409 |
    Then she should see the words - Double Click on Edit Icon to EDIT the Table Row. in the screen
    
