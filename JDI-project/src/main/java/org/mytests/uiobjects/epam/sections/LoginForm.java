package org.mytests.uiobjects.epam.sections;

import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import org.mytests.entities.User;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Nikolaev on 6/1/2017.
 */
public class LoginForm extends Form<User> {

    @JFindBy(id = "Login")
    public ITextField name;

    @JFindBy(id = "Password")
    public ITextField password;

    @JFindBy(xpath = "//span[.='Enter']")
    public Button loginButton;

}
