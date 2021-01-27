package MenuPac.OperationsCard;

import Cards.GeneralCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class InformationOfCard {
    public void infOfCard(HashMap<Integer, GeneralCard> cardList) {
        if (cardList.isEmpty()) {
            System.out.println("У вас пока нет банковских карт");
        }
        else {
            cardList.forEach((k,v) -> System.out.println(v));
        }

    }
}
