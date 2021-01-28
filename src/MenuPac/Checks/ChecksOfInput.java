package MenuPac.Checks;

import Cards.GeneralCard;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class ChecksOfInput {

    //метод ввода и проверки числа int
    public int checkInt() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Некорректный ввод! Повторите попытку");
            sc.next();
        }
        var v = sc.nextInt();
        return v;
    }

//    public boolean payCheck(int numberOfCard, double sumToPay) {
//        var cardFrom = getCard(numberOfCard);
//        if (cardFrom.is)
//
//    }
//
//    private Optional<GeneralCard> getCard(int number) {
//        var curCard =
//    }






//    public double checkOfCard(HashMap<Integer, GeneralCard> cardList) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<GeneralCard> cardNumberList = new ArrayList<>(cardList.values());
//        InformationOfCard information = new InformationOfCard();
//        while (true) {
//            information.infOfCard(cardList);
//            System.out.println("С какой карты выполнить оплату?");
//            while (!sc.hasNextInt()){
//                System.out.println("Некорректное значение! Повторите ввод");
//                sc.next();
//            }
//            var cardFrom = sc.nextInt();
//            if (cardFrom == 0) {
//                break;
//            } else if (cardFrom < 10000000 || cardFrom > 99999999) {
//                System.out.println("Некорректное значение! Повторите ввод");
//                continue;
//            }
//            var cardCheck = cardNumberList.stream().filter(c -> c.getNumber() == cardFrom).findFirst();
//            if (cardCheck.isEmpty()) {
//                System.out.println("Указанной карты не найдено");
//                continue;
//            }
//            else {
//                System.out.println("Карта найдена");
//                return checkOfCard(cardList);
//            }
//        }
//        return 0; //я хз почему тут просит вставить return
//    }



}
