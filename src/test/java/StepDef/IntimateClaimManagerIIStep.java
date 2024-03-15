package StepDef;

import PageObject.LifeClaims.IntimateClaimManagerII;
import PageObject.LifeClaims.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class IntimateClaimManagerIIStep {
    LoginPage LoginPage;
    IntimateClaimManagerII IntimateClaimManagerII;


    @Given("a consultant logs into claim {string}")
    public void aConsultantLogsIntoClaimPolicyNumber(String PolicyNumber ) throws InterruptedException {
        LoginPage.OpenWebsite();
        LoginPage.EnterPolicyNumber(PolicyNumber);
        LoginPage.ClickSearch();
    }
    @Then("pays claim  {string}, {string}, {string},{string}")
    public void paysClaimUserRMReccoCommReccoCommIIReccoCommIII(String UserRM, String ReccoCom, String ReccoComII, String ReccoComIII) throws InterruptedException {

        IntimateClaimManagerII.NavigatesToUmanager();
        IntimateClaimManagerII.UserCA();
        IntimateClaimManagerII.UserA();
        IntimateClaimManagerII.UserRoleM(UserRM);
        IntimateClaimManagerII.highlightDropDownA();
        IntimateClaimManagerII.SaveBttnA();
        IntimateClaimManagerII.NavigateBackAsManagerr();

//
//        IntimateClaimManagerII.Pay();
//        IntimateClaimManagerII.BatchPay();


        IntimateClaimManagerII.ManageT();
        IntimateClaimManagerII.PaymentAp();
        IntimateClaimManagerII.DetailsAp();
        IntimateClaimManagerII.DetailsTab();
//

//        IntimateClaimManagerII.MBurgerI();
//        IntimateClaimManagerII.PayC();
//        IntimateClaimManagerII.PopUp();
//        IntimateClaimManagerII.Comments(ReccoCom);
//        IntimateClaimManagerII.SCommentBtnII();
        IntimateClaimManagerII.MBurgerII();
        IntimateClaimManagerII.PayCII();
        IntimateClaimManagerII.PopUp();
        IntimateClaimManagerII.CommentsII(ReccoComII);
        IntimateClaimManagerII.SCommentBtnII();

//        IntimateClaimManagerII.MBurgerIII();
//        IntimateClaimManagerII.PayCIII();
//        IntimateClaimManagerII.PopUp();
//        IntimateClaimManagerII.CommentsIII(ReccoComIII);
//        IntimateClaimManagerII.SCommentBtnII();



    }



}
