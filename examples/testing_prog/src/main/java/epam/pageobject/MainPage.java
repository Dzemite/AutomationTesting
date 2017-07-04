package epam.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Roman_Nikolaev on 5/11/2017.
 */
public class MainPage extends PageFactory{

    static MainPage obj;

    public static MainPage get(WebDriver driver) {
        if (obj != null) {
            initElements(driver, obj);
            return obj;
        }
        obj = new MainPage();
        initElements(driver, obj);
        return obj;
    }

    @FindBy(className="header-services-profile")
    public static WebElement loginDropdown;
}
