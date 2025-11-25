package Service;

import Model.User;

import java.util.Scanner;

public class InputUser {
        public User checkUser() {
            System.out.println("Введите логин, либо введите \"exit\", чтобы завершить программу: ");
            Scanner scanner = new Scanner(System.in);
            String login = scanner.nextLine();
            System.out.println("Введите пароль, либо введите \"exit\", чтобы завершить программу: ");
            String password = scanner.nextLine();
            if (login.equals("exit") || password.equals("exit")) {
                return null;
            }
            for (User user : User.getAll()) {
                if (checkLoginPassword(login, password, user)) {
                    return user;
                }
            }
            return null;
        }
        boolean checkLoginPassword(String login, String password, User user) {
            if (user.getUserName().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
            return false;
        }


}
