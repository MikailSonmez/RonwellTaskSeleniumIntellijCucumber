Feature: US1006 verify trendyol successfully buy product in cart

  Scenario: TC06_Verify trendyol successfully buy product in cart
    Given user go to the trendyol page
    And user close advertisement
    And user click cart button
    Then user click confirm basket
    Given user click save and continue
    And user see pay page successfully