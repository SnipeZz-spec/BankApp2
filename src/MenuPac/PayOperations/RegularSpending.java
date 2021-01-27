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
                checks.checkOfCard(cardList); //тут  я получаю баланс карты из метода, написанного в checksOfInput
                // а вот как его использовать дальше не знаю
                // тут опишу, что будет дальше:
                // У меня есть еще одна мапа, где лежит Integer(key) и объект класса(value) - у объекта есть double поле
                // c ценой услуги. И вот эту сумму мне надо вычитать из баланса, который пришел нам выше.
                // У меня вот не получается уловить логику ООП в это моменте, как использовать полученые значения.
                // Не обращай внимание на код ниже

//                var numberOfService = sc.nextInt();
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
//                else {
//                    var sum = servicesList.get(numberOfService).getCostOfService();
//                    System.out.println(sum);
//                    cardList.get(cardFrom).setBalance(cardList.get(cardFrom).getBalance());
//                    break;
//                }
            }

        }
    }
}
