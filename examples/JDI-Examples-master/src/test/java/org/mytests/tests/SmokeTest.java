package org.mytests.tests;

import com.epam.web.matcher.testng.Assert;
import org.mytests.dataproviders.UsersProvider;
import org.mytests.entities.User;
import org.mytests.enums.LeftMenu;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.mytests.enums.LeftMenu.SIMPLE_TABLE;
import static org.mytests.uiobjects.epam.EpamSite.homePage;
import static org.mytests.uiobjects.epam.EpamSite.leftMenu;
import static org.mytests.uiobjects.epam.EpamSite.simpleTablePage;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
public class SmokeTest extends InitTests {

    @BeforeTest
    public void before() {
        homePage.isLoggedIn();
    }

    @Test(dataProvider = "users", dataProviderClass = UsersProvider.class)
    public void sendCVTest(User user) {
        leftMenu.select(SIMPLE_TABLE);

    }

}
