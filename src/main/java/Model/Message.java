package Model;
import java.time.LocalTime;

public class Message {
    private String messageStroka;
    private LocalTime date;

    public Message(String messageStroka,LocalTime date) {
        this.messageStroka = messageStroka;
        this.date = date;
    }

    public void setMessageStroka(String newStroka) {
        this.messageStroka = newStroka+" (ред.)"; //учесть что несколько раз можно редачить
    }

    public void deleteMessageStroka() {
        this.messageStroka = "Сообщение удалено";
    }

    public String toString(){
        return messageStroka+" ("+date+")";
    }
}
