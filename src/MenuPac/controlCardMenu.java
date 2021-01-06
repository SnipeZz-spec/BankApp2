package MenuPac;

import Bank.Bank;
import Cards.GeneralCard;

import java.util.ArrayList;
import java.util.Scanner;

public class controlCardMenu {
    public void controlCardMenu(ArrayList<GeneralCard> cardList, GeneralCard generalCard) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            menuList menuList = new menuList();
            System.out.println("----------------------------------------");
            System.out.println("---Вы вошли в меню управления картами---");
            System.out.println("----------------------------------------");
            menuList.viewControlCard();
            var v = sc.nextInt();
            switch (v) {
                case 1:
                    if (cardList.isEmpty()) {
                        System.out.println("У вас пока нет созданных карт");
                        break;
                    }
                    else {
                        for (var s: cardList) {
                            System.out.println(s);
                        }
                        System.out.println("Информацию по какой карте вы хотите получить?");
                        var v1 = sc.nextInt();
                        switch (v1) {
                            case 1:
                                System.out.println();

                        }
                    }

            }
        }
    }
}
