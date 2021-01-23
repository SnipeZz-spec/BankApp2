package MenuPac;

public class MainMenu {
    public static void main(String[] args) {
        CardBase cardBase = new CardBase();
        cardBase.unitDB();

        FirstMenu firstMenu = new FirstMenu();
        firstMenu.firstMenu(cardBase);
    }
}
