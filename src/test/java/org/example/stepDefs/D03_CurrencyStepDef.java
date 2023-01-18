package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_currency;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class D03_CurrencyStepDef {
    P03_currency currency=new P03_currency();
    @When("user click on currency list")
    public void user_click_on_currency_list() throws InterruptedException {
        WebElement list=Hooks.driver.findElement(By.id("customerCurrency"));
        Select currecnyList=new Select(list);
        currecnyList.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        }
    @And("check that items currency changed")
    public void checkThatItemsCurrencyChanged() {
      List<WebElement> items =Hooks.driver.findElements(
              By.cssSelector("span[class=\"price actual-price\"]"));
        for(WebElement item:items)
        {
            Assert.assertTrue(item.getText().contains("€"));
        }
    }
}
