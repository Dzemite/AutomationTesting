package org.mytests.entities;

/**
 * Created by Roman_Nikolaev on 6/1/2017.
 */
public class Users {
    public static User DEFAULT = new User();
    public static User EMPTY_PASSWORD = new User("Piter Chailovskii", "epam", "", "", "");
    public static User FIRST_TEST_USER = new User("Piter Chailovskii", "epam", "1234", "testLastName",
                                                  "Some description for first test.");
    public static User USER_DIFERENT_DESCRIPTION = new User("Piter Chailovskii", "epam", "1234", "testLastName",
                                                  "Some description for second test with different description test.");
}