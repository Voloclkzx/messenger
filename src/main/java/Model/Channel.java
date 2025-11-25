package Model;
import java.time.LocalTime;

public class Channel {
    private String channelName;
    private User[] userList;
    private Message[] messages;

    LocalTime time = LocalTime.now();

    public Channel(User[] userList,String channelName) {
        this.channelName = channelName;
        this.userList = userList;
        this.messages = new Message[1000];
        messages[0] = new Message("Добро пожаловать в канал " + channelName, time);

    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public User[] getUserList() {
        return userList;
    }

    public void setUserList(User[] userList) {
        this.userList = userList;
    }

    public Message[] getMessages() {
        return messages;
    }

    public void setMessages(Message[] messages) {
        this.messages = messages;
    }
}
