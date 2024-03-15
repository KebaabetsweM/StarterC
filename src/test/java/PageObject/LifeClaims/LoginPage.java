package PageObject.LifeClaims;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends PageObject {
    String URLXpath = "http://kmolale:Kebaabetswem@25@claimstest.clientele.local/";
    String SearchTxtBoxXpath = "//*[@id=\"txtSearch\"]";
    String SearchBtnXpath = "//*[@id=\"btnSearch\"]";

    @Step("Open Life Claims")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(URLXpath);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
    }

    @Step("Enter Name(s) on input field text")
    public void EnterPolicyNumber (String PolicyNumber) {

        WebElement fieldText = $(By.xpath(SearchTxtBoxXpath));
        fieldText.click();
        fieldText.sendKeys(PolicyNumber);

    }
    @Step("Click  on search")
    public void ClickSearch() throws InterruptedException {
        Thread.sleep(3000);

        $(By.xpath(SearchBtnXpath)).click();




    }
}
