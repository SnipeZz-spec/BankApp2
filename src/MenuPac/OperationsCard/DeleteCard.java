package MenuPac.OperationsCard;

import Cards.GeneralCard;
import MenuPac.CardBase;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DeleteCard {
    //раздел удаления карты

    public void deleteCard(HashMap<Integer, GeneralCard> cardList) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (cardList.isEmpty()) {
                System.out.println("У вас пока нет банковских карт");
            }
            else {
                Set<Integer> keys = cardList.keySet();
                System.out.println("Номер карты:" + keys);
                System.out.println("Введите номер карты для удаления: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Некорректный ввод! Повторите попытку");
                    sc.next();
                }
                var numberCard = sc.nextInt();
                if (numberCard == 0) {
                    break;
                }
                else if (numberCard < 10000000 || numberCard > 99999999) {
                    System.out.println("Некорректное значение! Повторите ввод");
                    continue;
                }
                else if (cardList.get(numberCard).getBalance() > 0){
                    while (true) {
                        System.out.println("На карте имеются средства");
                        System.out.println(" ");
                        System.out.println("Номер карты:" + keys);
                        System.out.println(" ");
                        System.out.println("Выберите  карту для их переноса: ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Некорректное значение! Повторите ввод");
                        }
                        var cardTo = sc.nextInt();
                        if (cardTo == 0) {
                            break;
                        }
                        else if (cardTo < 10000000 || cardTo > 99999999 || cardTo == numberCard) {
                            System.out.println("Некорректное значение! Повторите ввод");
                            continue;
                        }
                        var sum = cardList.get(numberCard).getBalance();
                        cardList.get(cardTo).setBalance(cardList.get(cardTo).getBalance() + sum);
                        cardList.remove(numberCard);
                        System.out.println("Операция выполнена! Удаление карты завершено");
                        System.out.println("Средства зачислены на карту: " + cardList.get(cardTo).getNumber());
                        break;
                    }
                }
                else {
                    cardList.remove(numberCard);
                    System.out.println("Операция выполнена! Удаление карты завершено");
                    break;
                }
            }
            break;
        }

    }
}
