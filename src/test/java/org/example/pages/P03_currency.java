package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_currency {
    public P03_currency() {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/select")
    public WebElement clickCurrency;
}
