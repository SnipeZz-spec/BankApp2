package MenuPac.PayOperations;

import Cards.GeneralCard;
import MenuPac.CardBase;
import MenuPac.Lists.PurchasesHashMap;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.HashMap;
import java.util.Scanner;

public class OneTimeSpending {
    //класс единоразовой оплаты счета

    public void oneTimeSpend(HashMap<Integer, GeneralCard> cardList, CardBase base, PurchasesHashMap purchasesHashMap) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            InformationOfCard information = new InformationOfCard();
            System.out.println("----------------------------------------------------------");
            System.out.println("------- Вы вошли в раздел единоразовой оплаты счета ------");
            System.out.println("----------------------------------------------------------");
            System.out.println("Введите назначение счета: ");
            var nameOfService = sc.next(); //добавить на проверку букв и при вводе 0 - выход из программы
            if (nameOfService.contains("0")) {
                break;
            }
            System.out.println("Введите сумму счета: ");
            while (!sc.hasNextInt()) {
                System.out.println("Некорректный ввод! Повторите попытку");
                sc.next();
            }
            var sumOfService = sc.nextInt();
            if (sumOfService < 0) {
                System.out.println("Некорректный ввод! Повторите попытку");
                continue;
            }
            System.out.println("----------------------------------------------------------");
            information.infOfCard(cardList);
            System.out.println(" Введите номер карты с которой стоит произвести оплату: ");
            while (true) {
                while (!sc.hasNextInt()) {
                    System.out.println("Некорректный ввод! Повторите попытку");
                    sc.next();
                }
                var cardFrom = sc.nextInt();
                if (cardFrom == 0) {
                    break;
                }
                var balanceOfCard = base.getBalanceOfCard(cardFrom);
                if (balanceOfCard == -1) {
                    continue;
                }
                base.payOperation(cardFrom,balanceOfCard,sumOfService);
                purchasesHashMap.putInServiceBase(purchasesHashMap.randomNumber(),nameOfService,sumOfService);
                continue;
            }
            break;
        }
    }
}
