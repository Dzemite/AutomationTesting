package org.mytests.uiobjects.epam.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.entities.User;
import org.mytests.uiobjects.epam.sections.LoginForm;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 10/22/2015.
 */
public class HomePage extends WebPage {
    public LoginForm loginForm;
    @FindBy(className = "profile-photo")
    public Label userLogo;
    @FindBy(xpath = "//*[@class='profile-photo']//*[.='Piter Chailovskii']")
    public Label userLabel;

    public void isLoggedIn() {
        if (!userLabel.isDisplayed())
            login();
    }

    public void login() {
        userLogo.click();
        loginForm.login(new User());
    }
}
