Feature: Claims Intimation

  Scenario Outline: Navigate as mannager and finalize the claim
    Given a consultant logs into claim '<PolicyNumber>'
    Then   pays claim  '<UserRM>', '<ReccoComm>', '<ReccoCommII>','<ReccoCommIII>','<ReccoComIIII>','<ReccoComL>'


  Examples:
  |PolicyNumber|UserRM        |ReccoComm |ReccoCommII|ReccoCommIII|ReccoComIIII|ReccoComL |
  |616211465   |Claims Manager|LifeClaims|LifeClaims |LifeClaims  |LifeClaims  |LifeClaims|