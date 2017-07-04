package org.mytests.tests.dateproviders;

import org.mytests.entities.Users;
import org.testng.annotations.DataProvider;

/**
 * Created by Roman_Iovlev on 5/29/2017.
 */
public class UsersProvider {

    @DataProvider(name = "users")
    public static Object[][] users() {
        return new Object[][] {
                { Users.DEFAULT},
                { Users.EMPTY_PASSWORD}
        };
    }
}
