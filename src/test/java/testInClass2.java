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
        init("https://jdi-framework.github.io/tests/index.htm");
    }

    @AfterSuite
    public void testDown(){

    }

    @Test
    public void loginTast(){
        navigateToMainTest();
        MainPage.get(driver).loginDropdown.click();
        assertTrue(LoginPanel.LoginLable.isDisplayed());
        //Assert.assertTrue();
    }

}
