package Model;

import java.util.Locale;

import java.time.LocalTime;

public class LS {
    private User user1;
    private User user2;
    private Message[] messagesLS;
    private int countm = 1;

    LocalTime time = LocalTime.now();

    public LS(User user1,User user2) {
        this.messagesLS = new Message[1000];
        messagesLS[0] = new Message("Чат " + user1.getUserName() + " - " + user2.getUserName(), time);
//        Добавить первым сообщением что за чат
        this.user1 = user1;
        this.user2 = user2;
    }

    public void addNewMessage(Message messageLS) {
        messagesLS[countm] = messageLS;
        countm++;
    }

    public void getAllMessages() {
        for(int i = 0; i < (countm); i++) {
                System.out.println(messagesLS[i]);
        }
    }

    public static LS[] getAllLS(User[] users) {
        LS[] allLS = new LS[(users.length*(users.length-1))/2];
        int k = 0;
        for (int i = 0; i < users.length; i++) {
            for (int j = i+1;j < users.length; j++) {
                allLS[k] = new LS(users[i],users[j]);
                k++;
            }
        }
        return allLS;
    }


    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }
}
