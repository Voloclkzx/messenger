package Model;

public class User {
    private String userName;
    private String[] contactList;
    private String[] groupList;
    private String[] channelList;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String[] getContactList() {
        return contactList;
    }

    public void setContactList(String[] contactList) {
        this.contactList = contactList;
    }

    public String[] getGroupList() {
        return groupList;
    }

    public void setGroupList(String[] groupList) {
        this.groupList = groupList;
    }


    public String[] getChannelList() {
        return channelList;
    }

    public void setChannelList(String[] channelList) {
        this.channelList = channelList;
    }
}
