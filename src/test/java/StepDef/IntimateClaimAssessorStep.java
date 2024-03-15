package StepDef;

import PageObject.LifeClaims.IntimateClaimAssessor;
import PageObject.LifeClaims.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.pages.PageObject;

public class IntimateClaimAssessorStep extends PageObject {
    LoginPage LoginPage;
    IntimateClaimAssessor IntimateClaimAssessor;

    @Given("log in Life Claims  using a policy number  {string}")
    public void logInLifeClaimsUsingAPolicyNumberPolicyNumber(String PolicyNumber) throws InterruptedException {
        LoginPage.OpenWebsite();
        LoginPage.EnterPolicyNumber(PolicyNumber);
        LoginPage.ClickSearch();

    }



    @Then("A consultant changes roles to being an assessor and continues to intimate claim {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void aConsultantChangesRolesToBeingAnAssessorAndContinuesToIntimateClaimUserRrUserRiCommentCommentIICommentIIICommentIIIIFirstNameSnameStittleIdentityNoCellNoEmAd(String UserRr, String UserRi, String Comment, String CommentII, String CommentIII, String CommentIIII, String FirstName, String Sname,String Stittle,String IdentityNo,String CellNo,String EmAd) throws InterruptedException {


        IntimateClaimAssessor.NavigatesToWebsite();
        IntimateClaimAssessor.SUserC();
        IntimateClaimAssessor.SUserB();
        IntimateClaimAssessor.UserRoles(UserRr);
        IntimateClaimAssessor.highlightsDropDown();
        IntimateClaimAssessor.Savebutn();
        IntimateClaimAssessor.NavigatesBack();
      //  IntimateClaimAssessor.Det();
        IntimateClaimAssessor.CABurgerMenu();
        IntimateClaimAssessor.AssignToAssessor();
        IntimateClaimAssessor.AssessorCII();
        IntimateClaimAssessor.AddBTNII();
        IntimateClaimAssessor.NavigatesToWebsiteII();
        IntimateClaimAssessor.UserCII();
        IntimateClaimAssessor.UserBII();
        IntimateClaimAssessor.UserRoleII(UserRi);
        IntimateClaimAssessor.highlightDropDownI();
        IntimateClaimAssessor.SaveBttn();




// These are for policies that have warnings

//        IntimateClaimAssessor.RWarning();
//        IntimateClaimAssessor.WarningR();
//        IntimateClaimAssessor.RecommendWRComment(Comment);
//        IntimateClaimAssessor.SaveWBtn();
//        IntimateClaimAssessor.WarningRII();
//        IntimateClaimAssessor.WarningRR();
//        IntimateClaimAssessor.RecommendWRCommentII(CommentII);
//        IntimateClaimAssessor.SaveWBtnII();
//        IntimateClaimAssessor.WarningRIII();
//        IntimateClaimAssessor.WarningRRR();
//        IntimateClaimAssessor.RecommendWRCommentIII(CommentIII);
//        IntimateClaimAssessor.SaveWBtnIII();
//        IntimateClaimAssessor.WarningRIIII();
//        IntimateClaimAssessor.WarningRRRR();
//        IntimateClaimAssessor.RecommendWRCommentIIII(CommentIIII);
//        IntimateClaimAssessor.SaveWBtnIIII();


    }


}