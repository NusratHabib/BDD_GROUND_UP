Feature: Search Keywords

  Background: Steps
    Given User launch the Chrome browser
    When User opens URL "https://www.google.com/"
    Then Page title should be "Google"

  @Smoke
  Scenario Outline: Search products from examples data below
    When User searches "<products>"
    Then Close browser
    Examples:
      | products |
      | Laptop   |
      | computer |
      | mouse    |
      | bottle   |