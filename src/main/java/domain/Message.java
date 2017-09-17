package domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

    private long messageId;
    private User user;
    private String message;

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
