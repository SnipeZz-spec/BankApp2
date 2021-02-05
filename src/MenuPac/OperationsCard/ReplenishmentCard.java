package MenuPac.OperationsCard;

import Cards.GeneralCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ReplenishmentCard {
    //раздел пополнения карты(банкомат)

    public void replenishmentCard (HashMap<Integer, GeneralCard> cardList) {
        InformationOfCard information = new InformationOfCard();
        ArrayList<GeneralCard> cardNumberList = new ArrayList<>(cardList.values());

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------------------------");
            System.out.println("-----Вы вошли в меню пополнения карт----");
            System.out.println("----------------------------------------");
            information.infOfCard(cardList);
            System.out.println("Введите карту, пополнение которой надо выполнить: ");

            while (true) {
                while (!sc.hasNextInt()) {
                    System.out.println("Некорректное значение! Повторите ввод");
                    sc.next();
                }
                var number = sc.nextInt();
                if (number == 0){
                    break;
                }
                else if (number < 10000000 || number > 99999999) {
                    System.out.println("Некорректное значение! Повторите ввод");
                    continue;
                }
                var card = cardNumberList.stream().filter(c -> c.getNumber() == number).findFirst();
                    if (card.isEmpty()) {
                        System.out.println("Указанной карты не найдено");
                        continue;
                    }
                    System.out.println("Введите сумму пополнения");
                    while (!sc.hasNextDouble()){
                        System.out.println("Некорректное значение! Повторите ввод");
                        sc.next();
                    }
                    var sum = sc.nextDouble();
                    if (sum < 0 || sum == 0) {
                        System.out.println("Введеная сумма некорректна! Повторите ввод");
                    }
                    System.out.println("Пополнение на сумму: " + sum + " выполненно успешно!");
                    cardList.get(number).setBalance(cardList.get(number).getBalance() + sum);
                break;
            }
            break;
        }
    }
}
