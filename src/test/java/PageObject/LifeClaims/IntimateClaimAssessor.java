package PageObject.LifeClaims;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class IntimateClaimAssessor extends PageObject {





    String UsermanagementURLXpath = "http://claimstest.clientele.local/usermanagement";

    String FindUserXpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[618]";

    String UpdateUserDetailsXpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[618]/td[6]/button";

    String UserRoleXpath = "//select[@id='UserRole']";
    String SaveBtnXpath = "//*[@id=\"modalFormSubmit\"]";

    String ABurgerMenuXpath = "//div[@data-bind=\"visible: $root.context() == 'ClaimGroup' && ($root.user().userRole() == 'ClaimsManager' || $root.user().userRole() == 'SystemAdministrator') && status() != 'Complete' && status() != 'Closed' && status() != 'Deleted' && status() != 'NoClaim' && status() != 'NoClaimant'\"]//button[@title='Click to see claim actions']";
    String AsignToAssessorXpath = "//a[normalize-space()='Assign To Assessor']";

    String AssessorXpath = "//*[@id=\"user-selector\"]/table/tbody/tr[52]/td[1]";


    String AddBtnXapth = "(//button)[71]";
    //



    String MyClaimsXpath = "//*[@id=\"menuClaimsAssess\"]/a";
    String CGDetailsXpath = "//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[2]/table/tbody/tr/td[10]";
    String PolicyHeaderXpath = "//*[@id=\"tab-claimEvents\"]/div/div/div/div[1]/h3/a";
    String AddCallamaintXpath = "//*[@id=\"MainDiv\"]/div[1]/div/div/div/div[1]/button";
    String FirstNameXpath = "//*[@id=\"FirstName\"]";
    String SurnameXpath = "//*[@id=\"Surname\"]";
    String TitleXpath = "//*[@id=\"Title\"]";
    String IDNoXpath = "//*[@id=\"IdNumber\"]";
    String DOBXpath = "//*[@id=\"DateofBirth\"]";
    String  CellNoXpath = "//*[@id=\"CellNumber\"]";
    String EmailAXpath = "//*[@id=\"EmailAddress\"]";
    String CreateClamaintBtnXpath = "//*[@id=\"formSubmit\"]";

    String BurgerMenuIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[1]/div[7]/div[1]/div[1]/button";




    String RecoWRIIIIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[10]/div[7]/div[1]/div[1]/ul/li[1]/a";
    String RecommendWRXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[1]/div[7]/div[1]/div[1]/button";
    String RecoWIIIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[7]/div[7]/div[1]/div[1]/ul/li[1]/a";
    String RecommendWRIIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[4]/div[7]/div[1]/div[1]/ul/li[1]/a";

    String ReccomendWRIIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[7]/div[7]/div[1]/div[1]/button";

    String ReccomendWRIIiXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[7]/div[7]/div[1]/div[1]/button";
    String ReccomendWRIIIiXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[10]/div[7]/div[1]/div[1]/button";
    String WarningComment = "//*[@id=\"txtComment\"]";
    String RecommendSaveBtn = "//*[@id=\"btnSaveComment\"]";

    String DetXpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr/td[8]/a";



// Inspect the button where i add myself as an assessor

    @Step("Open Life Claims usermanagement")
    public void NavigatesToWebsite() throws InterruptedException {
        getDriver().get(UsermanagementURLXpath);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);

    }

    @Step("Click on the user of your choice ")
    public void SUserC() throws InterruptedException {
        Thread.sleep(2000);
        $(By.xpath(FindUserXpath)).click();
    }


    @Step("Click on the update user details button")
    public void SUserB() {
        $(By.xpath(UpdateUserDetailsXpath)).click();
    }

    @Step("Select a user role")
    public void UserRoles(String UserRr) throws InterruptedException {
        Thread.sleep(2000);
        WebElement Ur = $(By.xpath(UserRoleXpath));
        selectFromDropdown(Ur, UserRr);
    }

    @FindBy(id = "WorkPools")
    private WebElement WorkPools;


    @Step("Highlight Work Pools")
    public void highlightsDropDown() {
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


    }


    @Step("Click the save button")
    public void Savebutn() {
        $(By.xpath(SaveBtnXpath)).click();
    }


   //Links differ
    @Step("Navigate back")
    public void NavigatesBack() throws InterruptedException {
        Thread.sleep(3000);
        getDriver().navigate().to("http://claimstest.clientele.local/ClaimGroup/ClaimGroupIndex?claimGroupId=e3028cfe-b210-ca85-a3ac-08dc42584989"); //Always change navigation url
        getDriver().navigate().refresh();

    }

    @Step("Click on the details")
    public void Det(){
        $(By.xpath("//a[@class='well accordion-toggle psCollapsible']")).click();
    }
    //Burger menu xpath differ
    @Step("Click on the burger menu")
    public void CABurgerMenu() {
        $(By.xpath(ABurgerMenuXpath)).click();
    }


    @Step("Click on assign to assessor")
    public void AssignToAssessor() {

        $(By.xpath(AsignToAssessorXpath)).click();

    }


    @Step("Click on the assessor of your choice")
    public void AssessorCII(){

        $(By.xpath(AssessorXpath)).click();
    }


    @Step("Click on the add on button")
    public void AddBTNII() {
        $(By.xpath(AddBtnXapth)).click();
    }


    @Step("Open Life Claims usermanagement")
    public void NavigatesToWebsiteII() throws InterruptedException {
        getDriver().get(UsermanagementURLXpath);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);


    }

        @Step("Click on the user of your choice ")
        public void UserCII() throws InterruptedException {
            Thread.sleep(2000);
            $(By.xpath(FindUserXpath)).click();
        }


        @Step("Click on the update user details button")
        public void UserBII() {
            $(By.xpath(UpdateUserDetailsXpath)).click();
        }

        @Step("Select a user role")
        public void UserRoleII(String UserRi) throws InterruptedException {
            Thread.sleep(2000);
            WebElement Ur = $(By.xpath(UserRoleXpath));
            selectFromDropdown(Ur, UserRi);
        }

        @FindBy(id = "WorkPools")
        private WebElement WorkPoolsI;


        @Step("Highlight Work Pools")
        public void highlightDropDownI() {
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
        public void SaveBttn() {
            $(By.xpath(SaveBtnXpath)).click();
        }




        @Step("Navigate back to claim group ")
        public void NavigateBackAsAssessor() throws InterruptedException {
        getDriver().get("http://claimstest.clientele.local/ClaimGroup/ClaimGroupIndex?claimGroupId=3953c294-8a4e-c8e1-bee7-08dc3e886550");
        getDriver().navigate().refresh();
        Thread.sleep(3000);
    }


    @Step("Click on MyClaims tab")
    public void MyLClaims() throws InterruptedException {
        Thread.sleep(9000);
        $(By.xpath(MyClaimsXpath)).click();
    }



// xpath differs
    //  Refresh
    @Step("Click on the details of your choice")
    public void CGDetailsII() {
        $(By.xpath(CGDetailsXpath)).click();
    }

    @Step("Click on the policy header")
    public void PolicyHeader() {
        $(By.xpath(PolicyHeaderXpath)).click();
    }
    @Step("Click on the policy header")
    public void AddClaimant() {
        $(By.xpath(AddCallamaintXpath)).click();
    }
    @Step("Enter Name on field text")
    public void FirstName(String FirstName) {
        WebElement fieldText = $(By.xpath(FirstNameXpath));
        fieldText.click();
        fieldText.sendKeys(FirstName);
    }

    @Step("Enter surname")
    public void Sur(String Sname) {
        WebElement fieldText = $(By.xpath(SurnameXpath));
        fieldText.click();
        fieldText.sendKeys(Sname);
    }

    @Step("Select a suitable title")
    public void STitle(String Stittle) {
        WebElement dropdown = $(By.xpath(TitleXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(Stittle);
    }

    @Step("Enter a correct ID")
    public void IdNo(String IdentityNo) {
        WebElement fieldText = $(By.xpath(IDNoXpath));
        fieldText.click();
        fieldText.sendKeys(IdentityNo);
    }

    @Step("Enter the correct cell number")
    public void CNum(String CellNo) {
        WebElement fieldText = $(By.xpath(CellNoXpath));
        fieldText.click();
        fieldText.sendKeys(CellNo);
    }

    @Step("Enter email address")
    public void EmailAD(String EmAd) {
        WebElement fieldText = $(By.xpath(EmailAXpath));
        fieldText.click();
        fieldText.sendKeys(EmAd);

    }

    @Step("Click on create claimant")
    public void CreateC() {
        $(By.xpath(CreateClamaintBtnXpath)).click();
    }

    @Step("Click on removal warnings burger")
    public void RWarning() {
        $(By.xpath(BurgerMenuIXpath)).click();
    }


    @Step("Click on warning removal menu")
    public void WarningR() {
        $(By.xpath(RecommendWRXpath)).click();
    }


    @Step("Select a suitable title")
    public void RecommendWRComment(String Comment) {
        WebElement fieldText = $(By.xpath(WarningComment));
        fieldText.click();
        fieldText.sendKeys(Comment);
    }


    @Step("Save buttn")
    public void SaveWBtn() {
        $(By.xpath(RecommendSaveBtn)).click();
    }


    @Step("Click on warning removal menu")
    public void WarningRII() {
        $(By.xpath(ReccomendWRIIXpath)).click();
    }


    @Step("Click on warning removal ")
    public void WarningRR() {
        $(By.xpath(RecommendWRIIXpath)).click();
    }

    @Step("Select a suitable title")
    public void RecommendWRCommentII(String CommentII) {
        WebElement fieldText = $(By.xpath(WarningComment));
        fieldText.click();
        fieldText.sendKeys(CommentII);
    }


    @Step("Save buttn")
    public void SaveWBtnII() {
        $(By.xpath(RecommendSaveBtn)).click();
    }


    @Step("Click on warning removal menu")
    public void WarningRIII() {
        $(By.xpath(ReccomendWRIIiXpath)).click();
    }

    @Step("Click on warning removal menu")
    public void WarningRRR() {
        $(By.xpath(RecoWIIIXpath)).click();
    }

    @Step("Select a suitable title")
    public void RecommendWRCommentIII(String CommentIII) {
        WebElement fieldText = $(By.xpath(WarningComment));
        fieldText.click();
        fieldText.sendKeys(CommentIII);
    }


    @Step("Save buttn")
    public void SaveWBtnIII() {
        $(By.xpath(RecommendSaveBtn)).click();
    }


    @Step("Click on warning removal menu")
    public void WarningRIIII() {
        $(By.xpath(ReccomendWRIIIiXpath)).click();
    }

    @Step("Click on warning removal menu")
    public void WarningRRRR() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(RecoWRIIIIXpath)).click();
    }

    @Step("Select a suitable title")
    public void RecommendWRCommentIIII(String CommentIIII) {
        WebElement fieldText = $(By.xpath(WarningComment));
        fieldText.click();
        fieldText.sendKeys(CommentIIII);
    }

    @Step("Save buttn")
    public void SaveWBtnIIII() {
        $(By.xpath(RecommendSaveBtn)).click();
    }
}