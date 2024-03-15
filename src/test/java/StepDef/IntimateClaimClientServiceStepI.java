package StepDef;

import PageObject.LifeClaims.IntimateClaimClientServiceI;
import PageObject.LifeClaims.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;




import net.serenitybdd.core.pages.PageObject;
public class IntimateClaimClientServiceStepI {

LoginPage LoginPage;
IntimateClaimClientServiceI IntimateClaimClientServiceI;

    @Given("a consultant logs into life claims and enters a policy number {string}")
    public void a_consultant_logs_into_life_claims_and_enters_a_policy_number(String PolicyNumber) throws InterruptedException {
        LoginPage.OpenWebsite();
        LoginPage.EnterPolicyNumber(PolicyNumber);
        LoginPage.ClickSearch();

    }
    @Then("a consultant then begins to intimate {string},{string},{string},{string},{string},{string},{string},{string}, {string}")
    public void aConsultantThenBeginsToIntimateInsLMainLifeDOAMainLifeDODFirstNameSnameStittleIdentityNoCellNoEmAd(String InsL, String mainLifeDOA, String mainLifeDOD, String FirstName,String Sname, String Stittle, String IdentityNo, String CellNo, String EmAd) throws InterruptedException {

//        IntimateClaimClientServiceI.Det();
        IntimateClaimClientServiceI.CPolicy();
        IntimateClaimClientServiceI.PIndividuals();
        IntimateClaimClientServiceI.InsuredLifeXpath(InsL);
        IntimateClaimClientServiceI.Death();
        IntimateClaimClientServiceI.Unatural();
//        IntimateClaimClientServiceI.SelectDoA(mainLifeDOA);
        IntimateClaimClientServiceI.SelectDoD(mainLifeDOD);
        IntimateClaimClientServiceI.Save();

//        IntimateClaimClientServiceI.IBtn();
//       // IntimateClaimClientServiceI.PTab();
//        IntimateClaimClientServiceI.IntBtn();
//
        IntimateClaimClientServiceI.Int();
        IntimateClaimClientServiceI.FirstName(FirstName);
        IntimateClaimClientServiceI.Sur(Sname);
        IntimateClaimClientServiceI.STitle(Stittle);
        IntimateClaimClientServiceI.IdNo(IdentityNo);
        IntimateClaimClientServiceI.CNum(CellNo);
        IntimateClaimClientServiceI.EmailAD(EmAd);
        IntimateClaimClientServiceI.CreateC();
    }
//Try and catch


}
