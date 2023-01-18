package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_LogStepDef {
    P02_login login=new P02_login();
    @Given("user go to login page")
    public void user_go_to_login_page() {
        login.login.click();
    }
    @When("user enter valid email {string}")
    public void userEnterValidEmail(String arg0) {
        login.email.sendKeys(arg0);
    }
    @And("user enet valid password {string}")
    public void userEnetValidPassword(String arg0) {
        login.password.sendKeys(arg0);
    }
    @And("user click on login button")
    public void userClickOnLoginButton() {
        login.clickLogin.click();
    }
    @Then("check that login successfully")
    public void checkThatLoginSuccessfully() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(login.logout.getText().contains("Log out"));
        soft.assertAll();
    }
    @And("user can logout")
    public void userCanLogout() {
        login.clickLogout.click();
    }
    @And("check that logout successfully")
    public void checkThatLogoutSuccessfully() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(login.loginEnable.getText().contains("Log in"));
        soft.assertAll();
    }
}
