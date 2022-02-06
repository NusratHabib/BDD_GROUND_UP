Feature: Add to cart product

  Background: Steps
    Given User launch the Chrome browser
    When User opens URL "http://automationpractice.com"
    Then Page title should be "My Store"

  Scenario: Customer add dress to cart
    When User searches dress on the search field
    And Clicks on search button
    Then The page title should be "Search - My Store"
    When User clicks on a product
    And Selects one item
    And Clicks on add to cart button
    And Click on proceed to checkout
    Then Title should be "Order - My Store"