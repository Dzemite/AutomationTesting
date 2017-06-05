Feature: Login functionality
  Scenario Outline: Login process
    Given I'm on home page
    When I type credentials as <username>/<password>
    Then Profile name is visible <name>/<bool>

    Examples:
    |username|password|name|bool|
    |User    |user    |1   |true|
    |User2   |user2   |2   |false|