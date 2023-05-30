

Feature: Multiple products are searched on the site


  Background: Customer searches for multiple products

    When User goes to Hepsiburada page
    Then accepts cookies


  Scenario Outline: searches for products listed on Hepsiburada

    Then The customer searches for "<search>"
    Then tests that search results contain "<search>"


    Examples:
      | search |
      | dyson  |
      | robot |
      | BİSSELL |
