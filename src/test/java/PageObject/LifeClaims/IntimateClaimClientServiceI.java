package PageObject.LifeClaims;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

import java.security.Key;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntimateClaimClientServiceI extends PageObject {

    String UsermanagementURLXpath = "http://claimstest.clientele.local/usermanagement";
    String FindUserrXpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[618]";

    String DetailsXpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr/td[8]/a";
    //
    String ActivePolicyXpath = "//*[@id=\"accordionPolicy\"]/div/div[1]/h3/a";
    //
    String PolicyIndiviualXpath = "//*[@id=\"612718865\"]/div/div/ul/li[2]/a";
    //
    String InsuredLifeXpath = "//*[@id=\"InsuredLife\"]";


    String DeathClaimTypeXpath = "//*[@id=\"Death\"]/strong";
    String NaturalCauseOfDeathXpath = "//*[@id=\"Death-step1\"]/div/div/button[1]/strong";
    String UnnaturalCauseOfDeathXpath = "//*[@id=\"Death-step1\"]/div/div/button[2]";
    String DateODeathXpath = "//*[@id=\"dateEvent\"]";

    String HospitalXpath = "//*[@id=\"Hospital\"]";
    String AccidentXpath = "//*[@id=\"Hospital-step1\"]/div/div/button[2]/strong";
    String DOAXpath = "//*[@id=\"dateEvent\"]";
    String DODXpath = "//*[@id=\"dateHospitalDischarge\"]";

    String IntimatePathXpath = "//*[@id=\"IntimationForm\"]/fieldset/div/div[2]/div";


    String IntimateBtnXpath = "//*[@id=\"intimateClaimButton\"]";
    String PolicyTXpath = "//*[@id=\"matchingInsuredLivesTable\"]/tr[3]/td[6]/input";
    String ClickPolicyXpath = "//*[@id=\"tab-claimEvents\"]/div/div/div/div[1]/h3/a";
    String IntimateBtXpath = "//*[@id=\"intimateClaimButton\"]";
    String NCNameXpath = "//*[@id=\"ClaimantFirstName\"]";
    String NCSurnameXpath = "//*[@id=\"ClaimantSurname\"]";
    String NWTitleXpath = "//*[@id=\"ClaimantTitle\"]";
    String NWIDXpath = "//*[@id=\"ClaimantIdNumber\"]";
    String NCCellNumberXpath = "//*[@id=\"ClaimantCellNumber\"]";
    String NCEmailAddressXpath = "//*[@id=\"ClaimantEmailAddress\"]";

    String NWCreateClaimantXpath = "//*[@id=\"formSubmit\"]";


    @Step("Open Life Claims usermanagement")
    public void NavigatesToWebsiteII() throws InterruptedException {
        getDriver().get(UsermanagementURLXpath);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
    }


    @Step("Click on details of the policy of your choice ")
    public void Det() {
        $(By.xpath(DetailsXpath)).click();
    }

    @Step("Click on  the policy of your choice")
    public void CPolicy() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(ActivePolicyXpath)).click();


    }

    @Step("Click on Policy Individuals")
    public void PIndividuals() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(PolicyIndiviualXpath)).click();

    }

    @Step("Select the insured life")
    public void InsuredLifeXpath(String InsL) {
        WebElement dropdown = $(By.xpath(InsuredLifeXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(InsL);
    }

    @Step("Select claim type")
    public void ClaimT() {
        $(By.xpath(DeathClaimTypeXpath)).click();
    }

    @Step("Select cause of death")
    public void CODeath() {
        $(By.xpath(NaturalCauseOfDeathXpath)).click();
    }

    @Step("Enter date of  death")
    public void DOD() {


        $(By.xpath(DateODeathXpath)).click();

        WebElement datepicker = $(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]/a"));
        datepicker.click();
    }

    @Step("Click on the intimate button")
    public void IBtn() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(IntimateBtnXpath)).click();
    }

    @Step("Click on the policy tab")
    public void PTab() {
        $(By.xpath(PolicyTXpath)).click();
    }

    @Step("Click on the intimate btn for the second time")
    public void IntBtn() throws  InterruptedException{
        Thread.sleep(5000);
        $(By.xpath(IntimateBtXpath)).click();
    }

    @Step("Enter Name on field text")
    public void FirstName(String FirstName) {
        WebElement fieldText = $(By.xpath(NCNameXpath));
        fieldText.click();
        fieldText.sendKeys(FirstName);
    }

    @Step("Enter surname")
    public void Sur(String Sname) {
        WebElement fieldText = $(By.xpath(NCSurnameXpath));
        fieldText.click();
        fieldText.sendKeys(Sname);
    }

    @Step("Select a suitable title")
    public void STitle(String Stittle) {
        WebElement dropdown = $(By.xpath(NWTitleXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(Stittle);
    }

    @Step("Enter a correct ID")
    public void IdNo(String IdentityNo) {
        WebElement fieldText = $(By.xpath(NWIDXpath));
        fieldText.click();
        fieldText.sendKeys(IdentityNo);
    }

    @Step("Enter the correct cell number")
    public void CNum(String CellNo) {
        WebElement fieldText = $(By.xpath(NCCellNumberXpath));
        fieldText.click();
        fieldText.sendKeys(CellNo);
    }

    @Step("Enter email address")
    public void EmailAD(String EmAd) {
        WebElement fieldText = $(By.xpath(NCEmailAddressXpath));
        fieldText.click();
        fieldText.sendKeys(EmAd);

    }

    @Step("Click on create claimant")
    public void CreateC() {
        $(By.xpath(NWCreateClaimantXpath)).click();
    }


    @Step("Click on the hospital option on the claim type ")
    public  void HospitalClaimType(){
        $(By.xpath(HospitalXpath)).click();

}
@Step("Click on the accident option")
public  void AccidentAR(){
        $(By.xpath(AccidentXpath)).click();
}

    @Step("Enter the date of admission")
    public void SelectDoA(String mainLifeDOA) throws InterruptedException {
        Thread.sleep(5000);

        WebElement DoA = $(By.xpath(DOAXpath));

        DoA.click();

        DoA.sendKeys(mainLifeDOA + Keys.ENTER);
    }
    @Step("Enter the date of discharge")
    public void SelectDoD(String mainLifeDOD) throws InterruptedException {
        Thread.sleep(5000);

        WebElement DoD = $(By.xpath(DODXpath));

        DoD.click();

        DoD.sendKeys(mainLifeDOD + Keys.ENTER);
    }
    @Step("Click on intimate path")
    public  void Save  (){
        $(By.xpath(IntimatePathXpath)).click();

    }
}

