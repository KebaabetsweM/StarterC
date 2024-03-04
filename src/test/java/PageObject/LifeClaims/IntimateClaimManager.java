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

public class IntimateClaimManager extends PageObject {

    String UsermanagementURLXpath = "http://claimstest.clientele.local/usermanagement";

    String FindUserXpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[618]";
    String UpdateUserDetailsXpath = "//*[@id=\"main\"]/div[2]/div/table/tbody/tr[618]/td[6]/button";

    String UserRoleXpath = "//select[@id='UserRole']";
    String SaveBtnXpath = "//*[@id=\"modalFormSubmit\"]";
    String ManageXpath = "//*[@id=\"menuClaimsManagement\"]/a";
    String WarningRemoval = "//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[1]/div[2]/ul/li[12]/a";

    String WarningRemovalDetails = "//*[@id=\"claimGroupListMainDiv\"]/div[3]/div[2]/table/tbody/tr/td[10]";
    String AssessXpath = "//*[@id=\"tab-claimEvents\"]/div/div/div/div[1]/h3/a";
    String RemoveW1Xpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[1]/div[9]/div[1]/div/button";
    String RW1Xpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[1]/div[9]/div[1]/div/ul/li[1]/a";
    String RemoveW2Xpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[4]/div[9]/div[1]/div/button";
    String RW2XPath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[4]/div[9]/div[1]/div/ul/li[1]/a";
    String RemoveW3Xpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[7]/div[9]/div[1]/div/button";
    String RW3Xpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[7]/div[9]/div[1]/div/ul/li[1]/a";
    String RemoveW4Xpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[10]/div[9]/div[1]/div/button";
    String RW4Xpath = "//*[@id=\"tabClaims-adde3cfd-d8c4-ccba-4524-08dc231b4d7b\"]/div[1]/div/div/div/div/div[10]/div[9]/div[1]/div/ul/li[1]/a";
    String WarningComment = "//*[@id=\"txtComment\"]";

    String RecommendSaveBtn = "//*[@id=\"btnSaveComment\"]";


    @Step("Navigate to user management and change roles to manager")
    public void NavigatesToUserM() throws InterruptedException {
        getDriver().get(UsermanagementURLXpath);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);

    }

    @Step("Click on the user of your choice ")
    public void UserMM() throws InterruptedException {
        Thread.sleep(2000);
        $(By.xpath(FindUserXpath)).click();
    }

    @Step("Click on the update user details button")
    public void UserM() {
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
    public void DrpownHiglight() {


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
    public void SaveButtn() {
        $(By.xpath(SaveBtnXpath)).click();
    }

    @Step("Navigate back to claim group ")
    public void NavigateBackAsManager() throws InterruptedException {
        getDriver().get("http://claimstest.clientele.local/ClaimGroup/ManagementIndex?claimGroupId=5609d6fa-f38d-cf1c-2a19-08dc23171f57&claimEventId=adde3cfd-d8c4-ccba-4524-08dc231b4d7b");
        getDriver().navigate().refresh();
        Thread.sleep(2000);
    }

    @Step("Click on manage")
    public void ManageTab() {
        $(By.xpath(ManageXpath)).click();
    }

    @Step("Click on Warning Removal")
    public void WarningRemove() {
        $(By.xpath(WarningRemoval)).click();
    }

    @Step("Click on the details of the warning removal")
    public void WarningRD() {
        $(By.xpath(WarningRemovalDetails)).click();
    }

    @Step("Click on the policy tab")
    public void Assess() {
        $(By.xpath(AssessXpath)).click();
    }

    @Step("Click on the Remove burger menu")
    public void RW1() {
        $(By.xpath(RemoveW1Xpath)).click();
    }

    @Step("Click on the option remove warnings")
    public void RWW1() {
        $(By.xpath(RW1Xpath)).click();
    }

    @Step("Comment1")
    public void Com1(String Comms) {
        WebElement fieldText = $(By.xpath(WarningComment));
        fieldText.click();
        fieldText.sendKeys(Comms);

    }

    @Step("Save the comment")
    public void SaveB() {
        $(By.xpath(RecommendSaveBtn)).click();
    }


    @Step("Click on the second remove warnings burger menu")
    public void RW2() {
        $(By.xpath(RemoveW2Xpath)).click();

    }

    @Step("Click on the second removal warning burger menu")
    public void RWW2() {
        $(By.xpath(RW2XPath)).click();

    }

    @Step("Comment2")
    public void Com2(String Comms2) {
        WebElement fieldText = $(By.xpath(WarningComment));
        fieldText.click();
        fieldText.sendKeys(Comms2);

    }

    @Step("Save butn")
    public void SaveBt() {
        $(By.xpath(RecommendSaveBtn)).click();
    }

    @Step("Click on the third warnings burger menu")
    public void RW3() {
        $(By.xpath(RemoveW3Xpath)).click();
    }

    @Step("Click on the third removal warning ")
    public void RWW3() {
        $(By.xpath(RW3Xpath)).click();
    }

    @Step("Comment3")
    public void Com3(String Comms3) {
        WebElement fieldText = $(By.xpath(WarningComment));
        fieldText.click();
        fieldText.sendKeys(Comms3);

    }

    @Step("Save bttn")
    public void SaveButn() {
        $(By.xpath(RecommendSaveBtn)).click();
    }

    @Step("Click on the fourth warnings burger menu")
    public void RW4() {
        $(By.xpath(RemoveW4Xpath)).click();
    }

    @Step("Click on the fourth removal warning")
    public void RWW4() {
        $(By.xpath(RW4Xpath)).click();
    }

    @Step("Comment4")
    public void Com4(String Comms4) {
        WebElement fieldText = $(By.xpath(WarningComment));
        fieldText.click();
        fieldText.sendKeys(Comms4);
    }

    @Step("Click on save ")
    public void SvButton() {
        $(By.xpath(RecommendSaveBtn)).click();
    }

}