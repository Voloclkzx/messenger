package Model;

public class Group {
    private User[] members;
    private String groupName;
    private User admin;
    public Message[] messages;

    public Group(User[] members, String groupName, User admin, Message[] messages) {
        this.members = members;
        this.groupName = groupName;
        this.admin = admin;
        this.messages = messages;
    }


}
