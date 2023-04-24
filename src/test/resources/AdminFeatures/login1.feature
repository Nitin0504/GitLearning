Feature: Itecy Login Feature

  Scenario Outline: validate Itecy login scenario
    Given user launches the url and validate the application
    When user enters "<username>" and "<password>"
    And user tries to logged into the application
    Then validate the Alerts "<Alert>"

    Examples: 
      | username                | password | Alert                        |
      | hr@clientserver.com     | Pass@123 | Invalid Account              |
      | hr@clientservertech.com | Pass@12  | Invalid Password             |
      | hr@clientserver.com     | Pass@12  | Invalid Account             |
      | hr@clientservertech.com | Pass@123 | Welcome Admin Dashborad page |
