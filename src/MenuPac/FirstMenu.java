package MenuPac;

import Cards.GeneralCard;
import MenuPac.OperationsCard.ReplenishmentCard;

import java.util.HashMap;
import java.util.Scanner;

public class FirstMenu {
    public void firstMenu() {
        controlCardMenu controlCardMenu = new controlCardMenu();
        ReplenishmentCard replenishmentCard = new ReplenishmentCard();
        MenuList menuList = new MenuList();
        System.out.println("Добро пожаловать в мобильный банк!");
        System.out.println("----------------------------------------");
        HashMap<Integer,GeneralCard> allCard = new HashMap<>();
        allCard.put(12345678,new GeneralCard("Visa", 12345678,12,21,0));
        while (true) {
            Scanner sc = new Scanner(System.in);
            menuList.viewStartMenu();
            int v = sc.nextInt();
            switch (v) {
                case 1:
                    controlCardMenu.controlCardMenu(allCard);
                    break;
                case 2:
                    replenishmentCard.replenishmentCard(allCard);
                    break;
            }


        }
    }
}
