package homeWork_1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Roman_Nikolaev on 5/10/2017.
 */
public class HomeworkTest {

    WebDriver driver;

    @BeforeTest
    public void before() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Roman_Nikolaev\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        System.out.println("before test");
    }

    @AfterTest
    public void after() {
        //driver.close();
        System.out.println("after test");
    }

    @Test
    public void testDriverProperties() {
        driver.manage().window().setSize(new Dimension(860, 480));
        driver.navigate().to("https://www.epam.com");
    }

}
