Feature: US1005 verify trendyol user add product favorites

  Scenario: TC05_Verify trendyol user add product favorites
    Given user go to the trendyol page
    And user click to woman text
    Then user add first product favorites
    Given user go to cart
    And user see first product in favorites