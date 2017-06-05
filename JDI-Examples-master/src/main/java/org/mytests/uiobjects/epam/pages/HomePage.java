package org.mytests.uiobjects.epam.pages;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.mytests.uiobjects.epam.sections.LoginForm;
import org.mytests.entities.User;
import org.mytests.entities.Users;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 10/22/2015.
 */
public class HomePage extends WebPage {

    @FindBy(css = ".profile-photo")
    public Label profileLabel;
    @FindBy(css = ".profile-photo span")
    public Text userName;
    @FindBy(xpath = "//span[.='Logout']")
    public Button logout;

//    private static HomePage instance;
//    private HomePage(){}
//    public static HomePage getInstance(){
//        if(instance == null){
//            instance = new HomePage();
//            return instance;
//        }
//        return instance;
//    }

    public LoginForm loginForm;

    public boolean isLoggedIn() {
        return !userName.isDisplayed();
    }

    public void login() {
        login(Users.FIRST_TEST_USER);
    }
    public void login(User user) {
        profileLabel.click();
        loginForm.login(user);
    }
    public void logout() {
        if(!logout.isDisplayed())
            profileLabel.click();
        logout.click();
    }
}
