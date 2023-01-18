package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.P05_category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class D05_CategoryStepDef {
    P05_category category=new P05_category();
    @Given("user choose desktop from computer category")
    public void user_choose_desktop_from_computer_category() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        // hover on "Computers"
        WebElement computers = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        action.moveToElement(computers).perform();
        Thread.sleep(1000);
        // getText() of subCategory before click on it
        WebElement desktops = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
        String subCategoryName = desktops.getText().toLowerCase().trim();
        // this will change "Desktops " to "desktops"
        System.out.println(subCategoryName);
        // click on "Desktops"
        desktops.click();
    }

    @And("check this page open successfully")
    public void checkThisPageOpenSuccessfully() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(category.desktop.getText().contains("Desktops"));
        soft.assertAll();
    }
}
