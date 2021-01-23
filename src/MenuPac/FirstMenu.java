package MenuPac;

import Cards.GeneralCard;
import MenuPac.OperationsCard.ReplenishmentCard;

import java.util.HashMap;
import java.util.Scanner;

public class FirstMenu {
    public void firstMenu(CardBase base) {
        controlCardMenu controlCardMenu = new controlCardMenu();
        ReplenishmentCard replenishmentCard = new ReplenishmentCard();
        MenuList menuList = new MenuList();
        System.out.println("Добро пожаловать в мобильный банк!");
        System.out.println("----------------------------------------");
//        HashMapClass hashMapClass = new HashMapClass();
//        HashMap<Integer,GeneralCard> allCard = new HashMap<>();
//        allCard.put(12345678,new GeneralCard("Visa", 12345678,12,21,0));
        while (true) {
            Scanner sc = new Scanner(System.in);
            menuList.viewStartMenu();
            int v = sc.nextInt();
            switch (v) {
                case 1:
                    controlCardMenu.controlCardMenu(base);
                    break;
                case 2:
                    replenishmentCard.replenishmentCard(base.getAllCard());
                    break;
            }


        }
    }
}
