package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P06_sliders {
    public P06_sliders() {
        PageFactory.initElements(Hooks.driver,this);
    }

    public WebElement sliders(String num)
    {
        return
                Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+num+")"));
    }


}
