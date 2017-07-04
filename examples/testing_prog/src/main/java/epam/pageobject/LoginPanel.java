package epam.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Roman_Nikolaev on 5/11/2017.
 */
public class LoginPanel extends PageFactory{

    static LoginPanel obj;

    public static LoginPanel get(WebDriver driver) {
        if (obj != null) {
            initElements(driver, obj);
            return obj;
        }
        obj = new LoginPanel();
        initElements(driver, obj);
        return obj;
    }

    @FindBy(className="login-form")
    public static WebElement LoginForm;

}
