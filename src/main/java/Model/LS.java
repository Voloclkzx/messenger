package Model;

public class LS {
    User user1;
    User user2;
    Message[] messagesLS;

    public LS(User user1,User user2, Message[] messagesLS) {
        this.messagesLS = messagesLS;
        this.user1 = user1;
        this.user2 = user2;
    }
}
