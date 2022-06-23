
@tag
Feature: I Create Nationality Record

 

  @tag2
  Scenario Outline: TC03_Create Nationality
    Given  I Open OrangeHrm Details
    When   I Enter Valid "Admin" and Valid "admin123"
    Then   I Created Nationality Record "<NationalityRecord>"
    And    I Sign Out

    Examples: 
      | NationalityRecord  |
      | Indian115          |
      | Indian116          |
