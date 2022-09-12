Feature: US1002 verify trendyol not filling mandatory fields signup

  Scenario: TC02_Verify trendyol not filling mandatory fields signup
    Given user go to the trendyol page
    And user close advertisement
    And user click to login button
    Then user click to sign up
    Given user pick woman or man
    And user click to sign up in registration page
    Then user see error message