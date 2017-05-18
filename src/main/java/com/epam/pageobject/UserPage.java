package com.epam.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Roman_Nikolaev on 5/18/2017.
 */
public class UserPage extends Page{

    static UserPage obj;

    private UserPage() {
    }

    public static UserPage get(WebDriver driver) {
        if (obj != null) {
            initElements(driver, obj);
            return obj;
        }
        obj = new UserPage();
        initElements(driver, obj);
        return obj;
    }

    @FindBy(className="header-services-profile__username")
    public static WebElement loggedInUser;

}
