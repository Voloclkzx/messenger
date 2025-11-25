import Model.*;
import Service.InputUser;

import java.util.Scanner;
import java.time.LocalTime;
public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static User[] users = User.getAll();
    private static LS[] chats = LS.getAllLS(users);
    private static Group group1 = new Group(new User[]{users[0],users[1],users[4],users[6]},"Информатики");
    private static Group group2 = new Group(new User[]{users[1],users[5],users[6]},"Чебупельки");
    private static Channel channel1 = new Channel(new User[]{users[2],users[1],users[0],users[3]},"Приколистка");
    private static Channel channel2 = new Channel(new User[]{users[3],users[4],users[5],users[0],users[2],},"Шоколадка");
    private static Group[] groups = new Group[]{group1,group2};
    private static Channel[] channels = new Channel[]{channel1,channel2};
    public static void main(String[] args) {
     accountInputUser();
    }

    public static void accountInputUser() {
        InputUser inputUser = new InputUser();
        User user = inputUser.checkUser();

        if (user == null) {
            System.out.println("Неверно введён логин или пароль");
            System.exit(1);
        } else {
            System.out.println("Верификация успешна! Добро пожаловать, " + user.getUserName());
            startMenu(user);
        }
    }
    public static void startMenu(User user) {
        System.out.println("Напишите категорию, куда вы хотите отправить сообщение или напишите \"Выход\", чтобы выйти из аккаунта:");
        System.out.println("Личный чат\nГруппа\nКанал");
        String category = scan.nextLine();
        if (category.equals("Выход")) {
            accountInputUser();
        } else {
            boolean flag1 = true;
            while (flag1) {
                flag1 = false;
                if (category.equals("Личный чат")) {
                    f1(user);
                } else if (category.equals("Группа")) {
                    f2(user);
                } else if (category.equals("Канал")) {
                    f3(user);
                } else {
                    System.out.println("Неверно введена категория, попробуйте снова");
                    flag1 = true;
                    category = scan.nextLine();
                }
            }
        }

    }

    public static void f1(User user) {
        System.out.println("Выберите, кому вы хотите отправить сообщение. Доступные пользователи:");
        for (User x: users) {
            if (!(x.getUserName().equals(user.getUserName()))) {
                System.out.println(x.getUserName());
            }
        }
        String userName = scan.nextLine();
        for (LS x : chats) {
            if ((x.getUser1().getUserName().equals(user.getUserName()) && x.getUser2().getUserName().equals(userName)) || (x.getUser2().getUserName().equals(user.getUserName()) && x.getUser1().getUserName().equals(userName))) {
                x.getAllMessages();
                boolean flag2 = true;
                while(flag2) {
                    System.out.println("Введите ваше сообщение или напишите \"Выход\", чтобы выйти");
                    String soob = scan.nextLine();
                    if (soob.equals("Выход")) {
                        flag2 = false;
                        startMenu(x.getUser1());
                    } else {
                        LocalTime time = LocalTime.now();
                        x.addNewMessage(new Message(user.getUserName()+": "+soob, time));
                        x.getAllMessages();
                    }

                }

            }
        }


    }
    public static void f2(User user) {
        System.out.println("Выберите, в какую группу хотите отправить сообщение. Доступные группы:");
        for (Group x: groups) {
            for (User y: x.getMembers())
               if ((y.getUserName().equals(user.getUserName()))) {
                System.out.println(x.getGroupName());
            }
        }
        String groupName = scan.nextLine();
        for (Group x : groups) {
            if (x.getGroupName().equals(groupName)) {
                for(int i = 0; i < (x.getCountm()); i++) {
                    System.out.println(user.getUserName() + ": " + x.messages[i]);
                }
                boolean flag2 = true;
                while(flag2) {
                    System.out.println("Введите ваше сообщение или напишите \"Выход\", чтобы выйти");
                    String soob = scan.nextLine();
                    if (soob.equals("Выход")) {
                        flag2 = false;
                        startMenu(user);
                    } else {
                        LocalTime time = LocalTime.now();
                        x.addNewMessage(new Message(user.getUserName()+": "+soob, time));
                        for(int i = 0; i < (x.getCountm()); i++) {
                            System.out.println(x.messages[i]);
                        }
                    }

                }

            }
        }
    }
    public static void f3(User user) {
        System.out.println("Выберите, какой канал вы хотите посмотреть. Доступные каналы:");
        for (Channel x: channels) {
            for (User y : x.getUserList()) {
                if ((y.getUserName().equals(user.getUserName()))) {
                    System.out.println(x.getChannelName());
                }

            }
        }

        String channelName = scan.nextLine();
        for (Channel x : channels) {
            if (x.getChannelName().equals(channelName)) {
                for(int i = 0; i < (x.getCountm()); i++) {
                    System.out.println(user.getUserName() + ": " + x.messages[i]);
                }
                boolean isAdmin = false;
                if (x.getChannelId() == user.getAdminChannelId()) {
                    isAdmin = true;
                }
                if (isAdmin) {
                    System.out.println("Добро пожаловать, администратор!");
                    boolean flag3 = true;
                    while(flag3) {
                        System.out.println("Напишите новый пост в канал или напишите \"Выход\", чтобы выйти");
                        String soob = scan.nextLine();
                        if (soob.equals("Выход")) {
                            flag3 = false;
                            startMenu(user);
                        } else {
                            LocalTime time = LocalTime.now();
                            x.addNewMessage(new Message(user.getUserName()+": "+soob, time));
                            for(int i = 0; i < (x.getCountm()); i++) {
                                System.out.println(x.messages[i]);
                            }
                        }

                    }
                } else {
                    for(int i = 0; i < (x.getCountm()); i++) {
                        System.out.println(x.messages[i]);
                    }
                    startMenu(user);

                }


            }
        }
    }

}
