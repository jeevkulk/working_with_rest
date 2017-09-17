package dao;

import domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {

    public List<User> getUsers() {
        User user1 = new User();
        user1.setUserId(100L);
        user1.setUserName("MS Dhoni");

        User user2 = new User();
        user2.setUserId(101L);
        user2.setUserName("Virat Kohli");

        List<User> userList = new ArrayList<>(2);
        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}
