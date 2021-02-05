package MenuPac.PayOperations;

import Cards.GeneralCard;
import MenuPac.CardBase;
import MenuPac.Checks.ChecksOfInput;
import MenuPac.Lists.PurchasesHashMap;
import MenuPac.Lists.RegularSpendingHash;
import MenuPac.Lists.Services;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.HashMap;
import java.util.Scanner;

public class RegularSpending {
    //класс регулярных покупок

    public void regularSpend(HashMap<Integer, GeneralCard> cardList, HashMap<Integer,Services> regularHashMap, CardBase base, PurchasesHashMap purchasesHashMap) {
        InformationOfCard information = new InformationOfCard();
        while (true) {
            Scanner sc = new Scanner(System.in);
            ChecksOfInput checks = new ChecksOfInput();
            RegularSpendingHash regularSpendingHash = new RegularSpendingHash();
            regularSpendingHash.createRegularHash();

            while (true) {
                System.out.println("----------------------------------------------------------");
                System.out.println("----- Вы вошли в раздел оплаты регулярных счетов ---------");
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
                var nameOfService = regularSpendingHash.getNameOfService(numberOfService);
                var costOfService = regularSpendingHash.getCostOfService(numberOfService);
                information.infOfCard(cardList);
                System.out.println("Введите номер карты с которой выполнить оплату: ");
                while (true) {
                    while (!sc.hasNextInt()) {
                        System.out.println("Некорректное значение! Повторите ввод");
                        sc.next();
                    }
                    var cardFrom = sc.nextInt();                              // оно работает, но
                    if (cardFrom == 0) {
                        break;
                    }
                    var balanceOfCard = base.getBalanceOfCard(cardFrom);   // мне кажется это не красиво написано
                    if (balanceOfCard == -1) {
                        continue;
                    }
                    base.payOperation(cardFrom, balanceOfCard, costOfService);
                    var numberOfOperation =  purchasesHashMap.randomNumber();
                    purchasesHashMap.putInServiceBase(numberOfOperation,nameOfService,costOfService);
                    continue;
                }
            }
            break;
        }
    }
}
