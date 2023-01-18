package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.P07_followUs;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;

public class D07_FollowUsStepDef {
    P07_followUs follow=new P07_followUs();

    @Given("user click facebook button")
    public void user_click_facebook_button() throws InterruptedException {
        follow.clickFB.click();
        Thread.sleep(2000);
     }
    @And("check new tab is opened {string}")
    public void checkNewTabIsOpened(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        Hooks.driver.getWindowHandles();
        ArrayList<String> Tabs= new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),arg0);
        soft.assertAll();
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
    }

    @Given("user click twitter button")
    public void userClickTwitterButton() throws InterruptedException {
        follow.clickTW.click();
        Thread.sleep(2000);
    }


    @And("check new tabT is opened {string}")
    public void checkNewTabTIsOpened(String arg1) throws InterruptedException {
    Thread.sleep(2000);
    Hooks.driver.getWindowHandles();
    ArrayList<String> Tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
    Hooks.driver.switchTo().window(Tabs.get(1));
    SoftAssert soft=new SoftAssert();
    soft.assertEquals(Hooks.driver.getCurrentUrl(),arg1);
    soft.assertAll();
    Hooks.driver.close();
    Hooks.driver.switchTo().window(Tabs.get(0));
    }

    @Given("user click youtube button")
    public void userClickYoutubeButton() throws InterruptedException {
        follow.clickYT.click();
        Thread.sleep(2000);
    }
    @And("check new tabY is opened {string}")
    public void checkNewTabYIsOpened(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        Hooks.driver.getWindowHandles();
        ArrayList<String> Tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),arg0);
        soft.assertAll();
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
    }

    @Given("user click srs button")
    public void userClickSrsButton() {
        follow.clickS.click();
    }
    @And("check new tabS is opened {string}")
    public void checkNewTabSIsOpened(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),arg0);
        soft.assertAll();
        Hooks.driver.close();
        }
    }


