package Bank;

import Cards.GeneralCard;

public class Menu {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.createdCard();
        bank.viewCard();
        bank.removeCard();
        bank.viewCard();
    }
}
