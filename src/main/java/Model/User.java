package Model;

public class User {
    private String userName;
    private String password;
    private Boolean[] isAdmin;


    public User(String userName,String password, Boolean[] isAdmin) {
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
