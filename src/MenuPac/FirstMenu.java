package MenuPac;

import MenuPac.Lists.MenuList;
import MenuPac.Lists.PurchasesHashMap;
import MenuPac.Lists.RegularSpendingHash;
import MenuPac.OperationsCard.BillMenu;
import MenuPac.OperationsCard.RemittanceCard;
import MenuPac.OperationsCard.ReplenishmentCard;
import MenuPac.PayOperations.PayInformation;

import java.util.Scanner;

public class FirstMenu {
    //начальное меню

    public void firstMenu(CardBase base, RegularSpendingHash hash, PurchasesHashMap purchasesHashMap) {
        controlCardMenu controlCardMenu = new controlCardMenu();
        ReplenishmentCard replenishmentCard = new ReplenishmentCard();
        RemittanceCard remittanceCard = new RemittanceCard();
        BillMenu billMenu = new BillMenu();
        PayInformation payInformation = new PayInformation();
        MenuList menuList = new MenuList();
        System.out.println("------------------------------------------");
        System.out.println("--- Добро пожаловать в мобильный банк! ---");
        System.out.println("------------------------------------------");

        while (true) {
            Scanner sc = new Scanner(System.in);
            menuList.viewStartMenu();
            int v = sc.nextInt();
            if (v != 0) {

                switch (v) {
                    case 1:
                        controlCardMenu.controlCardMenu(base, hash, purchasesHashMap);
                        break;
                    case 2:
                        replenishmentCard.replenishmentCard(base.getAllCard(), purchasesHashMap);
                        break;
                    case 3:
                        remittanceCard.remittanceOperation(base.getAllCard(), purchasesHashMap);
                        break;
                    case 4:
                        billMenu.billMenu(base.getAllCard(), hash.getRegularHashMap(), base, purchasesHashMap);
                        break;
                    case 5:
                        payInformation.viewInformationOfPay(purchasesHashMap);
                        break;
                }
            } else {
                break;
            }
        }
    }
}
