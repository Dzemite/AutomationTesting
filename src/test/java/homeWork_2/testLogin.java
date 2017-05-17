package homeWork_2;

import com.epam.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Roman_Nikolaev on 5/11/2017.
 */
public class testLogin extends TestBase {

    @BeforeTest
    public void before() {
        init("https://www.avito.ru/sankt-peterburg");
    }

    @AfterTest
    public void after() {
        driver.close();
        System.out.println("after test");
    }

    //need CSV data provider
    @DataProvider
    public Object[][] correctData() {
        return new Object[][]{
                {"nikol344265", "NikolR4551"}
        };
    }

    @DataProvider
    public Object[][] incorrectData() {
        return new Object[][]{
                {"nikol34426555", "NikolR4551"}
        };
    }

    @Test(dataProvider = "correctData")
    public void _positiveLogin(String login, String pswd) {
        driver.navigate().to("https://www.avito.ru/sankt-peterburg");
        WebElement elementBtn = driver.findElement(By.className("header-services-menu__link"));
        elementBtn.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.className("login-form-input")).sendKeys(login);
        driver.findElement(By.className("form-password-input")).sendKeys(pswd);
        driver.findElement(By.className("login-form-submit")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement loggedInUser = driver.findElement(By.className("header-services-profile__username"));
        Assert.assertEquals(loggedInUser.getText(), "Роман");
    }

    @Test(dataProvider = "incorrectData")
    public void negativeLogin(String login, String pswd) {
        driver.navigate().to("https://www.avito.ru/sankt-peterburg");
        WebElement elementBtn = driver.findElement(By.className("header-services-menu__link"));
        elementBtn.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.className("login-form-input")).sendKeys(login);
        driver.findElement(By.className("form-password-input")).sendKeys(pswd);
        driver.findElement(By.className("login-form-submit")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String url = driver.getCurrentUrl();

        Assert.assertEquals(url, "https://www.avito.ru/profile/login");
    }


}
