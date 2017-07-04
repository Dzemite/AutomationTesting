package org.mytests.dataproviders;

import org.mytests.entities.User;
import org.testng.annotations.DataProvider;

/**
 * Created by Roman_Iovlev on 5/29/2017.
 */
public class UsersProvider {

    @DataProvider(name = "users")
    public static Object[][] users() {
        return new Object[][] { {new User()} };
    }
}
