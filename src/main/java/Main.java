import Model.User;
import Service.InputUser;
public class Main {
    public static void main(String[] args) {
      InputUser inputUser = new InputUser();
      User user = inputUser.checkUser();

      if (user == null) {
          System.out.println("22");
      } else {
          System.out.println("33");
      }
    }
    public void createDatabase() {

    }
}
