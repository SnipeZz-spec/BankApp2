package MenuPac.OperationsCard;

import Cards.GeneralCard;
import MenuPac.Checks.ChecksOfInput;
import MenuPac.MenuList;

import java.util.HashMap;
import java.util.Scanner;

public class CreateNewCard {
    public void createCard(HashMap<Integer, GeneralCard> cardList) {
        Scanner sc = new Scanner(System.in);
        ChecksOfInput checks = new ChecksOfInput();
        while (true) {
            MenuList menuList = new MenuList();
            menuList.producerCard();
            System.out.println("Выберите представителя платежной системы");
            switch (checks.checkInt()) {
                case 1:
                    System.out.println("Введите номер карты (8 знаков): ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Некорректное значение! Повторите ввод");
                            sc.next();
                        }
                        var numberCard = sc.nextInt();
                        if (numberCard < 10000000 | numberCard > 99999999) {
                            System.out.println("Повторите ввод");
                            sc.next();
                        }
                    System.out.println("Введите номер нынешнего месяца: ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Некорректное значение! Повторите ввод");
                            sc.next();
                        }
                        var monthCard = sc.nextInt();
                        if (monthCard < 1 | monthCard > 12) {
                            System.out.println("Некорректное значение! Повторите ввод");
                            sc.next();
                        }
                    System.out.println("Введите две последние цифры нынешнего года: ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Некорректное значение! Повторите ввод");
                            sc.next();
                        }
                        var yearCard = sc.nextInt();
                        if (yearCard < 1 | yearCard > 99) {
                            System.out.println("Некорректное значение! Повторите ввод");
                            sc.next();
                        }
                    System.out.println("Карта успешно создана!");
                    cardList.put(numberCard,new GeneralCard("Visa",numberCard,monthCard,yearCard,0));
                    break;
                case 2:
                    System.out.println("Введите номер карты (8 знаков): ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Некорректное значение! Повторите ввод");
                        sc.next();
                    }
                    var numberCard2 = sc.nextInt();
                    if (numberCard2 < 10000000 | numberCard2 > 99999999) {
                        System.out.println("Повторите ввод");
                        sc.next();
                    }
                    System.out.println("Введите номер нынешнего месяца: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Некорректное значение! Повторите ввод");
                        sc.next();
                    }
                    var monthCard2 = sc.nextInt();
                    if (monthCard2 < 1 | monthCard2 > 12) {
                        System.out.println("Некорректное значение! Повторите ввод");
                        sc.next();
                    }
                    System.out.println("Введите две последние цифры нынешнего года: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Некорректное значение! Повторите ввод");
                        sc.next();
                    }
                    var yearCard2 = sc.nextInt();
                    if (yearCard2 < 1 | yearCard2 > 99) {
                        System.out.println("Некорректное значение! Повторите ввод");
                        sc.next();
                    }
                    System.out.println("Карта успешно создана!");
                    cardList.put(numberCard2,new GeneralCard("Maestro",numberCard2,monthCard2,yearCard2,0));
                    break;
            }
            break;
        }
    }
}
