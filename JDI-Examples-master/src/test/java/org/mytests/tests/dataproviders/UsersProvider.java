package org.mytests.tests.dataproviders;

import org.mytests.entities.Users;
import org.testng.annotations.DataProvider;

/**
 * Created by Roman_Nikolaev on 6/1/2017.
 */
public class UsersProvider {

    @DataProvider(name = "UsersProvider")
    public static Object[][] users() {
        return new Object[][] {
                {Users.FIRST_TEST_USER}
        };
    }

}
