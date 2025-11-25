package Model;

public class User {
    private String userName;
    private String password;
    private boolean[] isAdmin = new boolean[4];


    public User(String userName,String password,boolean d1,boolean d2,boolean d3,boolean d4) {
        this.userName = userName;
        this.password = password;
        this.isAdmin = new boolean[]{d1,d2,d3,d4};
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
        User user1 = new User("Robsibe","123456789",true,false,false,false);//Заполнить и вернуть всех пользователей(3-4)
        User user2 = new User("Volodya","volodyacool2007",false,true,false,false);
        User user3 = new User("Anita","Zabivnaya007",false,false,true,false);
        User user4 = new User("Alena","Chokolad2007",false,false,false,true);
        User user5 = new User("Nikita","ArmyLover21",false,false,false,false);
        User user6 = new User("Shamil","Moto-moto2007",false,false,false,false);
        User user7 = new User("Rodion","PivoVsem",false,false,false,false);
        User[] a = {user1,user2,user3,user4,user5,user6,user7};
        return a;

    }


}
