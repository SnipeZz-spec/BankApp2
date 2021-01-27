package MenuPac;

import MenuPac.Lists.RegularSpendingHash;
import MenuPac.PayOperations.RegularSpending;

public class MainMenu {
    public static void main(String[] args) {
        CardBase cardBase = new CardBase();
        RegularSpendingHash hash = new RegularSpendingHash();
        cardBase.unitDB();

        FirstMenu firstMenu = new FirstMenu();
        firstMenu.firstMenu(cardBase, hash);
    }
}
