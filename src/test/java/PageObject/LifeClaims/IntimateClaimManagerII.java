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

public class IntimateClaimManagerII extends PageObject {
    String FindUserXpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[618]";
    String UpdateUserDetailsXpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[618]/td[6]/button";
    String UserRoleXpath = "//select[@id='UserRole']";
    String SaveBtnXpath = "//*[@id=\"modalFormSubmit\"]";
    String PaymentXpath = "//*[@id=\"menuPayments\"]/a";
    String BatchPyamentsXpath = "//*[@id=\"batchPaymentsSubmit\"]";
    String ManageTabXpath = "//*[@id=\"menuClaimsManagement\"]/a";
    String PaymentApXpath = "//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[1]/div[1]/ul/li[8]/a";

    String DetailsApXpath = "//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[2]/table/tbody/tr[2]/td[10]";
    String PolicyTabXpath = "//*[@id=\"tab-claimEvents\"]/div/div/div/div[1]/h3/a";
    String PayIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[1]/div[9]/div[3]/div/button";
    String PayCXpath = "//*[@id=\"tabClaims-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/div[1]/div/div/div/div/div[1]/div[9]/div[3]/div/ul/li[1]/a";
    String YesXpath = "//*[@id=\"bsPromptModalPositiveBtn\"]";
    String CommentTxtBXpath = "//*[@id=\"txtComment\"]";
    String PayCIIIXpath = "//*[@id=\"tabClaims-7680fb68-c45e-c25b-cf46-08dc0156019b\"]/div[1]/div/div/div/div/div[7]/div[9]/div[3]/div/ul/li[1]/a";
    String PayIIIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[7]/div[9]/div[3]/div/button/i";
    String SvBtnXpath = "//*[@id=\"btnSaveComment\"]";
    String PayIIXpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[4]/div[9]/div[3]/div/button";
    String PayCIIXpath = "//*[@id=\"tabClaims-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/div[1]/div/div/div/div/div[4]/div[9]/div[3]/div/ul/li[1]/a";



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
    public void UserRoleM(String UserRM) throws InterruptedException {
        Thread.sleep(5000);
        WebElement Ur = $(By.xpath(UserRoleXpath));
        selectFromDropdown(Ur, UserRM);
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

    @Step("Navigate back to claim group  as a manager")
    public void NavigateBackAsManagerr() throws InterruptedException {
        getDriver().get("hhttp://http://claimstest.clientele.local/ClaimGroup/AssessmentIndex?claimGroupId=5609d6fa-f38d-cf1c-2a19-08dc23171f57&claimEventId=adde3cfd-d8c4-ccba-4524-08dc231b4d7b#");
        getDriver().navigate().refresh();
        Thread.sleep(3000);
    }

    @Step("Click on the payments tab")
    public void Pay() {
        $(By.xpath(PaymentXpath)).click();
    }

    @Step("Click on the batch payments")
    public void BatchPay() {
        $(By.xpath(BatchPyamentsXpath)).click();
    }

    @Step("Click on manage")
    public void ManageT() {
        $(By.xpath(ManageTabXpath)).click();
    }

    @Step("Click on payment approval")
    public void PaymentAp() {
        $(By.xpath(PaymentApXpath)).click();
    }

    @Step("Click on the details")
    public void DetailsAp() {
        $(By.xpath(DetailsApXpath)).click();
    }

    @Step("Click on the tab for the details to appear")
    public void DetailsTab() {
        $(By.xpath(PolicyTabXpath)).click();
    }

    @Step("Click MBurger menu I")
    public void MBurgerI() {
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(11) > div:nth-child(3) > div:nth-child(1) > button:nth-child(1)")).click();
    }

    @Step("Click on pay Claim I")
    public void PayC() {
        $(By.xpath(PayCXpath)).click();
    }


    @Step("Click yes on the pop up for a go ahead")
    public void PopUp() {
        $(By.xpath(YesXpath)).click();
    }


    @Step("Comment")
    public void Comments(String ReccoCom) {
        WebElement ReccomendC = $(By.xpath(CommentTxtBXpath));
        ReccomendC.click();
        ReccomendC.sendKeys(ReccoCom);
    }


    @Step("Click MBurger menu II")
    public void MBurgerII() {
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(11) > div:nth-child(3) > div:nth-child(1) > button:nth-child(1)")).click();
    }

    @Step("Click on pay Claim II")
    public void PayCII() {
        $(By.xpath(PayCIIXpath)).click();
    }

    @Step("Comment")
    public void CommentsII(String ReccoComII) {
        WebElement ReccomendC = $(By.xpath("//*[@id=\"txtComment\"]"));
        ReccomendC.click();
        ReccomendC.sendKeys(ReccoComII);


    }


    @Step("Click MBurger menu III")
    public void MBurgerIII() {
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(7) > div:nth-child(11) > div:nth-child(3) > div:nth-child(1) > button:nth-child(1) > i:nth-child(1)")).click();
    }
    @Step("Click on pay Claim III")
    public void PayCIII() {
        $(By.xpath("//*[@id=\"tabClaims-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/div[1]/div/div/div/div/div[7]/div[9]/div[3]/div/ul/li[1]/a")).click();
    }
    @Step("Comment")
    public void CommentsIII (String ReccoComIII) {
        WebElement ReccomendC = $(By.xpath(CommentTxtBXpath));
        ReccomendC.click();
        ReccomendC.sendKeys(ReccoComIII);
    }

    @Step("Save the Comment afterwards")
    public void SCommentBtnII() {
        $(By.xpath("//*[@id=\"txtComment\"]")).click();
    }

    @Step("Click MBurger menu III")
    public void MBurgerIIII() {
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(10) > div:nth-child(11) > div:nth-child(3) > div:nth-child(1) > button:nth-child(1)")).click();
    }
    @Step("Click on pay Claim III")
    public void PayCIIII() {
        $(By.xpath("//*[@id=\"tabClaims-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/div[1]/div/div/div/div/div[10]/div[9]/div[3]/div/ul/li[1]/a")).click();
    }
    @Step("Comment")
    public void CommentsIIII (String ReccoComIIII) {
        WebElement ReccomendC = $(By.xpath("//*[@id=\"txtComment\"]"));
        ReccomendC.click();
        ReccomendC.sendKeys(ReccoComIIII);
    }

    @Step("Save the Comment afterwards")
    public void SCommentBtnIIII() {
        $(By.xpath("//*[@id=\"btnSaveComment\"]")).click();
    }
    @Step("Click MBurger menu L")
    public void MBurgerL() {
        $(By.cssSelector("body > div:nth-child(2) > section:nth-child(1) > div:nth-child(17) > div:nth-child(9) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(13) > div:nth-child(11) > div:nth-child(3) > div:nth-child(1) > button:nth-child(1)")).click();
    }
    @Step("Click on pay Claim l")
    public void PayCL() {
        $(By.xpath("//*[@id=\"tabClaims-c00b8d7d-0232-c282-f0d4-08dc435ed230\"]/div[1]/div/div/div/div/div[13]/div[9]/div[3]/div/ul/li[1]/a")).click();
    }
    @Step("Comment L")
    public void CommentsL (String ReccoComL) {
        WebElement ReccomendC = $(By.xpath("//*[@id=\"txtComment\"]"));
        ReccomendC.click();
        ReccomendC.sendKeys(ReccoComL);
    }

    @Step("Save the Comment afterwards L")
    public void SCommentBtnL() {
        $(By.xpath(SvBtnXpath)).click();
    }
}


