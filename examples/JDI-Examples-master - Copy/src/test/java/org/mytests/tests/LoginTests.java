package org.mytests.tests;

import com.epam.jdi.uitests.core.preconditions.PreconditionsState;
import com.epam.web.matcher.junit.Assert;
import org.mytests.entities.User;
import org.mytests.tests.dateproviders.UsersProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.core.preconditions.PreconditionsState.isInState;
import static org.mytests.enums.States.LOGGED_IN;
import static org.mytests.enums.States.LOGGED_OUT;
import static org.mytests.uiobjects.epam.EpamSite.homepage;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
public class LoginTests extends InitTests {

    @Test(dataProvider = "users", dataProviderClass = UsersProvider.class)
    public void loginTest(User user) {
        isInState(LOGGED_OUT);
        homepage.login();
        Assert.isTrue(homepage.isLoggedIn());
    }
    @Test(dataProvider = "users", dataProviderClass = UsersProvider.class, enabled = false)
    public void logutTest(User user) {
        isInState(LOGGED_IN);
        homepage.logout();
        Assert.isFalse(homepage.isLoggedIn());
    }

}
