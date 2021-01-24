package MenuPac;

import java.util.ArrayList;

public class MenuList {

    public void viewStartMenu() {
        var startMenu = new ArrayList<>();
        startMenu.add("1.Управление картами");
        startMenu.add("2.Пополнение карты");
        startMenu.add("3.Операция перевода");
        startMenu.add("0.Выход");

        for (var s:startMenu) {
            System.out.println(s);
        }
    }

    public void viewControlCard() {
        var controlMenu = new ArrayList<>();
        controlMenu.add("1.Информация о картах");
        controlMenu.add("2.Создание новой карты");
        controlMenu.add("3.Удаление карты");
        controlMenu.add("0.Выход");

        for (var s: controlMenu) {
            System.out.println(s);
        }
    }




    public void producerCard() {
        var prodCard = new ArrayList<>();
        prodCard.add("1.Visa Card");
        prodCard.add("2.Maestro Card");

        for (var s: prodCard) {
            System.out.println(s);
        }
    }


}
