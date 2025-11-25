package Model;
import java.time.LocalTime;

public class Group {
    private User[] members;
    private String groupName;
    public Message[] messages;
    private int countm = 1;
    private int groupId;

    LocalTime time = LocalTime.now();
    private static int groupIdCount = 1;


    public Group(User[] members, String groupName) {
        this.members = members;
        this.groupName = groupName;
        this.messages = new Message[1000];
        messages[0] = new Message("Добро пожаловать в группу " + groupName, time);
        this.groupId = groupIdCount;
        groupIdCount++;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public User[] getMembers() {
        return members;
    }

    public void setMembers(User[] members) {
        this.members = members;
    }

    public void addNewMessage(Message messages) {
        this.messages[countm] = messages;
        countm++;
    }

    public int getCountm() {
        return countm;
    }

}
