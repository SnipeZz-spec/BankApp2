package MenuPac;

import Cards.GeneralCard;

import java.util.HashMap;

public class CardBase {
    private final HashMap<Integer, GeneralCard> allCard = new HashMap<>();

    public void unitDB() {
        allCard.put(12345678, new GeneralCard("Visa", 12345678, 12, 22,0));
    }

    public HashMap<Integer, GeneralCard> getAllCard() {
        return allCard;
    }
}
