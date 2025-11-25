package Model;

public class User {
    private String userName;
    private String password;
    private int adminGroupId;
    private int adminChannelId;


    public User(String userName,String password,int adminGroupId, int adminChannelId) {
        this.userName = userName;
        this.password = password;
        this.adminGroupId = adminGroupId;
        this.adminChannelId = adminChannelId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword(){
        return password;
    }
    public static User[] getAll() {
        User user1 = new User("Robsibe","123456789", 1, 0);
        User user2 = new User("Volodya","volodyacool2007",2, 0);
        User user3 = new User("Anita","Zabivnaya007",0, 1);
        User user4 = new User("Alena","Chokolad2007",0, 2);
        User user5 = new User("Nikita","ArmyLover21",0, 0);
        User user6 = new User("Shamil","Moto-moto2007", 0, 0);
        User user7 = new User("Rodion","PivoVsem", 0, 0);
        User[] a = {user1,user2,user3,user4,user5,user6,user7};
        return a;
    }




    public int getAdminGroupId() {
        return adminGroupId;
    }

    public void setAdminGroupId(int adminGroupId) {
        this.adminGroupId = adminGroupId;
    }

    public int getAdminChannelId() {
        return adminChannelId;
    }

    public void setAdminChannelId(int adminChannelId) {
        this.adminChannelId = adminChannelId;
    }
}
