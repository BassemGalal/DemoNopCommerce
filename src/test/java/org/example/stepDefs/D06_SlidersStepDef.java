package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.P06_sliders;
import org.testng.asserts.SoftAssert;

public class D06_SlidersStepDef {
    P06_sliders Psliders=new P06_sliders();

    @Given("user click of first slide")
    public void user_click_of_first_slide() {
        Psliders.sliders("1").click();
    }
    @And("check new page is opened")
    public void checkNewPageIsOpened() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        soft.assertAll();
    }
    @Given("user click second slide")
    public void userClickSecondSlide() throws InterruptedException {
        Thread.sleep(2000);
        Psliders.sliders("2").click();
    }
    @And("check new page is opened for second slider")
    public void checkNewPageIsOpenedForSecondSlider() throws InterruptedException {
//        Thread.sleep(2000);
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/apple-lumia-1020"));
        soft.assertAll();
    }

}
