package MenuPac.OperationsCard;

import Cards.GeneralCard;

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
                cardList.remove(numberCard);
                System.out.println("Операция завершена! Удаление карты завершено");
                break;
            }
        }

    }
}
