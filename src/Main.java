import model.User;
import service.UserService;

public class Main
{
    public static void  main(String[] args)
    {
        UserService service = new UserService();
        User u1 = new User("u1", "Rushabh", "rushabh45@gmail.com");
        service.addUser(u1);
        System.out.println(service.getUser("u1"));
        User u2 = new User("u2", "Abhi", "abhi45@gmail.com");
        service.addUser(u2);
        System.out.println(service.getUser("u2"));

        service.showAll();
    }
}