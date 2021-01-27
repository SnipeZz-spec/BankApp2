package MenuPac;

import Cards.GeneralCard;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CardBase {
    private final HashMap<Integer, GeneralCard> allCard = new HashMap<>();

    public void unitDB() {
        allCard.put(12345678, new GeneralCard("Visa", 12345678, 12, 22,0));
        allCard.put(98745612, new GeneralCard("Maestro", 98745612, 12, 25, 5000));
    }

    public HashMap<Integer, GeneralCard> getAllCard() {
        return allCard;
    }

    public void regularSpending() {
        Scanner sc = new Scanner(System.in);
        InformationOfCard information = new InformationOfCard();
        ArrayList<GeneralCard> cardNumberList = new ArrayList<>(allCard.values());
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println("Некорректное значение! Повторите ввод");
                sc.next();
            }
            var cardFrom = sc.nextInt();
            if (cardFrom != 0 & (cardFrom < 10000000 || cardFrom > 99999999)) {
                var cardCheck = cardNumberList.stream().filter(c -> c.getNumber() == cardFrom).findFirst();
                if (cardCheck.isEmpty()){
                    System.out.println("Указанной карты не найдено");
                    continue;
                }
                else {
                    return cardNumberList.get(cardFrom).getBalance();
                }
            }


        }
    }

}
