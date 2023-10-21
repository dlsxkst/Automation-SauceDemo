Feature: Logout functionality
  @Positive
  Scenario Outline: Ensure user succesfully logout
    # precondition
    Given user is on SauceDemo homepage
    #steps
    When user input <username> as username
    And user input <password> as password
    And user click enter
    And user click the menu button
    And user click logout
    # expected
    Then user verify logout successfully

    Examples:
      | username                | password      | status  |
      | standard_user           | secret_sauce  | success |
      | performance_glitch_user | secret_sauce  | success |