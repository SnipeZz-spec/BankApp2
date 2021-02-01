package MenuPac;

import Cards.GeneralCard;
import MenuPac.Lists.MenuList;
import MenuPac.Lists.RegularSpendingHash;
import MenuPac.OperationsCard.BillMenu;
import MenuPac.OperationsCard.RemittanceCard;
import MenuPac.OperationsCard.ReplenishmentCard;

import java.util.HashMap;
import java.util.Scanner;

public class FirstMenu {
    public void firstMenu(CardBase base, RegularSpendingHash hash) {
        controlCardMenu controlCardMenu = new controlCardMenu();
        ReplenishmentCard replenishmentCard = new ReplenishmentCard();
        RemittanceCard remittanceCard = new RemittanceCard();
        BillMenu billMenu = new BillMenu();
        MenuList menuList = new MenuList();
        System.out.println("Добро пожаловать в мобильный банк!");
        System.out.println("----------------------------------------");

        while (true) {
            Scanner sc = new Scanner(System.in);
            menuList.viewStartMenu();
            int v = sc.nextInt();
            switch (v) {
                case 1:
                    controlCardMenu.controlCardMenu(base, hash);
                    break;
                case 2:
                    replenishmentCard.replenishmentCard(base.getAllCard());
                    break;
                case 3:
                    remittanceCard.remittanceOperation(base.getAllCard());
                    break;
                case 4:
                    billMenu.billMenu(base.getAllCard(), hash.getRegularHashMap(), base);
                    break;
            }


        }
    }
}
