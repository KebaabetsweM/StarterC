package StepDef;

import PageObject.LifeClaims.IntimateClaimManager;
import PageObject.LifeClaims.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class IntimateClamManagerStep {
    LoginPage LoginPage;
    IntimateClaimManager IntimateClamManager;

    @Given("a manager logs into life claims and enters a policy number {string}")
    public void aManagerLogsIntoLifeClaimsAndEntersAPolicyNumberPolicyNumber(String PolicyNumber) throws InterruptedException {
        LoginPage.OpenWebsite();
        LoginPage.EnterPolicyNumber(PolicyNumber);
        LoginPage.ClickSearch();
    }

    @Then("a manager approves comments {string},{string},{string},{string},{string}")
    public void aManagerApprovesCommentsUserRMCommsCommsCommsComms(String UserRM, String Comms, String Comms2, String Comms3, String Comms4) throws InterruptedException {
        IntimateClamManager.NavigatesToUserM();
        IntimateClamManager.UserMM();
        IntimateClamManager.UserM();
        IntimateClamManager.UserRoleM(UserRM);
        IntimateClamManager.DrpownHiglight();
        IntimateClamManager.SaveButtn();
        IntimateClamManager.NavigateBackAsManager();
        IntimateClamManager.ManageTab();
        IntimateClamManager.WarningRemove();
        IntimateClamManager.WarningRD();
        IntimateClamManager.Assess();
        IntimateClamManager.RW1();
        IntimateClamManager.RWW1();
        IntimateClamManager.Com1(Comms);
        IntimateClamManager.SaveB();
        IntimateClamManager.RW2();
        IntimateClamManager.RWW2();
        IntimateClamManager.Com2(Comms2);
        IntimateClamManager.SaveBt();
        IntimateClamManager.RW3();
        IntimateClamManager.RWW3();
        IntimateClamManager.Com3(Comms3);
        IntimateClamManager.SaveButn();
        IntimateClamManager.RW4();
        IntimateClamManager.RWW4();
        IntimateClamManager.Com4(Comms4);
        IntimateClamManager.SvButton();
    }
}
