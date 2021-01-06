package MenuPac;

import Bank.Bank;
import Cards.GeneralCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class controlCardMenu {
    public void controlCardMenu(HashMap<Integer, GeneralCard> cardList) {
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
                        ArrayList<GeneralCard> values = new ArrayList<>(cardList.values());
                        System.out.println(values);
                        System.out.println("Введите номер карты, информацию по которой хотите получить");
                        var v1 = sc.nextInt();

                    }

            }
        }
    }
}
