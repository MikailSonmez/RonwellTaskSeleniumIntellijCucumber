Feature: US1004 verify trendyol user add cart product

  Scenario: TC04_Verify trendyol user add cart product
    Given user go to the trendyol page
    And user close advertisement
    And user click to woman button
    Then user add first product to cart
    Given user go to cart
    And user see first product in cart