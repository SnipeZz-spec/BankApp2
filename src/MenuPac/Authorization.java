package MenuPac;

import java.util.HashMap;
import java.util.Scanner;

public class Authorization {
    //авторизация

    public void authorization() {
        HashMap<String, String>PassLog = new HashMap<>();
        PassLog.put("Admin", "123456");

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----------Авторизация-----------");
            System.out.println(" ");
            System.out.println("В данный момент происходит бета-тест");
            System.out.println("Ключи входа в программу: ");
            System.out.println("Логин: Admin");
            System.out.println("123456");
            System.out.println("---------------------------------");
            System.out.println("Введите логин");
            String login = sc.next();
            System.out.println("Введите пароль");
            String pass = sc.next();
            if (PassLog.containsKey(login) & PassLog.containsValue(pass)) {
                System.out.println("Авторизация прошла успешно!");
                System.out.println(" ");
                break;
            }
            else {
                System.out.println("Вход не осуществлен! Повторите попытку.");
                continue;
            }
        }
    }
}
