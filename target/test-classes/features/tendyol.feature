
@hy
Feature: Multiple products are searched on the site

  Background: Customer searches for multiple products

    When User goes to Trendyol page



  Scenario Outline: searches for products listed on Trendyol

    Then The customer searches Trendyol for "<search>"
    Then Trendyol tests that search results contain "<search>"


    Examples:
      | search |
      | dyson  |
      | robot |
      | BİSSELL |
