package MenuPac;

import Cards.GeneralCard;
import MenuPac.Lists.RegularSpendingHash;
import MenuPac.Lists.Services;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class CardBase {
    private final HashMap<Integer, GeneralCard> allCard = new HashMap<>();

    public void unitDB() {
        allCard.put(12345678, new GeneralCard("Visa", 12345678, 12, 22,0));
        allCard.put(98745612, new GeneralCard("Maestro", 98745612, 12, 25, 5000));
    }

    public HashMap<Integer, GeneralCard> getAllCard() {
        return allCard;
    }


}
