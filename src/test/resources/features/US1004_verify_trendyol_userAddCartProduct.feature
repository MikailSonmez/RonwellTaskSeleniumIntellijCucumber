Feature: US1004 verify trendyol user add cart product

  Scenario: TC04_Verify trendyol user add cart product
    Given user go to the trendyol page
    And user click to woman text
    Then user add first product to cart
    Given user go to cart
    And user see first product in cart