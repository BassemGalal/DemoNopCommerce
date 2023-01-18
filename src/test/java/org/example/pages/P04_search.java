package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_search {
    public P04_search() {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[2]/form/input")
    public WebElement searchField;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[2]/form/button")
    public WebElement clickSearch;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]/a/img")
    public WebElement clickItem;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[6]/div/span[2]")
    public WebElement SKU;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[2]/form/input")
    public WebElement SearchField1;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[2]/form/button")
    public WebElement searchBtn;

}

