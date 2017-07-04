package org.mytests.uiobjects.epam.sections;

import com.epam.jdi.uitests.core.annotations.Name;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.mytests.entities.User;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 5/29/2017.
 */
public class LoginForm extends Form<User> {
    @FindBy(id = "Login")
    public ITextField name;
    @FindBy(id = "Password")
    public ITextField password;

    @FindBy(id = "[type=submit]")
    public Button loginButton;

}
