Feature: US1005 verify trendyol user add product favorites
  @paralel1
  Scenario: TC05_Verify trendyol user add product favorites
    Given user go to the trendyol page
    And user close advertisement
    And user click to woman button
    Then user add first product favorites
    Given user go to cart
    And user see first product in favorites