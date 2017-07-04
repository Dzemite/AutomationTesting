package homeWork_1;

import com.epam.TestBase;
import org.testng.annotations.*;

/**
 * Created by Roman_Nikolaev on 5/10/2017.
 */
public class HomeworkTest extends TestBase {

    @BeforeSuite
    public void before() {
        init("https://www.avito.ru/sankt-peterburg");
    }

    @AfterSuite
    public void after() {
        cleanBrowser();
    }

    @Test
    public void testDriverProperties() {
        setSize(800, 600);
    }

}
