import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;

/**
 * Created by Roman_Nikolaev on 5/4/2017.
 */
public class testEpam_com {

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
        System.out.println();
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test");
        System.out.println();
    }

    @BeforeMethod
    public void before(Method method){
        System.out.println("Before");
    }

    @AfterMethod
    public void after(Method method){
        System.out.println("after");
        System.out.println();
    }

    @Test
    public void simpleTast() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Roman_Nikolaev\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.epam.com");
        System.out.println("test 1");
    }

    @Test()
    public void Test2(){
        System.out.println("test2" + hello());
    }

    private String hello(){
        return " hello";
    }
}
