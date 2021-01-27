package MenuPac.OperationsCard;

import Cards.GeneralCard;
import MenuPac.Checks.ChecksOfInput;
import MenuPac.Lists.MenuList;
import MenuPac.Lists.Services;
import MenuPac.PayOperations.RegularSpending;

import java.util.HashMap;
import java.util.Scanner;

public class BillMenu {

    public void billMenu(HashMap<Integer, GeneralCard> cardList, HashMap<Integer, Services> regularHashMap) {
        RegularSpending regularSpending = new RegularSpending();

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
                    regularSpending.regularSpend(cardList, regularHashMap);
                    break;
                case 2:

                    break;
                case 0:
                    break;

            }
            break;
        }
    }

}
