package MenuPac;

import MenuPac.Lists.PurchasesHashMap;
import MenuPac.Lists.RegularSpendingHash;


public class MainMenu {
    public static void main(String[] args) {
        // точка входа в программу
        Authorization authorization = new Authorization();
        FirstMenu firstMenu = new FirstMenu();
        CardBase cardBase = new CardBase();
        RegularSpendingHash hash = new RegularSpendingHash();
        PurchasesHashMap purchasesHashMap = new PurchasesHashMap();
        cardBase.unitDB();

        authorization.authorization();
        firstMenu.firstMenu(cardBase, hash, purchasesHashMap);
    }
}
