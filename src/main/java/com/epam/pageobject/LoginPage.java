package com.epam.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Roman_Nikolaev on 5/11/2017.
 */
public class LoginPage extends Page{

    static LoginPage obj;

    private LoginPage() {
    }

    public static LoginPage get(WebDriver driver) {
        if (obj != null) {
            initElements(driver, obj);
            return obj;
        }
        obj = new LoginPage();
        initElements(driver, obj);
        return obj;
    }

    @FindBy(className="login-form-input")
    public static WebElement loginFormInput;

    @FindBy(className="form-password-input")
    public static WebElement pswdFormInput;

    @FindBy(className="login-form-submit")
    public static WebElement submit;

}
