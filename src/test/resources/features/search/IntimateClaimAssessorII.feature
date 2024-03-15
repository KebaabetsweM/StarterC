Feature: Life Claims


  Scenario Outline: A consultant  navigates to user management and  assign to assessor  and completes the claim
    Given  log in Life Claims  using a policy number , '<PolicyNumber>'
    Then  A consultant changes roles to being an assessor and continues to intimate claim  '<FailedC>', '<SearchB>', '<Spec>', '<SpecA>', '<Percentage>', '<PercentageII>','<PercentageIII>', '<AccT>','<BankNm>', '<BCode>', '<Acc>', '<Recco>', '<ReccoI>', '<ReccoII>', '<ReccoIII>','<BenName>','<BenSur>','<Bentittle>','<BenIDS>'

    Examples:
    |PolicyNumber |FailedC    |SearchB |Spec                                    |SpecA                              |UserRM        |Percentage|PercentageII|PercentageIII|AccT   |BankNm          |BCode |Acc       |Recco      |ReccoI     |ReccoII     |ReccoIII     |BenIDS       |BenName|BenSur  |Bentittle     |
    |616211465    |Life Claims|S0226886|Life Policy Claim Form (Certified Copy) |ID of Insured Life (Certified Copy)|Claims Manager|100.00    |100.00      |100.00       |Savings|CAPITEC BANK LTD|470010|1209663749|Life Claims|Life Claims|Life Claims |Life Claims  |9603119526699|Fankomo|Patricia|Natural Person|



#     '<ReccoComm>', '<ReccoCommII>', '<ReccoCommIII>'
#  ReccoComm |ReccoCommII|ReccoCommIII|
#  LifeClaims|LifeClaims |LifeClaims  |
#UserRM