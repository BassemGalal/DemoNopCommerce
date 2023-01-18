package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.P08_wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {
    P08_wishlist wishlist=new P08_wishlist();

    @When("user click on heart button")
    public void user_click_on_heart_button() {
            wishlist.clickHeart.click();
      }
    @And("check success massage")
    public void checkSuccessMassage() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(wishlist.successMassage.getText().contains("The product has been added to your "));
        soft.assertAll();
    }
    @And("check background color")
    public void checkBackgroundColor() {
        SoftAssert soft=new SoftAssert();
        String actualColor=wishlist.color.findElement(By.xpath("/html/body/div[5]/div")).getCssValue("background-color");
        actualColor= Color.fromString(actualColor).asHex();
        String expectedColor="#4bb07a";
        soft.assertEquals(actualColor,expectedColor);
        soft.assertAll();
    }

    @When("user go to wishlist page")
    public void userGoToWishlistPage() throws InterruptedException {
        wishlist.clickHrtBtn.click();
        Thread.sleep(5000);
    }

    @And("user choose wishlist button")
    public void userChooseWishlistButton() throws InterruptedException {
        wishlist.clickWishBtn.click();
        Thread.sleep(2500);
    }
}
