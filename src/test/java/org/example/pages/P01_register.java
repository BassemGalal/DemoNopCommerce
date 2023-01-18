package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_register {

    //1- Constructor

    public P01_register() {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className ="ico-register")
    public WebElement registerLink;

    @FindBy(id = "gender-male")
    public WebElement male;

    @FindBy(id = "FirstName")
    public WebElement firstname;

    @FindBy(id = "LastName")
    public WebElement lastname;

    @FindBy(name = "DateOfBirthDay")
    public WebElement dayList;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement monthList;

    @FindBy(name = "DateOfBirthYear")
    public WebElement yearList;

    @FindBy(id = "Email")
    public WebElement email1;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public WebElement registerButton;

    @FindBy(className = "result")
    public WebElement successMessage;


//    public WebElement registerLink()
//    {
//       return Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
//    }
}
