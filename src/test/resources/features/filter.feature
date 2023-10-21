Feature: Filter Product Z to A functionality
  @Positive
  Scenario Outline: Ensure user succesfully filter product Z to A
    # precondition
    Given user is on SauceDemo homepage
    #steps
    When user input <username> as username
    And user input <password> as password
    And user click enter
    When user click  filter menu
    And user click Name(Z to A)

    # expected
    Then user verify success filtering

    Examples:
      | username                | password      |
      | standard_user           | secret_sauce  |
      | performance_glitch_user | secret_sauce  |
      
  @Negative
  Scenario Outline: Ensure user failed to filter Z to A
  	# precondition  
  	Given user is on SauceDemo homepage
  	#steps
    When user input <username> as username
    And user input <password> as password
    And user click enter
    When user click  filter menu
    And user click Name(Z to A)
    
    #expected
    Then user verify failed filtering
    
    Examples:
      | username                | password      |
      | problem_user           | secret_sauce  |
