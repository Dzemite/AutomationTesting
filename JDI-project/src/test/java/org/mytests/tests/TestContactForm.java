package org.mytests.tests;

import com.epam.web.matcher.testng.Assert;
import org.mytests.entities.User;
import org.mytests.tests.dataproviders.UsersProvider;
import org.mytests.uiobjects.epam.sections.LoginForm;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static org.mytests.enums.States.LOGGED_IN;
import static org.mytests.uiobjects.epam.EpamSite.homepage;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
public class TestContactForm extends InitTests {

    @Test(dataProvider = "UsersProvider", dataProviderClass = UsersProvider.class)
    public void loginTest(User user){
        homepage.open();
        homepage.login(user);
        //isInState(LOGGED_IN);
        Assert.isTrue(homepage.isLoggedIn());
    }

}
