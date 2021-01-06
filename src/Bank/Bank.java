package Bank;

import Cards.GeneralCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    Scanner sc = new Scanner(System.in);
    public List<GeneralCard> allCards = new ArrayList<>();


    public void createdCard() {
        System.out.println("Вы вошли в меню создания карт");
        System.out.println("Введите название карты");
        String nameCard = sc.next();
        System.out.println("Введите номер карты");
        int numberCard = sc.nextInt();
        allCards.add(new GeneralCard(nameCard,numberCard,54,20,0));

    }
    public void viewCard(){
        System.out.println(allCards);
    }

    public void removeCard() {
        System.out.println("Ввеите карту, которую хотите удалить: ");
        var v = sc.nextInt();
        allCards.remove(v);
    }
}
