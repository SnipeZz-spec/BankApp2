package MenuPac.OperationsCard;

import Cards.GeneralCard;
import MenuPac.CardBase;
import MenuPac.Checks.ChecksOfInput;
import MenuPac.Lists.MenuList;
import MenuPac.Lists.PurchasesHashMap;
import MenuPac.Lists.Services;
import MenuPac.PayOperations.OneTimeSpending;
import MenuPac.PayOperations.RegularSpending;

import java.util.HashMap;

public class BillMenu {
    //раздел оплаты счетов

    public void billMenu(HashMap<Integer, GeneralCard> cardList, HashMap<Integer, Services> regularHashMap, CardBase base, PurchasesHashMap purchasesHashMap) {
        RegularSpending regularSpending = new RegularSpending();
        OneTimeSpending oneTimeSpending = new OneTimeSpending();

        while (true) {
            MenuList menuList = new MenuList();
            ChecksOfInput checks = new ChecksOfInput();
            System.out.println("----------------------------------------");
            System.out.println("-----Вы вошли в раздел оплаты счетов----");
            System.out.println("----------------------------------------");
            menuList.billMenuList();
            System.out.println("Какой вид оплаты вы хотите совершить?");
            switch (checks.checkInt()) {
                case 1:
                    regularSpending.regularSpend(cardList, regularHashMap,base, purchasesHashMap);
                    break;
                case 2:
                    oneTimeSpending.oneTimeSpend(cardList,base,purchasesHashMap);
                    break;
                case 0:
                    break;
            }
            break;
        }
    }

}
