package Model;

public class Channel {
    private String channelName;
    private User[] userList;
    private User admin;
    private Message[] messages;

    public Channel(String channelName) {
        this.channelName = channelName;
    }
    public Channel(String channelName, User admin) {
        this.channelName = channelName;
        this.admin = admin;
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

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public Message[] getMessages() {
        return messages;
    }

    public void setMessages(Message[] messages) {
        this.messages = messages;
    }
}
