package MenuPac.PayOperations;

import Cards.GeneralCard;
import MenuPac.Checks.ChecksOfInput;
import MenuPac.Lists.RegularSpendingHash;
import MenuPac.Lists.Services;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RegularSpending {

    public void regularSpend(HashMap<Integer, GeneralCard> cardList, HashMap<Integer,Services> regularHashMap) {
        InformationOfCard information = new InformationOfCard();
        while (true) {
            Scanner sc = new Scanner(System.in);
            ChecksOfInput checks = new ChecksOfInput();
            RegularSpendingHash regularSpendingHash = new RegularSpendingHash();
            regularSpendingHash.createRegularHash();
            ArrayList<GeneralCard> cardNumberList = new ArrayList<>(cardList.values());
            ArrayList<Services> servicesList = new ArrayList<>(regularHashMap.values());

            while (true) {
                System.out.println("----------------------------------------------------------");
                System.out.println("-----Вы вошли в раздел оплаты регулярных счетов счетов----");
                System.out.println("----------------------------------------------------------");
                regularSpendingHash.viewRegularHash();
                System.out.println("----------------------------------------------------------");
                System.out.println("Выберите услугу, оплату которой следует произвести: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Некорректное значение! Повторите ввод");
                    sc.next();
                }
                var numberOfService = sc.nextInt();
//                information.infOfCard(cardList);
//                System.out.println("С какой карты выполнить оплату?");
//                while (!sc.hasNextInt()) {
//                    System.out.println("Некорректно значение! Повторите ввод");
//                    sc.next();
//                }
//                var cardFrom = sc.nextInt();
//                if (cardFrom == 0) {
//                    break;
//                }
//                else if (cardFrom < 10000000 || cardFrom > 99999999) {
//                    System.out.println("Некорректное значение! Повторите ввод");
//                    continue;
//                }
//                var cardFromCheck = cardNumberList.stream().filter(c -> c.getNumber() == cardFrom).findFirst();
//                if (cardFromCheck.isEmpty()){
//                    System.out.println("Указанной карты не найдено");
//                    continue;
//                }
                else {
                    var sum = servicesList.get(numberOfService).getCostOfService();
                    System.out.println(sum);
                    cardList.get(cardFrom).setBalance(cardList.get(cardFrom).getBalance());
                    break;
                }


                //я хочу вынести метод выбора карты в отдельный метод.
                //он написан в классе ChecksOfInput
                //текст, который закомментирован - это как раз то, что я хочу вынести в отдельный класс


            }
            break;
        }
    }
}
