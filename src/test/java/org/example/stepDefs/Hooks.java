package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public static void openBrowser()
    {
        //1-Define Bridge using WebDriverManager dependency
        String key="webdriver.chrome.driver";
        String value=System.getProperty("user.dir")+"\\Browsers\\chromedriver.exe";
        System.setProperty(key,value);


        //2-Create New object From ChromeDriver
        driver=new ChromeDriver();

        //3- Configurations
        //3.1-Maximize browser
        driver.manage().window().maximize();
        //3.2-Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //4-Navigate to website
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
