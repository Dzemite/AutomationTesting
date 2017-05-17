import com.epam.TestBase;
import com.epam.pageobject.LoginPanel;
import com.epam.pageobject.MainPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Roman_Nikolaev on 5/11/2017.
 */
public class testInClass2 extends TestBase {

    @BeforeSuite
    public void setup() {
        init("https://www.avito.ru/sankt-peterburg");
    }

    @AfterSuite
    public void testDown(){

    }

    @Test
    public void loginTast(){
        navigateToMainTest();

        System.out.println("Dropdown: " + MainPage.get(driver).loginDropdown);

        MainPage.get(driver).loginDropdown.click();

        System.out.println("Login form: " + LoginPanel.get(driver).LoginForm);
        assertTrue(true);
    }
}
