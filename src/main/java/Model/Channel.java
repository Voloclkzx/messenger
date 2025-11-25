package Model;
import java.time.LocalTime;

public class Channel {
    private String channelName;
    private User[] userList;
    public Message[] messages;
    private int countm = 1;
    private int channelId;

    LocalTime time = LocalTime.now();
    private static int channelIdCount = 1;

    public Channel(User[] userList,String channelName) {
        this.channelName = channelName;
        this.userList = userList;
        this.messages = new Message[1000];
        messages[0] = new Message("Добро пожаловать в канал " + channelName, time);
        this.channelId = channelIdCount;
        channelIdCount++;
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

    public int getChannelId() {
        return channelId;
    }
    public void addNewMessage(Message messages) {
        this.messages[countm] = messages;
        countm++;
    }
    public int getCountm() {
        return countm;
    }
}
