package service;

import model.User;
import java.util.Map;
import java.util.HashMap;

import static javax.swing.UIManager.put;

public class UserService
{
    Map<String, User> users;

    public UserService()
    {
       users = new HashMap<>();
    }

    public void addUser(User user)
    {
        users.put(user.getUserId(), user);
    }
    public User getUser(String userId)
    {
        return users.get(userId);
    }

    public void showAll()
    {
        for(User user : users.values())
        {
            System.out.println(user);
        }
    }

}
