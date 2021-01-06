package MenuPac;

import Cards.GeneralCard;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstMenu {
    public void firstMenu() {
        menuList menuList = new menuList();
        System.out.println("Добро пожаловать в мобильный банк!");
        System.out.println("----------------------------------------");
        ArrayList<GeneralCard> allCard = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            menuList.viewStartMenu();
            int v = sc.nextInt();
            switch (v) {
                case 1:
            }


        }
    }
}
