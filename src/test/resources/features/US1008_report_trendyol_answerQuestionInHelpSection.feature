Feature: US1008 report trendyol answer question in help section
  @paralel1
  Scenario: TC08_Report trendyol answer question in help section
    Given user go to the trendyol page
    And user click supermarket
    And user click first product in supermarket
    Then user click product questions
    Given user see first product question and answer
    And user report to screenshot product questions and answers frame