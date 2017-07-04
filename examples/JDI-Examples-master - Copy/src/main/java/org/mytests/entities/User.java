package org.mytests.entities;

import com.epam.jdi.uitests.core.annotations.Name;

/**
 * Created by Roman_Iovlev on 5/29/2017.
 */
public class User {
    public String name = "epam";
    public String password = "1234";

    public User() { }
    public User(String name, String password){
        this.name = name;
        this.password = password;
    }
}
