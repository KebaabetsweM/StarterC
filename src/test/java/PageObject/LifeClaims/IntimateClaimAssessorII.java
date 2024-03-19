package PageObject.LifeClaims;

import io.cucumber.java.ja.且つ;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class IntimateClaimAssessorII extends PageObject {
    String FindUserXpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[618]";
    String UpdateUserDetailsXpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[618]/td[6]/button";
    String UserRoleXpath = "//select[@id='UserRole']";
    String SaveBtnXpath = "//*[@id=\"modalFormSubmit\"]";
    String MyClaimsAXpath = "//*[@id=\"menuClaimsAssess\"]/a";
    //String NextContactXpath = "//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[1]/div[1]/ul/li[8]/a";
    //Temp


    String DDetailsXpath = "//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[2]/table/tbody/tr/td[10]"; // Alaways change Xpath
    String CommpletePolicyXpath = "//*[@id=\"tab-claimEvents\"]/div/div/div/div[1]/h3/a";
    String ClaimantAXpath = "//*[@id=\"MainDiv\"]/div[1]/div/div/div/div[3]/button";
    String FailedToContactXpath = "//*[@id=\"MainDiv\"]/div[1]/div/div/div/div[3]/ul/li[2]/a";
    String FaildCCommentXpath = "//*[@id=\"txtComment\"]";
    String FCSaveBtnXpath = "//*[@id=\"btnSaveComment\"]";
    String DocAXpath = "//*[@id=\"documentList\"]/li/a[1]";
    String PageXpath = "//*[@id=\"ulPages\"]/li/a/img";
    String SearchBoxXpath = "//*[@id=\"txtSearch\"]";
    String USearchBtnXpath = "//*[@id=\"btnSearch\"]";
    String CheckboxXpath = "//*[@id=\"searchResults\"]/table/tbody/tr[1]/td[1]"; //change xpath of the person you are uploading for
    String SDropdownXpath = "//*[@id=\"ddRequirementTypes\"]";
    String AttachPXpath = "//*[@id=\"btnAttach\"]";
    // //*[@id="btnAttach"]
    String DocXpath = "//*[@id=\"drop1\"]";
    String UploadDocXpath = "//*[@id=\"menuUploadDoc\"]/a";
    String UploadXpath = "//*[@id=\"btnUpload\"]";
    String AttachXpath = "//*[@id=\"menuAttachDoc\"]/a";


    String CRequirementsXpath = "//a[normalize-space()='Requirements']";
    //                           //*[@id="adde3cfd-d8c4-ccba-4524-08dc231b4d7b"]/div/div/ul/li[2]/a
    String DocReviewIDXpath = "//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[2]/td[2]/div[2]";
    String DocReviewCFormXpath = "//*[@id=\"requirementMainDiv-1ccce18f-8b08-c99e-104c-08dc3e88b45d\"]/table[1]/tbody/tr[1]/td[2]/div[2]"; //Depends on how many requirements are there

    String PageClickXpath = "//li[1]//a[1]//img[1]"; //Always change xpath
    String PageClickIIXpath = "//*[@id=\"main\"]/div[2]/div[1]/div/li[1]/a/img";
    String AproveAllXpath = "//button[@id='btnAcceptAll']";
    String ApproveIDXpah = "//*[@id=\"btnAcceptAll\"]";

    String NewDocXpath = "//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[1]/div[1]/ul/li[6]/a";
    String NEWDocDetailsXpath = "//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[2]/table/tbody/tr[5]/td[10]"; //always change xpath  index xpath (change number)
    String ClickPolicyXpath = "//*[@id=\"tab-claimEvents\"]/div/div/div/div[1]/h3/a";


    String CompleteBIDXpath = "//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[2]/td[6]/div[1]/div[1]/button";
    String CompleteIDBtnXpath = "//*[@id=\"requirementMainDiv-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/table[1]/tbody/tr[2]/td[6]/div[1]/div[1]/ul/li[1]/a";

    String CompleteBLifePXpath = "//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[7]/td[6]/div[1]/div[1]/button"; //Alaways change xpath
    String FCompleteXpath = "//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[7]/td[6]/div[1]/div[1]/ul/li[1]/a";

    String BurgerMenuDeathCXpath = "//*[@id=\"requirementMainDiv-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/table[1]/tbody/tr[3]/td[6]/div[2]/div/button";
    String NotRequiredDeathCXpath = "//*[@id=\"requirementMainDiv-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/table[1]/tbody/tr[3]/td[6]/div[2]/div/ul/li[1]/a";

    String BurgerMenuAffidavitXpath = "//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[6]/td[6]/div[1]/div[1]/button";
    String NotRequiredAffidavitXpath = "//*[@id=\"requirementMainDiv-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/table[1]/tbody/tr[4]/td[6]/div[2]/div/ul/li[1]/a";

    String BurgerMenuCoverSXpath = "//*[@id=\"requirementMainDiv-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/table[1]/tbody/tr[5]/td[6]/div[2]/div/button";
    String NotRequiredCoverSXpath = "//*[@id=\"requirementMainDiv-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/table[1]/tbody/tr[5]/td[6]/div[2]/div/ul/li[1]/a";

    String DeathCXpath = "(//button[@data-toggle='dropdown'])[39]";
    String NADeathXpath = "//*[@id=\"requirementMainDiv-1ccce18f-8b08-c99e-104c-08dc3e88b45d\"]/table[1]/tbody/tr[3]/td[6]/div[2]/div/ul/li[1]/a";

    String ClaimsXpath = "//*[@id=\"c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/div/div/ul/li[1]/a"; //change xpath
    String AddBenBurgerMenXpath = "(//button[@title='Click to see claim actions'])[4]"; //change xpath
    String OpAddBenXpath = "(//a[@data-bind='click: Clientele.ClaimGroup.Claim.AddBeneficary.bind($data, claimId(), claimEventId(), policyNumber())'][normalize-space()='Add Beneficiary'])[2]";
    String AddBtnXpath = "//*[@id=\"tblPolicyIndividuals\"]/tbody/tr[1]/td[4]/button";
    String CloseXpath = "//*[@id=\"payments-modal\"]/div[1]/button";
    String ActionsDropdownXpath = "btn dropdown-toggle"; //CLASSNAME
    String VerBXpath = "//*[@id=\"tabClaims-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[18]/div/ul/li[1]/a";  //Change Xpath


    String AccTypeXpath = "//*[@id=\"beneficiaryEditModalAccountType\"]";
    String BankNXpath = "//*[@id=\"beneficiaryEditModalBankDropDown\"]";
    String AccountNumXpath = "//*[@id=\"beneficiaryEditModalAccountNumber\"]";
    String BranchCode = "//*[@id=\"beneficiaryEditModalBankBranchCode\"]";
    String BenSelectionBtnXpath = "//*[@id=\"beneficiaryEditModalSave\"]";
    String ActionsXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[18]/div/a";
    String VerifyXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[18]/div/ul/li[4]/a";
    String RIXpath = "//*[@id=\"tab-claimEvents\"]/div/div/div/div[1]/div/div[19]/div/div/button";
    String ReccomendPIXpath = "//*[@id=\"tab-claimEvents\"]/div/div/div/div[1]/div/div[19]/div/div/ul/li[2]/a";
    String CommentTxtBXpath = "//*[@id=\"txtComment\"]";
    String SvBtnXpath = "//*[@id=\"btnSaveComment\"]";
    String RecoIIIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[7]/div[7]/div[1]/div[1]/button";
    String ReccoIIIXpath = "//*[@id=\"tabClaims-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/div[1]/div/div/div/div/div[10]/div[7]/div[1]/div[1]/ul/li[2]/a";
    String SVBtnXpath = "//*[@id=\"btnSaveComment\"]";
    String YesOptXpath = "//*[@id=\"bsPromptModalPositiveBtn\"]";
    String RecoIIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[4]/div[7]/div[1]/div[1]/button";
    String ReccoIIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[4]/div[7]/div[1]/div[1]/ul/li[2]/a";
    String RecoIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[1]/div[7]/div[1]/div[1]/button";
    String ReccoIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[1]/div[7]/div[1]/div[1]/ul/li[2]/a";
    String DignityPlanXpath = "//*[@id=\"chkClaimsToRecommendForPayment\"]/option[1]";
    String PayIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[1]/div[9]/div[3]/div/button";
    String CBAccountXpath = "//*[@id=\"tabClaims-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[18]/div/ul/li[5]/a";

    String PolicyClaimBXpath = "(//button[@class='btn btn-mini btn-primary dropdown-toggle'])[28]";
    String PolicyClaimCompleteXpath = "//div[@class='btn-group pull-right open']//a[@data-bind='click: Clientele.ClaimGroup.Requirement.RequirementNotRequired.bind($data, claimEventId(), requirementId())'][normalize-space()='Not Required']";

    String IDInsuredBXpath = "(//button[@data-toggle='dropdown'])[36]";
    String IDInsuredCompleteXpath = "//div[@class='btn-group pull-right open']//a[@data-bind='click: Clientele.ClaimGroup.Requirement.RequirementCompelte.bind($data, claimEventId(), requirementId())'][normalize-space()='Complete']";
    String DeathComXpath = "(//button[@class='btn btn-mini btn-primary dropdown-toggle'])[28]";
    String NRXpath = "//*[@id=\"requirementMainDiv-1ccce18f-8b08-c99e-104c-08dc3e88b45d\"]/table[1]/tbody/tr[3]/td[6]/div[2]/div/ul/li[1]/a";


    //If a beneficiary doesnt have a ID number, identify the beneficiary
    String ActionXpath = "//div[@class='btn-group open']//a[@class='btn dropdown-toggle'][normalize-space()='Actions']";
    String IdentifyIDBenXpath = "//*[@id=\"tabClaims-1ccce18f-8b08-c99e-104c-08dc3e88b45d\"]/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[18]/div/ul/li[1]/a";
    String BenIDSearchXpath = "//*[@id=\"SearchButton\"]";
    String FirstNameBenXpath = "//input[@id='first-name']";
    String SurnameBenXpath = "//*[@id=\"surname\"]";
    String BeneficiaryTypeBenXpath ="//*[@id=\"BeneficiaryType\"]";
    String SaveBenXpath = "//*[@id=\"modal-form-submit\"]";

    @Step("Navigate to user management and chabge roles to assessor")
    public void NavigatesToUmanager() throws InterruptedException {
        Thread.sleep(3000);
        getDriver().navigate().to("http://claimstest.clientele.local/usermanagement");
        getDriver().manage().window().maximize();
    }

    @Step("Click on the user of your choice ")
    public void UserCA() throws InterruptedException {
        Thread.sleep(2000);
        $(By.xpath(FindUserXpath)).click();
    }

    @Step("Click on the update user details button")
    public void UserA() {
        $(By.xpath(UpdateUserDetailsXpath)).click();
    }

    @Step("Select a user role")
    public void UserRoleA(String UserRA) throws InterruptedException {
        Thread.sleep(5000);
        WebElement Ur = $(By.xpath(UserRoleXpath));
        selectFromDropdown(Ur, UserRA);
    }

    @FindBy(id = "WorkPools")
    private WebElement WorkPools;


    @Step("Highlight Work Pools")
    public void highlightDropDownA() {
        Select select = new Select(WorkPools);

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        List<Integer> customIndices = Arrays.asList(4, 9, 2, 10, 7, 6, 5, 1, 8, 3);

        for (int customIndex : customIndices) {
            if (customIndex != 11) {
                select.selectByIndex(customIndex);

                WebElement selectedOption = select.getFirstSelectedOption();
                js.executeScript("arguments[0].style.backgroundColor = 'yellow';", selectedOption);

            }
        }
// Refresh basket manually
    }

    @Step("Click then save button")
    public void SaveBttnA() {
        $(By.xpath(SaveBtnXpath)).click();
    }


    @Step("Navigate back to claim group ")
    public void NavigateBackAsAnAssesssor() throws InterruptedException {
        getDriver().get("http://claimstest.clientele.local/ClaimGroup/ClaimGroupIndex?claimGroupId=3953c294-8a4e-c8e1-bee7-08dc3e886550");
        getDriver().navigate().refresh();
        Thread.sleep(2000);
    }

    @Step("Click on  my claims")
    public void MClaimsS() {
        $(By.xpath(MyClaimsAXpath)).click();
    }

    @Step("Click on next contact")
    public void NxtContact() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement fieldText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[1]/div[1]/ul/li[8]/a")));
        fieldText.click();
    }

        @Step("Click on assessment")
                public void NewA(){
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
            WebElement fieldText = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='span3'] div:nth-child(1) ul:nth-child(1) li:nth-child(9) a:nth-child(1)")));
            fieldText.click();
        }




    @Step("Click on the details of the person")
    public void DetailsX() {
        $(By.xpath(DDetailsXpath)).click();
    }

    @Step("Click on the complete policy")
    public void Cpolicy() {
        $(By.xpath(CommpletePolicyXpath)).click();
    }

    @Step("Click on Claimant")
    public void ClaimantA() {
        $(By.xpath(ClaimantAXpath)).click();

    }

    @Step("Click on failed to contact claimant")
    public void FClaimant() {
        $(By.xpath(FailedToContactXpath)).click();
    }

    @Step("Fail to cotact claimant comment")
    public void FCCComment(String FailedC) {
        WebElement fieldText = $(By.xpath(FaildCCommentXpath));
        fieldText.click();
        fieldText.sendKeys(FailedC);
    }

    @Step("Save comment")
    public void SComment() {
        $(By.xpath(FCSaveBtnXpath)).click();
    }

    @Step("Click on documents")
    public void Doc() {
        $(By.xpath(DocXpath)).click();
    }

    @Step("Click on upload document")
    public void UDoc() {
        $(By.xpath(UploadDocXpath)).click();
    }

    @Step("Upload file ")
    public void UpClaimForm() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement uploadFile = $(By.id("file"));
        uploadFile.sendKeys("C:\\Users\\kmolale\\Downloads\\Claim Form.pdf");
