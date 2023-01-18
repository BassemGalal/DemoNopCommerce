package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class D01_RegStepDef {

    P01_register register =new P01_register();
    @Given("user go to register page")
    public void user_go_to_register_page() {
        register.registerLink.click();
    }
    @When("user select gender type")
    public void userSelectGenderType() {
        register.male.click();
    }
    @And("user enter {string} & {string}")
    public void userEnter(String firstname, String lastname) {
        register.firstname.sendKeys(firstname);
        register.lastname.sendKeys(lastname);
    }
    @And("user select date of birth")
    public void userSelectDateOfBirth() {

        Select selectday=new Select(register.dayList);
        selectday.selectByValue("6");
        Select selectmonth=new Select(register.monthList);
        selectmonth.selectByValue("6");
        Select selectYear=new Select(register.yearList);
        selectYear.selectByValue("2015");
    }
    @And("user enter email{string}")
    public void userEnterEmail(String arg0) {
            register.email1.sendKeys(arg0);
    }
    @And("user enter password and confirm password {string}")
    public void userEnterPasswordAndConfirmPassword(String password) {
        register.password.sendKeys(password);
        register.confirmPassword.sendKeys(password);
    }
    @And("user click on register button")
    public void userClickOnRegisterButton() {
        register.registerButton.click();
    }
    @Then("account is created successfully")
    public void accountIsCreatedSuccessfully() {
        SoftAssert soft=new SoftAssert();
        //1-Get text and verify it contains "Your registration completed"
        soft.assertTrue(register.successMessage.getText().contains("Your registration completed"));
        //2-Get css value and verify color is green
        String actualColor=register.successMessage.getCssValue("color");
        //Color.fromString(actualColor).asHex();
        soft.assertEquals(Color.fromString(actualColor).asHex(),"#4cb17c");
        soft.assertAll();
    }
}
