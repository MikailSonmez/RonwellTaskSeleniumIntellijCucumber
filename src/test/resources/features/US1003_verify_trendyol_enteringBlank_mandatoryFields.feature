Feature: US1003 verify trendyol entering blank mandatory fields
  @paralel1
  Scenario: TC03_Verify trendyol entering blank mandatory fields
    Given user go to the trendyol page
    And user close advertisement
    And user click to login button
    Then user click to sign up
    Given user write space to blanks
    And user click to sign up in registration page
    Then user see error message