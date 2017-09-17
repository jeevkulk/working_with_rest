package dao;

import domain.Message;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MessageDao {

    @Autowired
    private UserDao userDao;

    public List<Message> getMessages() {

        List<User> userList = userDao.getUsers();

        Message message1 = new Message();
        message1.setMessageId(1001L);
        message1.setUser(userList.get(0));
        message1.setMessage("Kya Kohli, Zero par?");

        Message message2 = new Message();
        message2.setMessageId(1002L);
        message2.setUser(userList.get(1));
        message2.setMessage("Out of syllabus ball tha");

        List<Message> messageList = new ArrayList<>(5);
        messageList.add(message1);
        messageList.add(message2);

        return messageList;
    }
}
