package org.mytests.entities;

/**
 * Created by Roman_Nikolaev on 6/1/2017.
 */
public class User {
    public String name = "Piter Chailovskii";
    public String login = "epam";
    public String password = "1234";
    public String lastName = "testLastName";
    public String description = "It is my description, description what I choose, and I like this description. (dot)";


    public User() { }
    public User(String name, String login, String password, String lastName, String description){
        this.name = name;
        this.login = login;
        this.password = password;
        this.lastName = lastName;
        this.description = description;
    }
}