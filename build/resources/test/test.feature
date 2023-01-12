Feature: Akurey - Testing Feature

  Scenario: Verify Google Page being loaded
    Given I go on the "https://www.google.com/" page
    Then should the url of the page be "https://www.google.com/"

    @End
  Scenario: Test1234
    Given I go on the "https://www.google.com/" page
    When I will search "Akurey"
    And I click the position "1"
    Then should the url of the page be "https://www.akurey.com/"
