package MenuPac.OperationsCard;

import Cards.GeneralCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemittanceCard {
    //раздел перевода средств между картами

    public void remittanceOperation(HashMap<Integer, GeneralCard> cardList) {
        ArrayList<GeneralCard> cardNumberList = new ArrayList<>(cardList.values());
        InformationOfCard information = new InformationOfCard();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------------------------");
            System.out.println("----Вы вошли в меню операции перевода---");
            System.out.println("----------------------------------------");

            while (true) {
                if (cardList.isEmpty() || cardList.size() < 2) {
                    System.out.println("Для операции перевода необходимо наличие хотя бы 2 карт");
                    System.out.println("-------------------------------------------------------");
                    break;
                }
                information.infOfCard(cardList);
                System.out.println("Введите номер карты, с которой выполнить перевод: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Некорректное значение! Повторите ввод");
                    sc.next();
                }
                var cardFrom = sc.nextInt();
                if (cardFrom == 0) {
                    break;
                } else if (cardFrom < 10000000 || cardFrom > 99999999) {
                    System.out.println("Некорректное значение! Повторите ввод");
                    continue;
                }
                var cardFromCheck = cardNumberList.stream().filter(c -> c.getNumber() == cardFrom).findFirst();
                if (cardFromCheck.isEmpty()) {
                    System.out.println("Указанной карты не найдено");
                    continue;
                }

                System.out.println("Введите номер карты, на которую совершить перевод: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Некорректное значение! Повторите ввод");
                    sc.next();
                }
                var cardTo = sc.nextInt();
                if (cardTo == 0) {
                    break;
                } else if (cardTo < 10000000 || cardTo > 99999999) {
                    System.out.println("Некорректное значение! Повторите ввод");
                    continue;
                }
                var cardToCheck = cardNumberList.stream().filter(c -> c.getNumber() == cardTo).findFirst();
                if (cardToCheck.isEmpty()) {
                    System.out.println("Указанной карты не найдено");
                    continue;
                }

                System.out.println("Введите сумму зачисления: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Некорректное значение! Повторите ввод");
                    sc.next();
                }
                var sum = sc.nextDouble();
                if (sum < 0 || sum == 0) {
                    System.out.println("Сумма зачисления не корректна! Повторите ввод");
                    continue;
                }
                else if(cardList.get(cardFrom).getBalance() < sum){
                    System.out.println("На карте недостаточно средств");
                    continue;
                }
                System.out.println("Перевод на сумму " + sum + " выполнен успешно!");
                cardList.get(cardFrom).setBalance(cardList.get(cardFrom).getBalance() - sum);
                cardList.get(cardTo).setBalance(cardList.get(cardTo).getBalance() + sum);
                break;
            }
            break;
        }
    }
}
