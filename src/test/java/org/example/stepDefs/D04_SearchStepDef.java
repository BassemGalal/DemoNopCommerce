package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P04_search;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D04_SearchStepDef {
    P04_search search=new P04_search();

    @Given("user search for item")
    public void user_search_for_item() throws InterruptedException {
        search.searchField.sendKeys("Apple");
        Thread.sleep(5000);
    }

    @And("user click search")
    public void userClickSearch() throws InterruptedException {
        search.clickSearch.click();
        Thread.sleep(5000);
    }

    @Then("check that opened site contain")
    public void checkThatOpenedSiteContain() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        soft.assertAll();

    }
    @And("check result number more than zero")
    public void checkResultNumberMoreThanZero() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert soft=new SoftAssert();
        int size = Hooks.driver.findElements(By.className("item-box")).size();
        soft.assertTrue(size > 0);
        soft.assertAll();
    }

    @Given("user search by item SKU")
    public void userSearchByItemSKU() throws InterruptedException {
        search.SearchField1.sendKeys("AP_MBP_13");
        Thread.sleep(5000);
    }

    @And("user click search button")
    public void userClickSearchButton() throws InterruptedException {
        search.searchBtn.click();
        Thread.sleep(5000);
    }

    @And("check that one item appears")
    public void checkThatOneItemAppears() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert soft=new SoftAssert();
        int size = Hooks.driver.findElements(By.className("item-box")).size();
        soft.assertTrue(size == 1);
        soft.assertAll();
    }

    @Then("click on this item")
    public void clickOnThisItem() {
        search.clickItem.click();
    }

    @And("check that item contain same SKU")
    public void checkThatItemContainSameSKU() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(search.SKU.getText().contains("AP_MBP_13"));
        soft.assertAll();
    }
}
