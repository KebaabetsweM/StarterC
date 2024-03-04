Feature: Intimate Claim as  Client service

  Scenario Outline: Log into claims and intimate a claim as client service
    Given a consultant logs into life claims and enters a policy number '<PolicyNumber>'
    Then a consultant then begins to intimate '<InsL>','<mainLifeDOA>','<mainLifeDOD>','<FirstName>','<Sname>','<Stittle>','<IdentityNo>','<CellNo>', '<EmAd>'


    Examples:
      |PolicyNumber|InsL                                |mainLifeDOA|mainLifeDOD|FirstName|Sname|Stittle|IdentityNo   |CellNo    |EmAd            |
      |612718865   |Tshoba, Nomvuyo Ethelda (1964/07/27)|14/02/2024 |18/02/2024 |Kelo     |Phelo|Miss   |9601315914727|0823633636|kphelo@gmail.com|