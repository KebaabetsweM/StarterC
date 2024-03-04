Feature: Intimate Claim as  Manager

    Scenario Outline: Log into claims and continue to intimate a claim as a manager
    Given a manager logs into life claims and enters a policy number '<PolicyNumber>'
    Then a manager approves comments '<UserRM>','<Comms>','<Comms2>','<Comms3>','<Comms4>'
      Examples:
        |PolicyNumber| UserRM       | Comms     | Comms2    | Comms3    | Comms4    |
        |616251153   |Claims Manager|Life Claims|Life Claims|Life Claims|Life Claims|