//"C:\\Users\\kmolale\\Downloads\\CLAIMS.pdf"
    }

    @Step("Final Upload button")
    public void FUpload() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(UploadXpath)).click();
    }

    @Step("Click on documents")
    public void Doc2() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(DocXpath)).click();
    }

    @Step("Click on attach pages")
    public void AttachPg() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(AttachXpath)).click();
    }

    @Step("Click on the document first")
    public void DocCA() {
        $(By.xpath(DocAXpath)).click();
    }

    @Step("Click on the document to appear")
    public void DPageXpath() {
        $(By.xpath(PageXpath)).click();
    }

    @Step("Click on the searchbox and insert S number")
    public void Sbox(String SearchB) throws InterruptedException {
        Thread.sleep(3000);
        WebElement fieldText = $(By.xpath(SearchBoxXpath));
        fieldText.click();
        fieldText.sendKeys(SearchB);
    }

    // S0226797
    @Step("Click on the search btn")
    public void Sbtn() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(USearchBtnXpath)).click();
    }

    @Step("Select the person who passed on")
    public void CheckB() {
        $(By.xpath(CheckboxXpath)).click();

    }

    @Step("Select the document attached")
    public void DocAA(String SpecA) throws InterruptedException {
        Thread.sleep(5000);
        WebElement dropdown = $(By.xpath(SDropdownXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(SpecA);
    }

    @Step("Click on the document first")
    public void DocC() {
        $(By.xpath(DocAXpath)).click();
    }

    @Step("Select the document attached")
    public void DocA(String Spec) throws InterruptedException {
        Thread.sleep(2000);
        WebElement dropdown = $(By.xpath(SDropdownXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(Spec);
    }

    @Step("Click on the attach page button")
    public void APage() {
        $(By.xpath(AttachPXpath)).click();
    }

    @Step("Upload file ")
    public void UpID() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement uploadFile = $(By.id("file"));
        uploadFile.sendKeys("C:\\Users\\kmolale\\Downloads\\ID COPY.pdf");

    }

    @Step("Click on  my claims")
    public void MClaims() {
        $(By.xpath(MyClaimsAXpath)).click();
    }

    @Step("Click on  my claims")
    public void temp () {
        $(By.xpath("//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[1]/div[1]/ul/li[7]/a")).click();
    }
    @Step("Click on new documents")
    public void NDoc() {
        $(By.xpath(NewDocXpath)).click();
    }

    @Step("Click on assessment")
    public void nxt() {
        $(By.xpath("//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[1]/div[1]/ul/li[7]/a")).click();
        //
    }

    @Step("Click on details")
    public void Dets() {
        $(By.xpath("//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[2]/table/tbody/tr[4]/td[10]")).click();
    }

    @Step("Click on the new document details")
    public void DocDetails() {
        $(By.xpath(NEWDocDetailsXpath)).click();  // for uploading files
    }

    @Step("Click on the policy")
    public void CPolicy() {
        $(By.xpath(ClickPolicyXpath)).click();

    }

    @Step("Click on actions")
    public void Actions() {
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(18) > div:nth-child(1) > a:nth-child(1)")).click();
    }

    @Step("Click on verify account holder option")
    public void VAcc() {
        $(By.xpath("//*[@id=\"tabClaims-1ccce18f-8b08-c99e-104c-08dc3e88b45d\"]/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[18]/div/ul/li[4]/a")).click();
    }


    @Step("Click on the first burger menue a")
    public void BurgerI() {
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")).click();
    }

    @Step("Click on the reccomendation payment")
    public void Reco() {
        $(By.cssSelector("div[class='btn-group pull-right open'] a[data-bind='click: Clientele.ClaimGroup.Claim.OnRecommendationClaimPaymentClick.bind($data, claimId(), claimEventId())']")).click();
        ;
    }

    @Step("Comment")
    public void CommentR(String Recco) {
        WebElement ReccomendC = $(By.xpath(CommentTxtBXpath));
        ReccomendC.click();
        ReccomendC.sendKeys(Recco);
    }
//    @Step("Choose an option the dropbox")
//    public void Opt() {
//        $(By.xpath(DignityPlanXpath)).click();

    //    }

    @Step("Click on Yes Warning")
    public void WYes(){
        $(By.xpath("//*[@id=\"bsPromptModalPositiveBtn\"]")).click();
    }
    @Step("Save the Comment afterwards")
    public void SCommentBtnII() {
        $(By.xpath(SvBtnXpath)).click();
    }

    @Step("Click on the first burger menue")
    public void RecoIII() {
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(10) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")).click();
    }

    @Step("Click on the reccomendation payment")
    public void ReCcoIII() {
        $(By.xpath(ReccoIIIXpath)).click();
    }

    @Step("Save the Comment afterwards")
    public void SCommentBtn() {
        $(By.xpath(SVBtnXpath)).click();
    }

    @Step("Click on yes in the popup")
    public void Yes() {
        $(By.xpath(YesOptXpath)).click();
    }

    @Step("Click on the first burger menue a")
    public void BurgerII() {
        $(By.xpath("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(7) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")).click();
    }

    @Step("Click on the reccomendation payment")
    public void RecoII() {
        $(By.xpath(ReccoIIXpath)).click();
    }

    @Step("Click on the first burger menue a")
    public void BurgerIX(){

        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(7) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > i:nth-child(1)")).click();
    }

    @Step("Click on the reccomendation payment")
    public void RecoI() {
        $(By.cssSelector("div[class='btn-group pull-right open'] a[data-bind='click: Clientele.ClaimGroup.Claim.OnRecommendationClaimPaymentClick.bind($data, claimId(), claimEventId())']")).click();
        ;
    }

    @Step("Choose an option the dropbox")
    public void Opt() {
        $(By.xpath(DignityPlanXpath)).click();

    }
    @Step("Save the Comment afterwards")
    public void BurgerIIII() {
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(13) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")).click();

    }
    @Step("Recommend payment")
    public void RecP(){
        $(By.cssSelector("div[class='btn-group pull-right open'] a[data-bind='click: Clientele.ClaimGroup.Claim.OnRecommendationClaimPaymentClick.bind($data, claimId(), claimEventId())']")).click();
    }

    @Step("Click on confirm bank account")
    public void ConfirmBAccount() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(CBAccountXpath)).click();
    }

    @Step("Select account type")
    public void AccType(String AccT) {
        WebElement dropdown = $(By.xpath(AccTypeXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(AccT);
    }

    @Step("Select bank name")
    public void BankN(String BankNm) {
        WebElement dropdown = $(By.xpath(BankNXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(BankNm);
    }

    @Step("Enter account number")
    public void AccNo(String Acc) {
        WebElement AAccount = $(By.xpath(AccountNumXpath));
        AAccount.click();
        AAccount.sendKeys();

    }


    @Step("Enter the brunch code")
    public void BrunchC(String BCode) {
        WebElement BranchC = $(By.xpath(BranchCode));
        BranchC.click();
        BranchC.sendKeys(BCode);
    }

    @Step("Click on the save button")
    public void SSaveB() {
        $(By.xpath(BenSelectionBtnXpath)).click();
        //A LOT OF CLICKS
    }

//    @FindBy(id = "//span[@id='16ff67ef-38ff-cd0b-9cb0-08dc41b059fe']")//

    private WebElement textField;

    //f1e0e9bc-6091-c10d-c372-08dc41a6c95f
    //16ff67ef-38ff-cd0b-9cb0-08dc41b059fe
    @Step("Insert a percentage")
    public void Per(String Percentage) throws InterruptedException {
        String perc = "100.00";
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        Actions actions = new Actions(getDriver());
        textField = getDriver().findElement(By.xpath("//span[@id='16ff67ef-38ff-cd0b-9cb0-08dc41b059fe']"));
        jsExecutor.executeScript("arguments[0].click();", textField);

        jsExecutor.executeScript("arguments[0].innerText=arguments[1];", textField, Percentage);
        //jsExecutor.executeScript("document.getElementById('16ff67ef-38ff-cd0b-9cb0-08dc41b059fe').textContent = "+perc+";");
        //jsExecutor.executeScript("document.getElementById('nmbChanger-16ff67ef-38ff-cd0b-9cb0-08dc41b059fe').value='"+ perc +"';");

        jsExecutor.executeScript("arguments[0].click()", getDriver().findElement(By.xpath("//span[@id='f1e0e9bc-6091-c10d-c372-08dc41a6c95f']")));

        Thread.sleep(2000);


    }

    @FindBy(xpath = "//span[@id='76c22f5e-87be-c165-2342-08dc2d2af8fb']")
    private WebElementFacade textFields;

    @Step("Insert a percentageII")
    public void PerII(String PercentageII) throws InterruptedException {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();

        jsExecutor.executeScript("arguments[0].focus();", textFields);

        jsExecutor.executeScript("arguments[0].value = arguments[2];", textFields, PercentageII);
        $(By.xpath("(//div[@class='row'])[2]")).click();

        Thread.sleep(2000);

    }

    @FindBy(xpath = "(//span[@id='d429aeca-6971-c7a5-2344-08dc2d2af8fb'])[1]")

    private WebElementFacade PerField;

    @Step("Insert a percentageIII")
    public void PerIII(String PercentageIII) throws InterruptedException {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();

        jsExecutor.executeScript("arguments[0].focus();", PerField);

        jsExecutor.executeScript("arguments[0].value = arguments[2];", PerField, PercentageIII);
        $(By.xpath("(//div[@class='row'])[2]")).click();

        Thread.sleep(2000);

    }

    @Step("Click on the requirements")
    public void Req() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(CRequirementsXpath)).click();
    }

    @Step("Click on the burger menu of the life policy form")
    public void PolicyF() throws InterruptedException {
        Thread.sleep(5000);
        $(By.xpath(CompleteBLifePXpath)).click();
    }


    @Step("Click on complete Id")
    public void CID() {
        $(By.xpath("//*[@id=\"requirementMainDiv-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/table[1]/tbody/tr[2]/td[6]/div[1]/div[1]/ul/li[1]/a")).click();
    }

    @Step("Then click on complete")
    public void CComplete() {
        $(By.xpath(FCompleteXpath)).click();
    }
    @Step("Then click on complete")
    public void LifeP() {
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")).click();
    }
    @Step("Then click on complete")
    public void LifePComplete() {
        $(By.xpath("//*[@id=\"requirementMainDiv-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/table[1]/tbody/tr[1]/td[6]/div[1]/div[1]/ul/li[1]/a")).click();
    }
    @Step("Click on the ID burger menu")
    public void IDB() throws InterruptedException {
        Thread.sleep(5000);
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(6) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")).click();
    }

    @Step("Click on the burger menu of death certificate")
    public void DCertificate() {
        $(By.xpath(BurgerMenuDeathCXpath)).click();
    }

    @Step("Click on the burger menu of death certificate")
    public void HospitalPCF() {
        $(By.xpath("//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[5]/td[6]/div[2]/div/button")).click();
    }

    @Step("Click on the burger menu of death certificate")
    public void NAHospitalPCF() {
        $(By.xpath("//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[5]/td[6]/div[2]/div/ul")).click();
    }

    @Step("Click on not required")
    public void NRequired() {
        $(By.xpath(NotRequiredDeathCXpath)).click();

    }

    @Step("Click on the Affidavit burger menu ")
    public void AffidavitB() {
        $(By.xpath(BurgerMenuAffidavitXpath)).click();

    }

    @Step("Click on the HospitalPolicyCF burger menu ")
    public void HospitalPolicyCF() {
        $(By.xpath("//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[1]/td[6]/div[2]/div/button")).click();
    }

    @Step("Click on the HospitalPolicyCF burger menu ")
    public void NAHospitalPolicyCF() {
        $(By.xpath("//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[1]/td[6]/div[2]/div/ul/li[1]/a")).click();
    }

    @Step("Click on the Affidavit burger menu ")
    public void NAAffidavit() {
        $(By.xpath(NotRequiredAffidavitXpath)).click();
    }

    @Step("Click on the Complete clinic file burger menu ")
    public void ClinicFile() {
        $(By.xpath("//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[3]/td[6]/div[2]/div/button")).click();
    }

    @Step("Click on the Complete clinic file burger menu ")
    public void NAAClinicFile() {
        $(By.xpath("//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[3]/td[6]/div[2]/div/ul/li[1]/a")).click();
    }

    @Step("Click on the Complete XRay file burger menu ")
    public void XRay() {
        $(By.xpath("//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[4]/td[6]/div[2]/div/button")).click();
    }

    @Step("Click on the Complete XRay file burger menu ")
    public void NAXRay() {
        $(By.xpath("//*[@id=\"requirementMainDiv-a0924835-6fbd-cb66-9c8f-08dc37730695\"]/table[1]/tbody/tr[4]/td[6]/div[2]/div/ul/li[1]/a")).click();
    }


    @Step("Click on the Cover sheet burger menu ")
    public void CoverS() {
        $(By.xpath(BurgerMenuCoverSXpath)).click();
    }

    @Step("Click on the Cover sheet burger menu and click not required ")
    public void NACoverS() {
        $(By.xpath(NotRequiredCoverSXpath)).click();
    }


    @Step("Click on the life claim form document review ")
    public void LifeClaimFR() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement fieldText = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2) > div:nth-child(2)")));
        fieldText.click();
        fieldText.click();
    }


    @Step("Click on the Death certificate burger menu ")
    public void DeathC() {
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(6) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)")).click();
    }

    @Step("Click on the Death certificate burger menu and click not required ")
    public void NADeathC() {
        $(By.xpath("//*[@id=\"requirementMainDiv-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/table[1]/tbody/tr[3]/td[6]/div[2]/div/ul/li[1]/a")).click();
    }

    @Step("Click on the document view of the ID")
    public void DocView() throws InterruptedException {
        Thread.sleep(4000);
        $(By.xpath(DocReviewIDXpath)).click();
    }
