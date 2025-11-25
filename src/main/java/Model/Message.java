package Model;

public class Message {
    private String messageStroka;
    private String date;
    private boolean media;

    public Message(String messageStroka,String date,boolean media) {
        this.messageStroka = messageStroka;
        this.date = date;
        this.media = media;
    }

    public void setMessageStroka(String newStroka) {
        this.messageStroka = newStroka;
    }
}
