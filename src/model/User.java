package model;

import javax.management.ConstructorParameters;
//Constructor
public class User {
    private String userId;
    private String name;
    private String email;


    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }
    //getters
    public String getUserId()
    {
        return userId;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    @Override
    public String toString()
    {
        return this.userId + " " + this.name + " " + this.email;
    }
}