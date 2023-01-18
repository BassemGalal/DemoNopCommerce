package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_category {
    public P05_category() {
        PageFactory.initElements(Hooks.driver,this);
    }
      @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")
        public WebElement desktop;

}
