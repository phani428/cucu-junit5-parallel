Feature: In plan management, View and edit a plan


  @regression
  @cbb-db
  Scenario Outline: In plan management, verify DB connection for TCID:"<TCID-CBB>"
    Given I should be able to connect to CBB1 DB
    Given I should be able to connect to CBB2 DB
    Given I should be able to connect to Mongo DB

    @ex1
    Examples:
      | TCID-CBB | Description          |
      | 1        | View and edit a plan |
     | 2        | View and edit a plan |

    @ex2
    Examples:
      | TCID-CBB | Description          |
      | 3        | View and edit a plan |
      | 4        | View and edit a plan |

  @cbb-db
  Scenario Outline: In plan management, verify DB connection for TCID:"<TCID-CBB>"
    Given I should be able to connect to CBB1 DB
    Given I should be able to connect to CBB2 DB
    Given I should be able to connect to Mongo DB

    Examples:
      | TCID-CBB | Description          |
      | 1        | View and edit a plan |
      | 2        | View and edit a plan |