
import epam.TestBase;
import org.testng.annotations.*;


/**
 * Created by Roman_Nikolaev on 5/15/2017.
 */
public class TestWinSize extends TestBase {

    @BeforeSuite
    public void before() {
        init("https://www.avito.ru/sankt-peterburg");
    }

    @AfterSuite
    public void after() {
        driver.close();
    }

    @Test
    public void testDriverProperties() {
        setSize(800, 600);
    }

}
