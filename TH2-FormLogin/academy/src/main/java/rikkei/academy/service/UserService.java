package rikkei.academy.service;

import rikkei.academy.model.Login;
import rikkei.academy.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Chinh");
        u1.setAccount("chinhcomhut");
        u1.setEmail("chinhcomhut@rikkei.vn");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Dung");
        u2.setAccount("dung");
        u2.setEmail("dung@rikkei.academy");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Hai");
        u3.setAccount("hai");
        u2.setEmail("hai@rikkeisoft.vn");
        u3.setPassword("123456");
        users.add(u3);
    }
    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }

}
