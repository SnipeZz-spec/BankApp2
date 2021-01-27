package MenuPac.Checks;

import Cards.GeneralCard;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.ArrayList;
import java.util.HashMap;
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

    //метод ввода и проверки строки
    public String checkString() {
        Scanner sc = new Scanner(System.in);
        var str = sc.next();
        return str;
    }

//




//    public void checkOfCard(HashMap<Integer, GeneralCard> cardList) {
//        ArrayList<GeneralCard> cardNumberList = new ArrayList<>(cardList.values());
//        while (true) {
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
//        }
//    }
}
