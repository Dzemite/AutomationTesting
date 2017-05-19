package com.epam;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;

/**
 * Created by Roman_Nikolaev on 5/11/2017.
 */
public class TestBase
{
    public WebDriver driver;
    private String url;

    private enum Browser {
        firefox,
        chrome,
        opera
    }

    public void init(String _url){

        Browser browser = Browser.valueOf(System.getProperty("testDriver", "firefox").toLowerCase());

        switch (browser) {
            case firefox:
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Roman_Nikolaev\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case chrome:
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roman_Nikolaev\\Downloads\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case opera:
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Roman_Nikolaev\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
                driver = new OperaDriver();
                break;
        }
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

    //Sorry for this =)
    public void waitForLoad() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
