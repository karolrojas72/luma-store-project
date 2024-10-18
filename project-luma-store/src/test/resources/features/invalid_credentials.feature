Feature: Invalid Credentials
  Scenario Outline: Submit a test form on Luma page
    Given Karol is on the homepage "<username>" and "<password>"

    When she submits the login form with invalid credentials

    Then to she an error message "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later." is displayed
    #Then to she an error message is displayed

    Examples:

      | username                    | password      |
      | lumalasterror@yopmail.com   | luerrorma785* |