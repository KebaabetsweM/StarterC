package StepDef;

import PageObject.LifeClaims.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import net.serenitybdd.core.pages.PageObject;

public class LoginStep extends PageObject {

    @Steps
    LoginPage LoginPage;

    @Given("a consultant opens claims website")
    public void a_consultant_opens_claims_website() throws InterruptedException {
        LoginPage.OpenWebsite();

    }

    @Then("log in using a policy number  {string}")
    public void log_in_using_a_policy_number(String PolicyNumber) throws InterruptedException {
        LoginPage.EnterPolicyNumber(PolicyNumber);
        LoginPage.ClickSearch();
    }
}
