package MenuPac;

import java.util.ArrayList;

public class menuList {

    public void viewStartMenu() {
        var startMenu = new ArrayList<>();
        startMenu.add("1.Управление картами");
        startMenu.add("2.Информация по картам и кошелькам");
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

        for (var s: controlMenu) {
            System.out.println(s);
        }
    }



}
