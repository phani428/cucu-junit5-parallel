Feature: In plan management, View and edit a plan



  @cbb-db
  Scenario Outline: In plan management, verify DB connection for TCID:"<TCID-CBB>"
    Given I should be able to connect to CBB1 DB
    Given I should be able to connect to CBB2 DB
    Given I should be able to connect to Mongo DB

    @regression
    Examples:
      | TCID-CBB | Description          |
      | 1        | View and edit a plan |
      | 2        | View and edit a plan |