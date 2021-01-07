package MenuPac;

import Cards.GeneralCard;

import java.util.HashMap;
import java.util.Scanner;

public class FirstMenu {
    public void firstMenu() {
        controlCardMenu controlCardMenu = new controlCardMenu();
        MenuList menuList = new MenuList();
        System.out.println("Добро пожаловать в мобильный банк!");
        System.out.println("----------------------------------------");
        HashMap<Integer,GeneralCard> allCard = new HashMap<>();
        while (true) {
            allCard.put(12345678,new GeneralCard("Visa", 12345678,54,45,0));
            Scanner sc = new Scanner(System.in);
            menuList.viewStartMenu();
            int v = sc.nextInt();
            switch (v) {
                case 1:controlCardMenu.controlCardMenu(allCard);
                break;
            }


        }
    }
}
