package MenuPac;

import MenuPac.Lists.PurchasesHashMap;
import MenuPac.Lists.RegularSpendingHash;


public class MainMenu {
    public static void main(String[] args) {
        CardBase cardBase = new CardBase();
        RegularSpendingHash hash = new RegularSpendingHash();
        PurchasesHashMap purchasesHashMap = new PurchasesHashMap();
        cardBase.unitDB();

        FirstMenu firstMenu = new FirstMenu();
        firstMenu.firstMenu(cardBase, hash, purchasesHashMap);
    }
}
