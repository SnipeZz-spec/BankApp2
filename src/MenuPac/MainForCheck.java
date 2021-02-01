package MenuPac;

import MenuPac.Lists.RegularSpendingHash;

public class MainForCheck {
    public static void main(String[] args) {
        RegularSpendingHash hash = new RegularSpendingHash();

        hash.createRegularHash();
        hash.viewRegularHash();
    }
}
