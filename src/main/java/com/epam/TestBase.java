package com.epam;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/**
 * Created by Roman_Nikolaev on 5/11/2017.
 */
public class TestBase
{
    public WebDriver driver;
    private String url;

    public void init(String _url){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Roman_Nikolaev\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        url = _url;
    }

    public void cleanBrowser(){
        driver.close();
    }

    public void navigateToMainTest(){
        driver.navigate().to(url);
    }

    public void assertTrue(boolean someBool){
        Assert.assertTrue(someBool);
    }

    public void setSize(int width, int height){
        driver.manage().window().setSize(new Dimension(width, height));
    }
}
