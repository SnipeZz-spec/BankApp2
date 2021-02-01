package MenuPac.PayOperations;

import Cards.GeneralCard;
import MenuPac.CardBase;
import MenuPac.Checks.ChecksOfInput;
import MenuPac.Lists.RegularSpendingHash;
import MenuPac.Lists.Services;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RegularSpending {

    public void regularSpend(HashMap<Integer, GeneralCard> cardList, HashMap<Integer,Services> regularHashMap, CardBase base) {
        InformationOfCard information = new InformationOfCard();
        while (true) {
            Scanner sc = new Scanner(System.in);
            ChecksOfInput checks = new ChecksOfInput();
            RegularSpendingHash regularSpendingHash = new RegularSpendingHash();
            regularSpendingHash.createRegularHash();
            ArrayList<GeneralCard> cardNumberList = new ArrayList<>(cardList.values());
            ArrayList<Services> servicesList = new ArrayList<>(regularHashMap.values());

//            CheckingCard checkingCard = new CheckingCard();

            while (true) {
                System.out.println("----------------------------------------------------------");
                System.out.println("-----Вы вошли в раздел оплаты регулярных счетов счетов----");
                System.out.println("----------------------------------------------------------");
                regularSpendingHash.viewRegularHash();
                System.out.println("Выберите услугу, оплату которой следует произвести: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Некорректное значение! Повторите ввод");
                    sc.next();
                }
                var numberOfService = sc.nextInt();
                if (numberOfService == 0){
                    break; //некрасивая хрень
                }
                var costOfService = regularSpendingHash.getCostOfService(numberOfService);
                information.infOfCard(cardList);
                System.out.println("Введите номер карты с которой выполнить оплату: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Некорректное значение! Повторите ввод");
                    sc.next();
                }
                while (true) {
                    var cardFrom = sc.nextInt();                              // оно работает, но
                    var balanceOfCard = base.getBalanceOfCard(cardFrom);   // мне кажется это не красиво написано
                    if (balanceOfCard == -1) {
                        break;
                    }
                    base.payOperation(cardFrom, balanceOfCard, costOfService);
                }
            }
            break;
        }
    }
}