//    @Step ("Click on the document view of the ID")
//    public void DocViewII()throws  InterruptedException{
//        Thread.sleep(4000);
//        $(By.xpath(DocReviewIDXpath)).click();


    @Step("Click on the document view of the ID")
    public void DocViewID() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        WebElement fieldText = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2) > div:nth-child(2)")));
        fieldText.click();
        fieldText.click();

        ;
    }

    @Step("Click on the page you want to be approved")
    public void PageC() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(PageClickXpath)).click();

    }

    @Step("Click on the page first before approving")
    public void PageV() {
        $(By.xpath(PageClickIIXpath)).click();

    }

//    @FindBy(xpath = "//button[contain(text(),'Approve All')]")
//    private WebElement button;

    @Step("ApProve all")
    public void ApProveA() throws InterruptedException {
//        $(By.cssSelector("#btnAccept")).click();

//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
//        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btnAccept")));
//        button.click();
//        WebElement button = getDriver().findElement(By.id("btnAcceptAll"));

//        Thread.sleep(1000);
//
//        $(By.id("btnAcceptAll")).click();






//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        WebElement button =  wait.until( ExpectedConditions.elementToBeClickable(By.cssSelector("button#btnAcceptAll.btn.btn-primary")));
//
//        Actions actions = new Actions(getDriver());
//        actions.moveToElement(button).click().perform();



//        button.click();
//   jse.executeScript("arguments[0].click()=arguments[1];", button);
//        WebElement button = getDriver().findElement(By.id("btnAcceptAll"));
//        button.click();

//
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnAcceptAll")));
//        button.click();

//
//
//        WebElement button = getDriver().findElement(By.id("btnAcceptAll"));
//        if (button.isEnabled()) {
//            button.click();
//        } else {
//            // Handle disabled button scenario
//        }


//        WebElement button = getDriver().findElement(By.id("btnAcceptAll"));
//        Actions actions = new Actions( getDriver());
//        actions.moveToElement(button).click().perform();
//
//        WebElement button = getDriver().findElement(By.id("btnAcceptAll"));
        JavascriptExecutor jse = (JavascriptExecutor) getDriver(); // Cast the driver object
        jse.executeScript("document.querySelector(\"#btnAccept\")");

        Thread.sleep(5000);
//        button.click();
//       $(By.xpath("//button[contains(text(),'Approve All')]")).click();
//       $(By.xpath("//button[@id='btnAcceptAll']")).click();
//
    }

    @Step("Click on claims")
    public void CClaims() {
        $(By.xpath(ClaimsXpath)).click();
    }

    @Step("Add beneficiary")
    public void AddBen() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(AddBenBurgerMenXpath)).click();
    }

    @Step("Add Beneficiary")
    public void AddB() {
        $(By.xpath(OpAddBenXpath)).click();
    }

    @Step("Click on the add sign")
    public void AddS() {
        $(By.xpath(AddBtnXpath)).click();

    }

    @Step("Click on close")
    public void close() {
        $(By.xpath(CloseXpath)).click();
    }



    @Step("Click on verify beneficiary option")
    public void VBen() {
        $(By.xpath(VerBXpath)).click();
    }


    @Step("Click on the burger box of ID ")
    public void BoxID() {
        $(By.xpath(IDInsuredBXpath)).click();
    }

    @Step("Click on Complete ")
    public void BoxIDComplete() {
        $(By.xpath(IDInsuredCompleteXpath)).click();
    }

    @Step("Click on death certificate burger menu ")
    public void DeathCC() {
        $(By.xpath(DeathComXpath)).click();
    }

    @Step("Click on not applicable ")
    public void NotA() {
        $(By.xpath(NRXpath)).click();
    }


    @Step("Click on next contact")
    public void DetTempo() {
        $(By.xpath("(//td[@data-bind='click: Clientele.ClaimGroup.List.Details.bind($data, $root.userRole(), claimGroupId(), claimEventId())'][normalize-space()='Details'])[4]")).click();
    }


    @Step("Click on  actions ")
    public void Act(){
        $(By.xpath("//*[@id=\"tabClaims-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[18]/div/a")).click();
    }

    @Step("Verify ben")
    public void VerBen(){
        $(By.xpath("//*[@id=\"tabClaims-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[18]/div/ul/li[7]/a")).click();
    }
    @Step("Click identify beneficiary")
    public void BenID() {

        $(By.xpath(IdentifyIDBenXpath)).click();


    }

    @Step("Enter Beneficiary ID on input field text")
    public void BenIDInput(String  BenIDS) {
        WebElement fieldText = $(By.id("beneficiary-search-input"));
        fieldText.click();
        fieldText.sendKeys(BenIDS);

    }
    @Step("Click  OK button to capture ID")
    public void ClickSearch() throws InterruptedException {
        Thread.sleep(3000);

        $(By.xpath(BenIDSearchXpath)).click();
    }
    @Step("Enter beneficiary surname")
    public void SurBen(String BenSur) {
        WebElement fieldText = $(By.xpath(SurnameBenXpath));
        fieldText.click();
        fieldText.sendKeys(BenSur);
    }
    @Step("Enter beneficiary name")
    public void NameBen(String BenName) {
        WebElement fieldText = $(By.xpath(FirstNameBenXpath));
        fieldText.click();
        fieldText.sendKeys(BenName);
    }

    @Step("Select a beneficiary type")
    public void BType(String Bentittle) {
        WebElement dropdown = $(By.xpath(BeneficiaryTypeBenXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(Bentittle);
    }
    @Step("Click on save")
    public void SaveBtn() throws InterruptedException {
        Thread.sleep(3000);

        $(By.xpath(SaveBenXpath)).click();
    }

}