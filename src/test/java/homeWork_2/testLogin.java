package homeWork_2;

import com.epam.TestBase;
import com.epam.pageobject.LoginPage;
import com.epam.pageobject.MainPage;
import com.epam.pageobject.UserPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.dnd.MouseDragGestureRecognizer;

/**
 * Created by Roman_Nikolaev on 5/11/2017.
 */
public class testLogin extends TestBase {

    @BeforeSuite
    public void before() {
        init("https://www.avito.ru/sankt-peterburg");
    }

    @AfterSuite
    public void after() {
        cleanBrowser();
    }

    @BeforeTest
    public void beforeTest() {
        driver.manage().deleteAllCookies();
    }

    //TO DO: need CSV data provider
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
        navigateToMainTest();
        MainPage.get(driver).logInBtn.click();

        waitForLoad();

        LoginPage.get(driver).loginFormInput.sendKeys(login);
        LoginPage.get(driver).pswdFormInput.sendKeys(pswd);
        LoginPage.get(driver).submit.click();

        waitForLoad();

        Assert.assertEquals(UserPage.get(driver).loggedInUser.getText(), "Роман");

    }

    @Test(dataProvider = "incorrectData", enabled=false)
    public void negativeLogin(String login, String pswd) {
        navigateToMainTest();

        MainPage.get(driver).logInBtn.click();

        waitForLoad();

        LoginPage.get(driver).loginFormInput.sendKeys(login);
        LoginPage.get(driver).pswdFormInput.sendKeys(pswd);
        LoginPage.get(driver).submit.click();

        waitForLoad();

        String url = driver.getCurrentUrl();

        Assert.assertEquals(url, "https://www.avito.ru/profile/login");
    }


}
