
@tag
Feature: Create Education Record
  

  

  @tag2
  Scenario Outline: TC01_Create Education Record
   
     Given  I Open OrangeHRM Details
     When I Enter Valid "Admin" and Valid "admin123" 
     Then  I Created Education Record "<EducationRecord>" 
     And   I Sign Out
    Examples: 
      | EducationRecord |
      | MSC ENG         |
      | MSC TEL         |
