Feature: Life Claims


  Scenario Outline:A consultant  navigates to user management and  assign to assessor  then reccomends warning removal as an assessor
    Given  log in Life Claims  using a policy number  '<PolicyNumber>'
    Then  A consultant changes roles to being an assessor and continues to intimate claim '<UserRr>','<UserRi>','<Comment>','<CommentII>','<CommentIII>','<CommentIIII>','<FirstName>','<Sname>','<Stittle>','<IdentityNo>','<CellNo>','<EmAd>'

    Examples:
    |PolicyNumber|UserRr        |UserRi  |Comment  |CommentII|CommentIII | CommentIIII|FirstName|Sname|Stittle|IdentityNo   |CellNo    |EmAd         |
    |612718865   |Claims Manager|Assessor|CommentII|CommentII|Life Claims|Life Claims |Temoso   |Memo |Miss   |9902197343278|0736369275|Tem@gmail.com|