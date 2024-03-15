Feature: Intimate Claim as  Client service

  Scenario Outline: Log into claims and intimate a claim as client service
    Given a consultant logs into life claims and enters a policy number '<PolicyNumber>'
    Then a consultant then begins to intimate '<InsL>','<mainLifeDOA>','<mainLifeDOD>','<FirstName>','<Sname>','<Stittle>','<IdentityNo>','<CellNo>', '<EmAd>'


    Examples:
      |PolicyNumber|InsL                                   |mainLifeDOA|mainLifeDOD|FirstName|Sname |Stittle|IdentityNo   |CellNo    |EmAd           |
      | 616211465  |Hlongwani, Nomsa Catherine (1981/02/13)|14/02/2024 |18/02/2024 |Lebitso  |Kolobe|Miss   |9503127830341|0827090989|herbs@gmail.com|


#Insured InsL
#  IdentityNo