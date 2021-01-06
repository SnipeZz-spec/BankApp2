package MenuPac;

import Cards.GeneralCard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FirstMenu {
    public void firstMenu() {
        controlCardMenu controlCardMenu = new controlCardMenu();
        menuList menuList = new menuList();
        System.out.println("Добро пожаловать в мобильный банк!");
        System.out.println("----------------------------------------");
        HashMap<Integer,Object> allCard = new HashMap<>();
//        ArrayList<GeneralCard> allCard = new ArrayList<>();
        while (true) {
            allCard.put(123456,new GeneralCard("Visa", 123546,54,45,0));
            Scanner sc = new Scanner(System.in);
            menuList.viewStartMenu();
            int v = sc.nextInt();
            switch (v) {
                case 1:controlCardMenu.controlCardMenu();
                break;
            }


        }
    }
}
