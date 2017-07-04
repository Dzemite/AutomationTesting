package org.mytests.uiobjects.epam.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.entities.User;
import org.mytests.entities.Users;
import org.mytests.uiobjects.epam.sections.LoginForm;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 5/29/2017.
 */
public class HomePage extends WebPage {
    @FindBy(css = ".profile-photo")
    public Label probileLabel;
    @FindBy(css = ".profile-photo span")
    public Text userName;
    @FindBy(xpath = "//span[.='Logout']")
    public Button logout;


    public LoginForm loginForm;

    public boolean isLoggedIn() {
        return !userName.isDisplayed();
    }

    public void login() {
        login(Users.DEFAULT);
    }
    public void login(User user) {
        probileLabel.click();
        loginForm.login(user);
    }
    public void logout() {
        if(!logout.isDisplayed())
            probileLabel.click();
        logout.click();
    }
}
