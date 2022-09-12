Feature: US1001 verify trendyol registration page
  @Automation
  Scenario: TC01_Verify trendyol registration page
    Given user go to the trendyol page
    And user close advertisement
    And user click to login button
    Then user click to sign up
    Given user verify registration page