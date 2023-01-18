package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.bind.annotation.W3CDomHandler;

public class P08_wishlist {
    public P08_wishlist() {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    public WebElement clickHeart;

    @FindBy(xpath = "/html/body/div[5]/div/p")
    public WebElement successMassage;

    @FindBy(xpath = "/html/body/div[5]/div")
    public WebElement color;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    public WebElement clickHrtBtn;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]")
    public WebElement clickWishBtn;
}
